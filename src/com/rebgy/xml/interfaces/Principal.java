package com.rebgy.xml.interfaces;

import com.rebgy.xml.clases.ManagerBD;
import com.rebgy.xml.panels.AdministradorPanelPrincipal;
import com.rebgy.xml.panels.Foother;
import com.rebgy.xml.panels.Header;
import java.awt.BorderLayout;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        
        setTitle(ManagerBD.usuario + " Principal");
        
        backgroundPNL.setLayout(new BorderLayout());
        backgroundPNL.add(new Header(this), BorderLayout.NORTH);
        backgroundPNL.add(new Foother(), BorderLayout.SOUTH);
        
        backgroundPNL.repaint();
        backgroundPNL.updateUI();
        
        if(ManagerBD.typeUser == 1)
            backgroundPNL.add(new AdministradorPanelPrincipal(), BorderLayout.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPNL = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout backgroundPNLLayout = new javax.swing.GroupLayout(backgroundPNL);
        backgroundPNL.setLayout(backgroundPNLLayout);
        backgroundPNLLayout.setHorizontalGroup(
            backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        backgroundPNLLayout.setVerticalGroup(
            backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPNL;
    // End of variables declaration//GEN-END:variables
}
