/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appPackage;

import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Anonymous
 */
public class DataEntryGUI extends javax.swing.JFrame {

    /**
     * Creates new form DataEntryGUI
     */
    public DataEntryGUI() {
        initComponents();
        ComboFilter();
    }

    public void ComboFilter(){
        MyDatabase db = new MyDatabase();
        ArrayList<String> ls = db.getMajor();
        majorCombo.setModel(new DefaultComboBoxModel(ls.toArray()));        
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        occupCombo = new javax.swing.JComboBox();
        majorCombo = new javax.swing.JComboBox();
        FNameF = new javax.swing.JTextField();
        LNameF = new javax.swing.JTextField();
        genderCombo = new javax.swing.JComboBox();
        countryF = new javax.swing.JTextField();
        emailF = new javax.swing.JTextField();
        phoneF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        PathT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        IDF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Occupation* :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        jLabel2.setText("Major :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        jLabel3.setText("First Name* :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, -1, -1));

        jLabel4.setText("Last Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setText("Gender :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, -1, -1));

        jLabel6.setText("Country :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 202, -1, -1));

        jLabel7.setText("E-mail :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 233, -1, -1));

        jLabel8.setText("Telephone* :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 264, -1, -1));

        jLabel9.setText("Profile :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 296, -1, -1));

        occupCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Teacher" }));
        occupCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupComboActionPerformed(evt);
            }
        });
        getContentPane().add(occupCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 11, 132, -1));

        getContentPane().add(majorCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 42, 132, -1));
        getContentPane().add(FNameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 106, 135, -1));
        getContentPane().add(LNameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 137, 135, -1));

        genderCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        getContentPane().add(genderCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 168, 135, -1));
        getContentPane().add(countryF, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 199, 135, -1));
        getContentPane().add(emailF, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 230, 135, -1));
        getContentPane().add(phoneF, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 261, 136, -1));

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 292, 28, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 11, -1, -1));

        PathT.setEditable(false);
        PathT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PathT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PathT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PathT.setEnabled(false);
        PathT.setFocusable(false);
        PathT.setMaximumSize(new java.awt.Dimension(102, 16));
        PathT.setMinimumSize(new java.awt.Dimension(102, 16));
        PathT.setName(""); // NOI18N
        PathT.setPreferredSize(new java.awt.Dimension(102, 16));
        getContentPane().add(PathT, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 295, -1, -1));

        jLabel10.setText("ID* :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, -1, -1));
        getContentPane().add(IDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 73, 132, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files","jpg","png","jpeg");
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);        
        if(returnVal==JFileChooser.APPROVE_OPTION){
            File myFile = chooser.getSelectedFile();
            String text = myFile+"";
            //System.out.println(text);
            PathT.setText(text);
            //ReadTextFile RTF = new ReadTextFile();
            //RTF.ReadFile(text);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void occupComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupComboActionPerformed
        String occ = occupCombo.getSelectedItem()+"";
        if ("Student".equals(occ)){
            majorCombo.setEnabled(true);
        }else
            majorCombo.setEnabled(false);
    }//GEN-LAST:event_occupComboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String occ = occupCombo.getSelectedItem()+"";
        String major = majorCombo.getSelectedItem()+"";
        String id = IDF.getText();
        String fname = FNameF.getText();
        String lname = LNameF.getText();
        String gender = genderCombo.getSelectedItem()+"";
        String country = countryF.getText();
        String email = emailF.getText();
        String phone = phoneF.getText();
        String profile = PathT.getText();
        
        profile = profile.replace("\\","\\\\");
        MyDatabase db = new MyDatabase();
        if(MainWindow.flag==1){
            if ("".equals(id) || "".equals(fname) || "".equals(phone)){
                JOptionPane.showMessageDialog(this,"\tSome important fields are empty, please fill them.\n\n\t(Fields with * are important)");
            }else if("Teacher".equals(occ) && db.idExist("select COUNT(TeacherID) from Teachers where TeacherID="+id)==1){
                JOptionPane.showMessageDialog(this,"\tSorry this Teacher ID already exists in the database, please verify your data");
            }else if("Student".equals(occ) && db.idExist("select COUNT(StudentID) from Students where StudentID="+id)==1){
                JOptionPane.showMessageDialog(this,"\tSorry this Student ID already exists in the database, please verify your data");
            }else{                
                if ("Student".equals(occ)){
                    String majorID = db.getID("select MajorID from Major where Name='"+major+"'");                
                    String sql="insert into Students values ("+id+",'"+fname+"','"+lname+"','"+gender+"','"+country+"','"+email+"','"+phone+"','"+profile+"','"+majorID+"')";
                    db.manageDatabase(sql);                
                }else{
                    String sql="insert into teachers values ("+id+",'"+fname+"','"+lname+"','"+gender+"','"+country+"','"+email+"','"+phone+"','"+profile+"')";
                    db.manageDatabase(sql);                                
                }   
                JOptionPane.showMessageDialog(this,"\tData inserted successfuly in the database!");
                db.Refresh();
                this.dispose();
            } 
        }else if (MainWindow.flag==2){
            if ("".equals(id) || "".equals(fname) || "".equals(phone)){
                JOptionPane.showMessageDialog(this,"\tSome important fields are empty, please fill them.\n\n\t(Fields with * are important)");
            }else{                
                if ("Student".equals(occ)){
                    String majorID = db.getID("select MajorID from Major where Name='"+major+"'");                
                    String sql="update Students set  FirstName='"+fname+"', LastName='"+lname+"', Gender='"+gender+"', Country='"+country+"', Email='"+email+"', Telephone='"+phone+"', PicturePath='"+profile+"', MajorID="+majorID+" where StudentID="+id;
                    db.manageDatabase(sql);                
                }else{
                    String sql="update teachers set  FirstName='"+fname+"', LastName='"+lname+"', Gender='"+gender+"', Country='"+country+"', Email='"+email+"', Telephone='"+phone+"', PicturePath='"+profile+"' where TeacherID="+id;
                    db.manageDatabase(sql);                                
                }   
                JOptionPane.showMessageDialog(this,"\tData updated successfuly!");
                db.Refresh();
                this.dispose();
            } 
            //System.out.println("Edit");
        }
        
               
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DataEntryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataEntryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataEntryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataEntryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataEntryGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField FNameF;
    public static javax.swing.JTextField IDF;
    public static javax.swing.JTextField LNameF;
    public static javax.swing.JTextField PathT;
    public static javax.swing.JTextField countryF;
    public static javax.swing.JTextField emailF;
    public static javax.swing.JComboBox genderCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JComboBox majorCombo;
    public static javax.swing.JComboBox occupCombo;
    public static javax.swing.JTextField phoneF;
    // End of variables declaration//GEN-END:variables
}
