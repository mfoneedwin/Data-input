package appPackage;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

public class SettingGUI extends javax.swing.JFrame {

    public SettingGUI() {
        initComponents();
        GenerateListCourse();
        GenerateListMajor();
        majorList();
        teacherList();
        
        PanelAddTeacher2.setVisible(false);
        PanelAddTeacher1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        togglAdd1 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JButton();
        PanelAddTeacher1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        majorName = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        saveBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MajorTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        togglAdd2 = new javax.swing.JToggleButton();
        jButton4 = new javax.swing.JButton();
        PanelAddTeacher2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        CourseName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        majorCombo = new javax.swing.JComboBox();
        jButton11 = new javax.swing.JButton();
        saveBtn2 = new javax.swing.JButton();
        teacherCombo = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        CourseTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Options");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        togglAdd1.setText("Add");
        togglAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togglAdd1ActionPerformed(evt);
            }
        });
        jPanel2.add(togglAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 70, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 70, -1));

        PanelAddTeacher1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add"));
        PanelAddTeacher1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Major:");
        PanelAddTeacher1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        PanelAddTeacher1.add(majorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 120, -1));

        jButton9.setText("Cancel");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        PanelAddTeacher1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 73, -1));

        saveBtn1.setText("Save");
        saveBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtn1ActionPerformed(evt);
            }
        });
        PanelAddTeacher1.add(saveBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 71, -1));

        jPanel2.add(PanelAddTeacher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 260, 100));

        MajorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MajorTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(MajorTable);
        if (MajorTable.getColumnModel().getColumnCount() > 0) {
            MajorTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 90));

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Majors", jScrollPane2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        togglAdd2.setText("Add");
        togglAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togglAdd2ActionPerformed(evt);
            }
        });
        jPanel3.add(togglAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 70, -1));

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 70, -1));

        PanelAddTeacher2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add"));
        PanelAddTeacher2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Name:");
        PanelAddTeacher2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        PanelAddTeacher2.add(CourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 180, -1));

        jLabel11.setText("Teacher:");
        PanelAddTeacher2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel12.setText("Major:");
        PanelAddTeacher2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        PanelAddTeacher2.add(majorCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 84, 180, -1));

        jButton11.setText("Cancel");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        PanelAddTeacher2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 73, -1));

        saveBtn2.setText("Save");
        saveBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtn2ActionPerformed(evt);
            }
        });
        PanelAddTeacher2.add(saveBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 71, -1));

        PanelAddTeacher2.add(teacherCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 180, -1));

        jPanel3.add(PanelAddTeacher2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 310, 150));

        CourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CourseTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(CourseTable);
        if (CourseTable.getColumnModel().getColumnCount() > 0) {
            CourseTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 90));

        jScrollPane3.setViewportView(jPanel3);

        jTabbedPane1.addTab("Courses", jScrollPane3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void teacherList(){
        MyDatabase db = new MyDatabase();
        ArrayList<String> ls = db.getTeachers();
        teacherCombo.setModel(new DefaultComboBoxModel(ls.toArray()));        
    }
    
    public void majorList(){
        MyDatabase db = new MyDatabase();
        ArrayList<String> ls = db.getMajor();
        majorCombo.setModel(new DefaultComboBoxModel(ls.toArray()));        
    }
    
    private void GenerateListCourse(){
        MyDatabase db = new MyDatabase();        
        DefaultTableModel model2 = (DefaultTableModel) CourseTable.getModel();        
        model2.setRowCount(0);        
        String sql2 = "select Name from Courses";        
        db.tableSetting(sql2, model2);
    }
    public void GenerateListMajor(){
        MyDatabase db = new MyDatabase();
        DefaultTableModel model = (DefaultTableModel) MajorTable.getModel();
        model.setRowCount(0);
        String sql = "select Name from Major";
        db.tableSetting(sql, model);
    }
    
    private void togglAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togglAdd1ActionPerformed
        JToggleButton btn = (JToggleButton) evt.getSource(); 
        if (btn.isSelected()) { 
            PanelAddTeacher1.setVisible(true);
        } else { 
            PanelAddTeacher1.setVisible(false);
        } 
    }//GEN-LAST:event_togglAdd1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        PanelAddTeacher1.setVisible(false);
        togglAdd1.setSelected(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void togglAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togglAdd2ActionPerformed
        JToggleButton btn = (JToggleButton) evt.getSource(); 
        if (btn.isSelected()) { 
            PanelAddTeacher2.setVisible(true);
        } else { 
            PanelAddTeacher2.setVisible(false);
        } 
    }//GEN-LAST:event_togglAdd2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        PanelAddTeacher2.setVisible(false);
        togglAdd2.setSelected(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void saveBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtn1ActionPerformed
        String major = majorName.getText();
        if("".equals(major)){
            JOptionPane.showMessageDialog(this,"\tPlease fill the field!");
        }else{
            MyDatabase db = new MyDatabase();
            String sql="insert into Major (Name) values ( '"+major+"')";
            db.manageDatabase(sql);
            DefaultTableModel model = (DefaultTableModel) MajorTable.getModel();
            model.setRowCount(0);
            sql = "select Name from Major";
            db.tableSetting(sql, model);
            majorName.setText("");
            JOptionPane.showMessageDialog(this,"\tData added succesfully!");
        }
    }//GEN-LAST:event_saveBtn1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int row = MajorTable.getSelectedRow();
        if (row<0){
            JOptionPane.showMessageDialog(this,"\tPlease select any data!");
        }else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this data?", "Confirmation", dialogButton);
            if(dialogResult == 0) {
                String major=(String) MajorTable.getValueAt(row, 0);                
                MyDatabase db = new MyDatabase();
                String sql="delete from Major where Name='"+major+"'";
                db.manageDatabase(sql);
                DefaultTableModel model = (DefaultTableModel) MajorTable.getModel();
                model.setRowCount(0);
                sql = "select Name from Major";
                db.tableSetting(sql, model);
                
                JOptionPane.showMessageDialog(this,"\tData deleted");
            }  
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int row = CourseTable.getSelectedRow();
        if (row<0){
            JOptionPane.showMessageDialog(this,"\tPlease select any data!");
        }else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this data?", "Confirmation", dialogButton);
            if(dialogResult == 0) {
                String major=(String) CourseTable.getValueAt(row, 0);                
                MyDatabase db = new MyDatabase();
                String sql="delete from Courses where Name='"+major+"'";
                
                db.manageDatabase(sql);
                DefaultTableModel model = (DefaultTableModel) CourseTable.getModel();
                model.setRowCount(0);
                sql = "select Name from Courses";
                db.tableSetting(sql, model);
                
                JOptionPane.showMessageDialog(this,"\tData deleted");
            }  
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void saveBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtn2ActionPerformed
        String name = CourseName.getText();
        String teacher = (String) teacherCombo.getSelectedItem();
        String major = (String) majorCombo.getSelectedItem();
        if("".equals(name)){
            JOptionPane.showMessageDialog(this,"\tPlease submit the name");
        }else{
            MyDatabase db = new MyDatabase();
            String majorID = db.getID("select MajorID from Major where Name='"+major+"'");
            
            String[] parts = teacher.split(" ");
            String fname = parts[0]; 
            String lname = parts[1]; 
            String teacherID = db.getID("select TeacherID from Teachers where FirstName='"+fname+"' ");
                        
            String sql="insert into Courses (Name,TeacherID,MajorID) values ( '"+name+"', '"+teacherID+"', '"+majorID+"')";
            db.manageDatabase(sql);
            DefaultTableModel model = (DefaultTableModel) CourseTable.getModel();
            model.setRowCount(0);
            sql = "select Name from Courses";
            db.tableSetting(sql, model);
            CourseName.setText("");
            JOptionPane.showMessageDialog(this,"\tData added succesfully!");
        }
    }//GEN-LAST:event_saveBtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(SettingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CourseName;
    public static javax.swing.JTable CourseTable;
    public static javax.swing.JTable MajorTable;
    private javax.swing.JPanel PanelAddTeacher1;
    private javax.swing.JPanel PanelAddTeacher2;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox majorCombo;
    private javax.swing.JTextField majorName;
    private javax.swing.JButton saveBtn1;
    private javax.swing.JButton saveBtn2;
    private javax.swing.JComboBox teacherCombo;
    private javax.swing.JToggleButton togglAdd1;
    private javax.swing.JToggleButton togglAdd2;
    // End of variables declaration//GEN-END:variables
}
