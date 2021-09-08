package com.rebgy.xml.clases;

import java.sql.*;

public class ManagerBD {
    
    public static Connection con = null;
    
    public static String usuario = "";
    public static int typeUser = 0;
    
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
            
            connect = con.isValid(50000);
            System.out.println(connect ? "Test ok" : "Test fail");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return connect;
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
