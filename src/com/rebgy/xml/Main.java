package com.rebgy.xml;

import com.formdev.flatlaf.FlatDarkLaf;
import com.rebgy.xml.interfaces.Login;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(new FlatDarkLaf());
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        Login login = new Login();
        login.setVisible(true);
    }
}
