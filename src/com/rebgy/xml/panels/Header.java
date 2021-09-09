package com.rebgy.xml.panels;

import com.rebgy.xml.clases.ManagerBD;
import com.rebgy.xml.interfaces.Login;
import java.awt.Color;
import javax.swing.JFrame;

public class Header extends javax.swing.JPanel {

    JFrame parent;
    
    public Header(JFrame parent) {
        initComponents();
        this.parent = parent;
        titleLBL.setForeground(ColorUser());
        userLBL.setText(ManagerBD.usuario);
        typeLBL.setText(TypeUser());
    }
    public Color ColorUser(){
        if(ManagerBD.typeUser == 1)
            return Color.RED;
        else if(ManagerBD.typeUser == 2)
            return Color.BLUE;
        else if(ManagerBD.typeUser == 3)
            return Color.BLACK;
        
        return Color.BLACK;
    }
    public String TypeUser(){
        if(ManagerBD.typeUser == 1)
            return "Administrador";
        else if(ManagerBD.typeUser == 2){
            return "Cliente";
        }
        else if(ManagerBD.typeUser == 3){
            return "Empleado";
        }
        return "¡Conection Failed!";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLBL = new javax.swing.JLabel();
        typeLBL = new javax.swing.JLabel();
        userLBL = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titleLBL.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(0, 102, 204));
        titleLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLBL.setText("BANK SYSTEM");

        typeLBL.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        typeLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeLBL.setText("Tipo");

        userLBL.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        userLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLBL.setText("user");
        userLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userLBLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(typeLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userLBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLBLMouseClicked
        parent.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_userLBLMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel titleLBL;
    private javax.swing.JLabel typeLBL;
    private javax.swing.JLabel userLBL;
    // End of variables declaration//GEN-END:variables
}
