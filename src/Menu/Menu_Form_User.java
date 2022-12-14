/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import Login.MyCNX;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Menu_Form_User extends javax.swing.JFrame {

    private Integer UserID;

    /**
     * Creates new form Menu_Form
     */
    public Menu_Form_User() {
        initComponents();
    }

    public void getUserProfileFromDatabase(String username) {
        //Set Fullname
        jTextField_Username.setText(username);
        jTextField_Username.setEditable(false);
        //Get the Data from each query
        PreparedStatement ps;
        ResultSet rs;
        try {
            String query = "select * from Users where Username =?";

            ps = MyCNX.getConnection().prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();

            if (rs.next()) {
                String Fullname = rs.getString("Fullname");
                String Job = rs.getString("Job");
                String Phone = rs.getString("Phone");
                String Address = rs.getString("Address");
                String Email = rs.getString("Email");
                jTextField_Fullname.setText(Fullname);
                jTextField_Fullname.setEditable(false);
                jTextField_Job.setText(Job);
                jTextField_Job.setEditable(false);
                jTextField_Phone.setText(Phone);
                jTextField_Phone.setEditable(false);
                jTextField_Email.setText(Email);
                jTextField_Email.setEditable(false);
                jTextField_Address.setText(Address);
                jTextField_Address.setEditable(false);

                UserID = rs.getInt("UserID");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getUserSalaryFromDatabase() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            jTable_Salary.setModel(new DefaultTableModel(null, new Object[]{"ID", "Date", "Base", "Bonus", "Tax Rate", "Total"}));
            String sql = "select * from Salary where UserID = ?";

            ps = MyCNX.getConnection().prepareStatement(sql);
            ps.setInt(1, UserID);
            rs = ps.executeQuery();

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("SalaryID"));
                String Date = String.valueOf(rs.getDate("Date"));
                String Base = String.valueOf(rs.getFloat("Base"));
                String Bonus = String.valueOf(rs.getFloat("Bonus"));
                String TaxRate = String.valueOf(rs.getFloat("Tax_Rate"));
                String Total = String.valueOf(rs.getFloat("Total"));
                Object tbData[] = {id, Date, Base, Bonus, TaxRate, Total};
                DefaultTableModel tblModel = (DefaultTableModel) jTable_Salary.getModel();
                tblModel.addRow(tbData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
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

        jPanel = new javax.swing.JPanel();
        JPanel_UserProfile = new javax.swing.JPanel();
        jLabel_UserProfile = new javax.swing.JLabel();
        jButton_EditUserProfile = new javax.swing.JButton();
        jButton_RefreshProfile = new javax.swing.JButton();
        jPanel_UserInfo = new javax.swing.JPanel();
        jLabel_UserName = new javax.swing.JLabel();
        jLabel_Fullname = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Job = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jTextField_Fullname = new javax.swing.JTextField();
        jTextField_Phone = new javax.swing.JTextField();
        jTextField_Job = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_Address = new javax.swing.JTextField();
        jPanel_TaxCalculation = new javax.swing.JPanel();
        jLabel_TaxCalculationTable = new javax.swing.JLabel();
        jButton_Add = new javax.swing.JButton();
        jButton_Refresh = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jScrollPane_TaxCalculationTable = new javax.swing.JScrollPane();
        jTable_Salary = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(248, 148, 6));

        jPanel.setBackground(new java.awt.Color(248, 148, 6));

        JPanel_UserProfile.setBackground(new java.awt.Color(248, 148, 6));

        jLabel_UserProfile.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel_UserProfile.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_UserProfile.setText("User Profile");

        jButton_EditUserProfile.setText("Edit");
        jButton_EditUserProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_EditUserProfileMouseClicked(evt);
            }
        });

        jButton_RefreshProfile.setText("Refresh");
        jButton_RefreshProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RefreshProfileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanel_UserProfileLayout = new javax.swing.GroupLayout(JPanel_UserProfile);
        JPanel_UserProfile.setLayout(JPanel_UserProfileLayout);
        JPanel_UserProfileLayout.setHorizontalGroup(
            JPanel_UserProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_UserProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_UserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(jButton_RefreshProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_EditUserProfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel_UserProfileLayout.setVerticalGroup(
            JPanel_UserProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_UserProfileLayout.createSequentialGroup()
                .addComponent(jLabel_UserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JPanel_UserProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_UserProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_EditUserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_RefreshProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel_UserInfo.setBackground(new java.awt.Color(44, 62, 80));

        jLabel_UserName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_UserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_UserName.setText("Username");

        jLabel_Fullname.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Fullname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Fullname.setText("Full Name");
        jLabel_Fullname.setMaximumSize(new java.awt.Dimension(53, 16));
        jLabel_Fullname.setMinimumSize(new java.awt.Dimension(53, 16));
        jLabel_Fullname.setPreferredSize(new java.awt.Dimension(53, 16));

        jLabel_Phone.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Phone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Phone.setText("Phone");

        jLabel_Job.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Job.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Job.setText("Job");

        jLabel_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Email.setText("Email");
        jLabel_Email.setMaximumSize(new java.awt.Dimension(53, 16));
        jLabel_Email.setMinimumSize(new java.awt.Dimension(53, 16));
        jLabel_Email.setPreferredSize(new java.awt.Dimension(53, 16));

        jLabel_Address.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Address.setText("Address");

        javax.swing.GroupLayout jPanel_UserInfoLayout = new javax.swing.GroupLayout(jPanel_UserInfo);
        jPanel_UserInfo.setLayout(jPanel_UserInfoLayout);
        jPanel_UserInfoLayout.setHorizontalGroup(
            jPanel_UserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_UserInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_UserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel_UserInfoLayout.createSequentialGroup()
                        .addComponent(jLabel_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Address))
                    .addGroup(jPanel_UserInfoLayout.createSequentialGroup()
                        .addGroup(jPanel_UserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jLabel_Fullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_UserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_UserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_UserInfoLayout.createSequentialGroup()
                                .addGroup(jPanel_UserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_UserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel_UserInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel_UserInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel_Job, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_Job))))
                            .addComponent(jTextField_Email))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_UserInfoLayout.setVerticalGroup(
            jPanel_UserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_UserInfoLayout.createSequentialGroup()
                .addGroup(jPanel_UserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_UserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Fullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Job, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Job, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_UserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel_TaxCalculation.setBackground(new java.awt.Color(248, 148, 6));

        jLabel_TaxCalculationTable.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel_TaxCalculationTable.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TaxCalculationTable.setText("Tax Calculation");

        jButton_Add.setText("Add");
        jButton_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_AddMouseClicked(evt);
            }
        });

        jButton_Refresh.setText("Refresh");
        jButton_Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RefreshMouseClicked(evt);
            }
        });

        jButton_Delete.setText("Delete");
        jButton_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_DeleteMouseClicked(evt);
            }
        });

        jButton_Update.setText("Update");
        jButton_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_UpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_TaxCalculationLayout = new javax.swing.GroupLayout(jPanel_TaxCalculation);
        jPanel_TaxCalculation.setLayout(jPanel_TaxCalculationLayout);
        jPanel_TaxCalculationLayout.setHorizontalGroup(
            jPanel_TaxCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TaxCalculationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TaxCalculationTable, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jButton_Refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TaxCalculationLayout.setVerticalGroup(
            jPanel_TaxCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TaxCalculationLayout.createSequentialGroup()
                .addComponent(jLabel_TaxCalculationTable, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel_TaxCalculationLayout.createSequentialGroup()
                .addGroup(jPanel_TaxCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Refresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTable_Salary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Base", "Bonus", "Tax Rate", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane_TaxCalculationTable.setViewportView(jTable_Salary);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_TaxCalculation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane_TaxCalculationTable, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JPanel_UserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_UserInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(JPanel_UserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_UserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_TaxCalculation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_TaxCalculationTable, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AddMouseClicked
        // TODO add your handling code here:
        User_Data_Add add = new User_Data_Add();
        add.getUserID(UserID);
        add.setVisible(true);
        add.pack();
    }//GEN-LAST:event_jButton_AddMouseClicked

    private void jButton_RefreshProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RefreshProfileMouseClicked
        // TODO add your handling code here:
        PreparedStatement ps;
        ResultSet rs;
        try {
            String query = "select * from Users where UserID =?";

            ps = MyCNX.getConnection().prepareStatement(query);
            ps.setInt(1, UserID);
            rs = ps.executeQuery();

            if (rs.next()) {
                String Fullname = rs.getString("Fullname");
                String Job = rs.getString("Job");
                String Phone = rs.getString("Phone");
                String Address = rs.getString("Address");
                String Email = rs.getString("Email");
                jTextField_Fullname.setText(Fullname);
                jTextField_Fullname.setEditable(false);
                jTextField_Job.setText(Job);
                jTextField_Job.setEditable(false);
                jTextField_Phone.setText(Phone);
                jTextField_Phone.setEditable(false);
                jTextField_Email.setText(Email);
                jTextField_Email.setEditable(false);
                jTextField_Address.setText(Address);
                jTextField_Address.setEditable(false);

                UserID = rs.getInt("UserID");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_RefreshProfileMouseClicked

    private void jButton_EditUserProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_EditUserProfileMouseClicked
        // TODO add your handling code here:
        User_Profile_Edit edit = new User_Profile_Edit();
        edit.setVisible(true);
        edit.pack();
        edit.getUsername(UserID);
        edit.getDataFromDatabase();
    }//GEN-LAST:event_jButton_EditUserProfileMouseClicked

    private void jButton_RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RefreshMouseClicked
        // TODO add your handling code here:
        getUserSalaryFromDatabase();
    }//GEN-LAST:event_jButton_RefreshMouseClicked

    private void jButton_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_DeleteMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) jTable_Salary.getModel();
        int getSelectedRowForDeletion = jTable_Salary.getSelectedRow();
        String deletedRows = jTable_Salary.getModel().getValueAt(getSelectedRowForDeletion, 0).toString();

        if (getSelectedRowForDeletion >= 0) {
            tblModel.removeRow(getSelectedRowForDeletion);
            PreparedStatement ps;

            try {
                String query = "delete from Salary where SalaryID =" + deletedRows;

                ps = MyCNX.getConnection().prepareStatement(query);
                ps.execute();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton_DeleteMouseClicked

    private void jButton_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdateMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) jTable_Salary.getModel();
        if (tblModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Table is Empty");
        } else {
            for (int i = 0; i < tblModel.getRowCount(); i++) {
                Integer salaryId = Integer.valueOf(tblModel.getValueAt(i, 0).toString());
                String date = tblModel.getValueAt(i, 1).toString();
                String base = tblModel.getValueAt(i, 2).toString();
                String bonus = tblModel.getValueAt(i, 3).toString();
                String taxrate = tblModel.getValueAt(i, 4).toString();
                String total = tblModel.getValueAt(i, 5).toString();
                String query = "update Salary "
                        + "Set Date = ?, Base = ?, Bonus = ?, Tax_Rate = ? "
                        + "where UserID = ? and SalaryID = ?";

                PreparedStatement ps;
                try {
                    ps = MyCNX.getConnection().prepareStatement(query);
                    ps.setString(1, date);
                    ps.setString(2, base);
                    ps.setString(3, bonus);
                    ps.setString(4, taxrate);
                    ps.setInt(5, UserID);
                    ps.setInt(6, salaryId);
                    ps.execute();
                } catch (SQLException ex) {
                    Logger.getLogger(Menu_Form_User.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_jButton_UpdateMouseClicked

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
            java.util.logging.Logger.getLogger(Menu_Form_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Form_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Form_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Form_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu_Form_User().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_UserProfile;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_EditUserProfile;
    private javax.swing.JButton jButton_Refresh;
    private javax.swing.JButton jButton_RefreshProfile;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Fullname;
    private javax.swing.JLabel jLabel_Job;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JLabel jLabel_TaxCalculationTable;
    private javax.swing.JLabel jLabel_UserName;
    private javax.swing.JLabel jLabel_UserProfile;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel_TaxCalculation;
    private javax.swing.JPanel jPanel_UserInfo;
    private javax.swing.JScrollPane jScrollPane_TaxCalculationTable;
    private javax.swing.JTable jTable_Salary;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Fullname;
    private javax.swing.JTextField jTextField_Job;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
