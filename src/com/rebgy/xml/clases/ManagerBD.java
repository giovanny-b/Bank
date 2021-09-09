package com.rebgy.xml.clases;

import java.sql.*;
import java.util.ArrayList;
import java.util.*;
import javax.swing.JOptionPane;

public class ManagerBD {
    
    public static Connection con = null;
    
    public static String usuario = "";
    public static int typeUser = 0;
    
    public static String database = "";
    public static String host = "";
    public static String port = "";
    public static String user = "";
    
    public static boolean connect(String host, String port, String database, String user, String pass){
        String url = "";
                
        boolean connect = false;
        
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            url = "jdbc:postgresql://" + host + ":" + port + "/" + database;

            con = DriverManager.getConnection(
                    url, user, pass
            );
            ManagerBD.host = host;
            ManagerBD.port = port;
            ManagerBD.database = database;
            ManagerBD.user = user;
            connect = con.isValid(50000);
            System.out.println(connect ? "Test ok" : "Test fail");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connect;
    }
    public static void disconnect(){
        try{
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static ArrayList<String> getTableName(){
        ArrayList<String> name = new ArrayList<>();
        try{
            DatabaseMetaData dmd = con.getMetaData();
            ResultSet rs = dmd.getTables(null, null, "%", new String[]{"TABLE"});
            while(rs.next()){
                name.add(rs.getString("TABLE_NAME"));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return name;
    }
    public static void Create(String name, String pass, int type){        
        try{
            PreparedStatement st = con.prepareStatement("INSERT INTO usuarios (name, pass, type) VALUES (?,?,?)");
            st.setString(1, name);
            st.setString(2, pass);
            st.setInt(3, type);
            
            st.execute();
            
            st.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    public static List<String> GetDataWithID(int id){
        ArrayList<String> data = new ArrayList<>();
        try{
            PreparedStatement st = con.prepareStatement("SELECT * FROM usuarios WHERE id = ?");
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                data.add(String.valueOf(rs.getInt("id")));
                data.add(rs.getString("name"));
                data.add(rs.getString("pass"));
                data.add(String.valueOf(rs.getInt("type")));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return data;
    }
    public static int SizeTable(String table){
        int size = 0;
        try{
            PreparedStatement st = con.prepareStatement("SELECT * FROM " + table);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                size++;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return size;
    }
    public static boolean Verify(String data){
        try{
            PreparedStatement st = con.prepareStatement("SELECT * FROM usuarios WHERE name = ?");
            st.setString(1, data);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                return true;
            }
            
            st.close();
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
        return false;
    }
    public static void CreateNewDataBase(String name){
        try{
            PreparedStatement st = con.prepareStatement("CREATE DATABASE " + name);
            st.execute();
            JOptionPane.showMessageDialog(null, "¡Exito!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public static void DeleteDataBase(String name){
        try{
            PreparedStatement st = con.prepareStatement("DROP DATABASE " + name);
            st.execute();
            JOptionPane.showMessageDialog(null, "¡Exito!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public static void DeleteTable(String name){
        try{
            PreparedStatement st = con.prepareStatement("DROP TABLE " + name);
            st.execute();
            JOptionPane.showMessageDialog(null, "¡Exito!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public static void CreateNewTable(String tableName, ArrayList<String> query){
        try{
            String queryString = "CREATE TABLE " + tableName + "("
                    + Funcion(query)
                    + ");";
            System.out.println(queryString);
            PreparedStatement st = con.prepareStatement(queryString);
            System.out.println(st.getResultSet());
            st.execute();
            System.out.println("OK.");
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    public static String Funcion(ArrayList<String> query){
        String datos = "";
        
        for(int i = 0; i < query.size(); i++){
            if(i < query.size()-1)
                datos += query.get(i) + ",";
            else
                datos += query.get(i);
            System.out.println("Tamaño " + i + " - " + query.get(i));
        }
        System.out.println(datos);
        return datos;
    }
    public static boolean Search(String name, String pass, int type){
        boolean ok = false;
        try{
            PreparedStatement st = con.prepareStatement("SELECT * FROM usuarios WHERE name = ? AND pass = ? AND type = ?");
            st.setString(1, name);
            st.setString(2, pass);
            st.setInt(3, type);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                usuario = rs.getString("name");
                typeUser = rs.getInt("type");
                ok = true;
            }
            
            st.close();
            rs.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return ok;
    }
}
