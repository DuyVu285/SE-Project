/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import Login.MyCNX;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class User_Data_Add extends javax.swing.JFrame {

    private Integer UserID;

    /**
     * Creates new form User_Data_Add
     */
    public User_Data_Add() {
        initComponents();
    }

    //public void date() {
    //   String txtDate = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH).format(new Date());
    //    txtDate.setText(txtDate);
    //}
    public void getUserID(Integer id) {
        UserID = id;
    }

    private void addData() {
        String date = jTextField_Date.getText().trim();
        String base = jTextField_Base.getText();
        String bonus = jTextField_Bonus.getText();
        String taxrate = jTextField_TaxRate.getText();
        String total = jTextField_Total.getText();

        PreparedStatement ps;
        ResultSet rs;
        try {
            String sql = "insert into Salary(UserID,Date,Base,Bonus,Tax_Rate,Total) values (?,?,?,?,?,?)";

            ps = MyCNX.getConnection().prepareStatement(sql);
            ps.setInt(1, UserID);
            ps.setString(2, date);
            ps.setString(3, base);
            ps.setString(4, bonus);
            ps.setString(5, taxrate);
            ps.setString(6, total);            
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Your Data Has Been Added");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Error: Check Your Information");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getTaxRate() {
        float tempTotal = Float.parseFloat(jTextField_Base.getText()) + Float.parseFloat(jTextField_Bonus.getText());
        PreparedStatement ps;
        ResultSet rs;
        try {
            String sql = "select Tax_Rate from Tax where ? between Lower_Limit and Upper_Limit";

            ps = MyCNX.getConnection().prepareStatement(sql);
            ps.setFloat(1, tempTotal);
            rs = ps.executeQuery();

            if (rs.next()) {
                String taxRate = rs.getString("Tax_Rate");
                jTextField_TaxRate.setText(taxRate);
                jTextField_TaxRate.setEditable(false);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getTotal() {
        if (!jTextField_Base.getText().isEmpty() && !jTextField_Bonus.getText().isEmpty() && !jTextField_TaxRate.getText().isEmpty()) {
            float total = (Float.parseFloat(jTextField_Base.getText()) + Float.parseFloat(jTextField_Bonus.getText()))-((Float.parseFloat(jTextField_Base.getText()) + Float.parseFloat(jTextField_Bonus.getText())) * Float.parseFloat(jTextField_TaxRate.getText()));
            String totalText = Float.toString(total);
            jTextField_Total.setText(totalText);
            jTextField_Total.setEditable(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_UserAdd = new javax.swing.JPanel();
        jPanel_UserAddHeader = new javax.swing.JPanel();
        jLabel_UserAddTitle = new javax.swing.JLabel();
        jPanel_UserAddPanel = new javax.swing.JPanel();
        jLabel_Date = new javax.swing.JLabel();
        jLabel_Base = new javax.swing.JLabel();
        jLabel_Bonus = new javax.swing.JLabel();
        jLabel_TaxRate = new javax.swing.JLabel();
        jLabel_Total = new javax.swing.JLabel();
        jTextField_Date = new javax.swing.JTextField();
        jTextField_Base = new javax.swing.JTextField();
        jTextField_Bonus = new javax.swing.JTextField();
        jTextField_TaxRate = new javax.swing.JTextField();
        jTextField_Total = new javax.swing.JTextField();
        jButton_Add = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_UserAddHeader.setBackground(new java.awt.Color(248, 148, 6));

        jLabel_UserAddTitle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel_UserAddTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_UserAddTitle.setText("User Data Add");

        javax.swing.GroupLayout jPanel_UserAddHeaderLayout = new javax.swing.GroupLayout(jPanel_UserAddHeader);
        jPanel_UserAddHeader.setLayout(jPanel_UserAddHeaderLayout);
        jPanel_UserAddHeaderLayout.setHorizontalGroup(
            jPanel_UserAddHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_UserAddHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_UserAddTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_UserAddHeaderLayout.setVerticalGroup(
            jPanel_UserAddHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_UserAddHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_UserAddTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel_UserAddPanel.setBackground(new java.awt.Color(44, 62, 80));
        jPanel_UserAddPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_UserAddPanelMouseClicked(evt);
            }
        });

        jLabel_Date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Date.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Date.setText("Date");

        jLabel_Base.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Base.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Base.setText("Base");

        jLabel_Bonus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Bonus.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Bonus.setText("Bonus");

        jLabel_TaxRate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_TaxRate.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TaxRate.setText("Tax Rate");

        jLabel_Total.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Total.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Total.setText("Total");

        jTextField_Base.setText("0");
        jTextField_Base.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_BaseFocusLost(evt);
            }
        });

        jTextField_Bonus.setText("0");
        jTextField_Bonus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_BonusFocusLost(evt);
            }
        });

        jTextField_TaxRate.setText("0");

        jButton_Add.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Add.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jButton_Add.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add.setText("Add");
        jButton_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_AddMouseClicked(evt);
            }
        });

        jButton_Cancel.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Cancel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jButton_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cancel.setText("Cancel");
        jButton_Cancel.setToolTipText("");
        jButton_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_UserAddPanelLayout = new javax.swing.GroupLayout(jPanel_UserAddPanel);
        jPanel_UserAddPanel.setLayout(jPanel_UserAddPanelLayout);
        jPanel_UserAddPanelLayout.setHorizontalGroup(
            jPanel_UserAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_UserAddPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel_UserAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_UserAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel_Bonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Date, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addComponent(jLabel_Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_UserAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel_Total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_TaxRate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UserAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_TaxRate, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Bonus, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_UserAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_Date)
                        .addComponent(jTextField_Base, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                    .addComponent(jTextField_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(jPanel_UserAddPanelLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        jPanel_UserAddPanelLayout.setVerticalGroup(
            jPanel_UserAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_UserAddPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel_UserAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UserAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Base, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Base))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UserAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_Bonus, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel_Bonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78)
                .addGroup(jPanel_UserAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TaxRate)
                    .addComponent(jTextField_TaxRate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_UserAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Total))
                .addGap(48, 48, 48)
                .addGroup(jPanel_UserAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout jPanel_UserAddLayout = new javax.swing.GroupLayout(jPanel_UserAdd);
        jPanel_UserAdd.setLayout(jPanel_UserAddLayout);
        jPanel_UserAddLayout.setHorizontalGroup(
            jPanel_UserAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_UserAddHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_UserAddPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_UserAddLayout.setVerticalGroup(
            jPanel_UserAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_UserAddLayout.createSequentialGroup()
                .addComponent(jPanel_UserAddHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_UserAddPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_UserAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_UserAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CancelMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_CancelMouseClicked

    private void jTextField_BonusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_BonusFocusLost
        // TODO add your handling code here:
        getTaxRate();
        getTotal();
    }//GEN-LAST:event_jTextField_BonusFocusLost

    private void jPanel_UserAddPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_UserAddPanelMouseClicked
        // TODO add your handling code here:
        getTaxRate();
        getTotal();
    }//GEN-LAST:event_jPanel_UserAddPanelMouseClicked

    private void jTextField_BaseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_BaseFocusLost
        // TODO add your handling code here:
        getTaxRate();
    }//GEN-LAST:event_jTextField_BaseFocusLost

    private void jButton_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AddMouseClicked
        // TODO add your handling code here:
        addData();
    }//GEN-LAST:event_jButton_AddMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_Data_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Data_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Data_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Data_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new User_Data_Add().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JLabel jLabel_Base;
    private javax.swing.JLabel jLabel_Bonus;
    private javax.swing.JLabel jLabel_Date;
    private javax.swing.JLabel jLabel_TaxRate;
    private javax.swing.JLabel jLabel_Total;
    private javax.swing.JLabel jLabel_UserAddTitle;
    private javax.swing.JPanel jPanel_UserAdd;
    private javax.swing.JPanel jPanel_UserAddHeader;
    private javax.swing.JPanel jPanel_UserAddPanel;
    private javax.swing.JTextField jTextField_Base;
    private javax.swing.JTextField jTextField_Bonus;
    private javax.swing.JTextField jTextField_Date;
    private javax.swing.JTextField jTextField_TaxRate;
    private javax.swing.JTextField jTextField_Total;
    // End of variables declaration//GEN-END:variables
}
