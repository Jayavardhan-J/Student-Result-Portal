/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.student_result_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


/**
 *
 * @author Jayav
 */
public class registeredStudents extends javax.swing.JFrame {

    /**
     * Creates new form registeredStudents
     */
    public registeredStudents() {
        initComponents();
        TableColumnModel columnModel = registeredTable.getColumnModel();
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(5).setPreferredWidth(150);
        showFunc();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        registeredTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addStudent = new javax.swing.JButton();
        insertResult = new javax.swing.JButton();
        registerStudent = new javax.swing.JButton();
        allStudentResult = new javax.swing.JButton();
        logOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registered Students");
        setBackground(new java.awt.Color(102, 102, 255));
        setLocation(new java.awt.Point(450, 150));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(64, 81, 78));
        jPanel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel5ComponentShown(evt);
            }
        });

        registeredTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "rollno", "course", "branch", "name", "gender", "father's name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        registeredTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                registeredTableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(registeredTable);

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 204, 255));
        jLabel2.setText("Details Of All Students");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(111, 111, 111))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 490, 500));

        jPanel1.setBackground(new java.awt.Color(14, 162, 147));

        addStudent.setBackground(new java.awt.Color(0, 66, 90));
        addStudent.setForeground(new java.awt.Color(102, 204, 255));
        addStudent.setIcon(new javax.swing.ImageIcon("D:\\Java project\\NetBeans\\Student_result_management_system\\Assets\\student_add.png")); // NOI18N
        addStudent.setText(" Add new student");
        addStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        insertResult.setBackground(new java.awt.Color(0, 66, 90));
        insertResult.setForeground(new java.awt.Color(102, 204, 255));
        insertResult.setIcon(new javax.swing.ImageIcon("D:\\Java project\\NetBeans\\Student_result_management_system\\Assets\\add_result.png")); // NOI18N
        insertResult.setText(" Insert New Result");
        insertResult.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        insertResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertResultActionPerformed(evt);
            }
        });

        registerStudent.setBackground(new java.awt.Color(204, 255, 255));
        registerStudent.setForeground(new java.awt.Color(0, 0, 0));
        registerStudent.setIcon(new javax.swing.ImageIcon("D:\\Java project\\NetBeans\\Student_result_management_system\\Assets\\registered.png")); // NOI18N
        registerStudent.setText(" Registered Students");
        registerStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registerStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerStudentActionPerformed(evt);
            }
        });

        allStudentResult.setBackground(new java.awt.Color(0, 66, 90));
        allStudentResult.setForeground(new java.awt.Color(102, 204, 255));
        allStudentResult.setIcon(new javax.swing.ImageIcon("D:\\Java project\\NetBeans\\Student_result_management_system\\Assets\\rankings.png")); // NOI18N
        allStudentResult.setText(" All Student Result");
        allStudentResult.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        allStudentResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudentResultActionPerformed(evt);
            }
        });

        logOut.setBackground(new java.awt.Color(255, 0, 51));
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setIcon(new javax.swing.ImageIcon("D:\\Java project\\NetBeans\\Student_result_management_system\\Assets\\logout.png")); // NOI18N
        logOut.setText(" Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertResult, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allStudentResult, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(insertResult, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(registerStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(allStudentResult, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        setVisible(false);
        new index().setVisible(true);
    }//GEN-LAST:event_addStudentActionPerformed

    private void insertResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertResultActionPerformed
        setVisible(false);
        new insertResult().setVisible(true);
    }//GEN-LAST:event_insertResultActionPerformed

    private void registerStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerStudentActionPerformed
        setVisible(false);
        new registeredStudents().setVisible(true);
    }//GEN-LAST:event_registerStudentActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        setVisible(false);
        new adminIndex().setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed

    private void registeredTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_registeredTableComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_registeredTableComponentShown

    private void jPanel5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel5ComponentShown
        
        
    }//GEN-LAST:event_jPanel5ComponentShown

    private void allStudentResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudentResultActionPerformed
        setVisible(false);
        new allStudentResult().setVisible(true);
    }//GEN-LAST:event_allStudentResultActionPerformed
    public void showFunc(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/srm","root","Vardhan123");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from student");
            //registeredTable.setModel(DbUtils.resultSetToTableModel(rs));
            ResultSetMetaData RSMD= rs.getMetaData();
            int colCount=RSMD.getColumnCount();
            DefaultTableModel DFT=(DefaultTableModel) registeredTable.getModel();
            DFT.setRowCount(0);
            
           while(rs.next())
            {
            Vector vec=new Vector();
            for(int i=1;i<=colCount;i++)
            {
                vec.add(rs.getString("rollno"));
                vec.add(rs.getString("course"));
                vec.add(rs.getString("branch"));
                vec.add(rs.getString("name"));
                vec.add(rs.getString("gender"));
                vec.add(rs.getString("fathername"));
                
                
            }
            DFT.addRow(vec);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }
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
            java.util.logging.Logger.getLogger(registeredStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registeredStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registeredStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registeredStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registeredStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudent;
    private javax.swing.JButton allStudentResult;
    private javax.swing.JButton insertResult;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOut;
    private javax.swing.JButton registerStudent;
    private javax.swing.JTable registeredTable;
    // End of variables declaration//GEN-END:variables
}
