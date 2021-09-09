package com.rebgy.xml.panels;

import com.rebgy.xml.clases.ManagerBD;
import com.rebgy.xml.clases.RowValues;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdministradorPanelPrincipal extends javax.swing.JPanel {

    public int numRow = 0;

    private RowValues row;

    public AdministradorPanelPrincipal() {
        initComponents();
        status();
        addTableManager();
    }

    public void addTableManager() {
        for (int i = 0; i < ManagerBD.getTableName().size(); i++) {
            TabedPanel.addTab(ManagerBD.getTableName().get(i), new ManagerTables(ManagerBD.getTableName().get(i)));
            TabedPanel.repaint();
            TabedPanel.updateUI();
        }
    }

    public void addTableManager(String name) {
        TabedPanel.addTab(name, new ManagerTables(name));
        TabedPanel.repaint();
        TabedPanel.updateUI();
    }

    public void status() {
        databaseLBL.setText("Database: " + ManagerBD.database);
        hostLBL.setText("Host: " + ManagerBD.host);
        portLBL.setText("Port: " + ManagerBD.port);
        userLBL.setText("User: " + ManagerBD.user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabedPanel = new javax.swing.JTabbedPane();
        ajustesPNL = new javax.swing.JPanel();
        createDB = new javax.swing.JButton();
        deleteDataBase = new javax.swing.JButton();
        deleteTable = new javax.swing.JButton();
        connectDataBase = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        addTable = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tableName = new javax.swing.JTextField();
        newRowBTN = new javax.swing.JButton();
        applyBTN = new javax.swing.JButton();
        databaseLBL = new javax.swing.JLabel();
        hostLBL = new javax.swing.JLabel();
        portLBL = new javax.swing.JLabel();
        userLBL = new javax.swing.JLabel();

        createDB.setText("Create Data Base");
        createDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDBActionPerformed(evt);
            }
        });

        deleteDataBase.setText("Delete Data Base");
        deleteDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDataBaseActionPerformed(evt);
            }
        });

        deleteTable.setText("Delete Table");
        deleteTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTableActionPerformed(evt);
            }
        });

        connectDataBase.setText("Connect Data Base");
        connectDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectDataBaseActionPerformed(evt);
            }
        });

        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(10);
        addTable.setLayout(verticalLayout1);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Table Name: ");
        addTable.add(jLabel3);
        addTable.add(tableName);

        newRowBTN.setText("New Row");
        newRowBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRowBTNActionPerformed(evt);
            }
        });
        addTable.add(newRowBTN);

        applyBTN.setText("Apply");
        applyBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyBTNActionPerformed(evt);
            }
        });
        addTable.add(applyBTN);

        jScrollPane3.setViewportView(addTable);

        databaseLBL.setText("Database Connected");

        hostLBL.setText("Host");

        portLBL.setText("Port");

        userLBL.setText("user");

        javax.swing.GroupLayout ajustesPNLLayout = new javax.swing.GroupLayout(ajustesPNL);
        ajustesPNL.setLayout(ajustesPNLLayout);
        ajustesPNLLayout.setHorizontalGroup(
            ajustesPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajustesPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ajustesPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ajustesPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(deleteTable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteDataBase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(connectDataBase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ajustesPNLLayout.createSequentialGroup()
                        .addComponent(databaseLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hostLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(portLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(528, Short.MAX_VALUE))
            .addGroup(ajustesPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajustesPNLLayout.createSequentialGroup()
                    .addGap(0, 843, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ajustesPNLLayout.setVerticalGroup(
            ajustesPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajustesPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createDB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteDataBase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(connectDataBase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addGroup(ajustesPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(databaseLBL)
                    .addComponent(hostLBL)
                    .addComponent(portLBL)
                    .addComponent(userLBL)))
            .addGroup(ajustesPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
        );

        TabedPanel.addTab("Ajustes", ajustesPNL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabedPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabedPanel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void applyBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyBTNActionPerformed
        ArrayList<String> query = new ArrayList<>();
        for (int i = 0; i < row.name.size(); i++) {
            query.add(row.name.get(i) + " " + (row.serial.get(i) ? "serial" : row.type.get(i)) + (row.notNull.get(i) ? "NOT NULL" : ""));
        }
        ManagerBD.CreateNewTable(tableName.getText(), query);
        addTableManager(tableName.getText());
    }//GEN-LAST:event_applyBTNActionPerformed

    private void newRowBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRowBTNActionPerformed
        RowValues.init(numRow);
        addTable.add(new RowPanel(numRow));
        addTable.add(newRowBTN);
        addTable.add(applyBTN);
        addTable.updateUI();
        addTable.repaint();
        numRow++;
    }//GEN-LAST:event_newRowBTNActionPerformed

    private void connectDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectDataBaseActionPerformed
        String name = JOptionPane.showInputDialog("Base de datos");
        String host = JOptionPane.showInputDialog("Host");
        String port = JOptionPane.showInputDialog("Port");
        String user = JOptionPane.showInputDialog("Usuer");
        String pass = JOptionPane.showInputDialog("Password");
        if (ManagerBD.connect(host, port, name, user, pass)) {
            JOptionPane.showMessageDialog(null, "¡Conectado!");
        } else {
            JOptionPane.showMessageDialog(null, "¡Algo a salido mal!");
        }
        status();
        
        
    }//GEN-LAST:event_connectDataBaseActionPerformed

    private void deleteTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTableActionPerformed
        String name = JOptionPane.showInputDialog("Table Name");
        ManagerBD.DeleteTable(name);
    }//GEN-LAST:event_deleteTableActionPerformed

    private void deleteDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDataBaseActionPerformed
        String name = JOptionPane.showInputDialog("Base de datos");
        ManagerBD.DeleteDataBase(name);
    }//GEN-LAST:event_deleteDataBaseActionPerformed

    private void createDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDBActionPerformed
        String name = JOptionPane.showInputDialog("Nombre la nueva base de datos");
        ManagerBD.CreateNewDataBase(name);
        ManagerBD.connect("localhost", "5432", name, "rebgy", "Giovanny1096539141");
        status();
    }//GEN-LAST:event_createDBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabedPanel;
    private javax.swing.JPanel addTable;
    private javax.swing.JPanel ajustesPNL;
    private javax.swing.JButton applyBTN;
    private javax.swing.JButton connectDataBase;
    private javax.swing.JButton createDB;
    private javax.swing.JLabel databaseLBL;
    private javax.swing.JButton deleteDataBase;
    private javax.swing.JButton deleteTable;
    private javax.swing.JLabel hostLBL;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton newRowBTN;
    private javax.swing.JLabel portLBL;
    private javax.swing.JTextField tableName;
    private javax.swing.JLabel userLBL;
    // End of variables declaration//GEN-END:variables
}
