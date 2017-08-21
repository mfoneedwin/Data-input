
package appPackage;

import java.awt.Image;
import java.io.File;
import java.io.InputStream;

import java.util.ArrayList;


import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
//import sun.org.mozilla.javascript.internal.regexp.SubString;



public final class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("database.png")).getImage());
        Refresh();
        ComboFilter();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Profile = new javax.swing.JLabel();
        FNameL = new javax.swing.JLabel();
        LNameL = new javax.swing.JLabel();
        MajorL = new javax.swing.JLabel();
        numL = new javax.swing.JLabel();
        emailL = new javax.swing.JLabel();
        CountryL = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        searchBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        ComboBox = new javax.swing.JComboBox();
        jButton11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appPackage/default_profile.png"))); // NOI18N
        Profile.setMinimumSize(new java.awt.Dimension(150, 14));
        Profile.setOpaque(true);
        getContentPane().add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 150));

        FNameL.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        getContentPane().add(FNameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 200, 30));

        LNameL.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        getContentPane().add(LNameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 200, 30));

        MajorL.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        getContentPane().add(MajorL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 200, 30));

        numL.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        getContentPane().add(numL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 200, 30));

        emailL.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        getContentPane().add(emailL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 200, 30));

        CountryL.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        getContentPane().add(CountryL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 200, 30));

        jButton1.setText("Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 100, 30));

        searchBox.setFont(new java.awt.Font("Gungsuh", 0, 12)); // NOI18N
        searchBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchBox.setText("Search");
        searchBox.setToolTipText("Search");
        searchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxActionPerformed(evt);
            }
        });
        searchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchBoxKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBoxKeyReleased(evt);
            }
        });
        getContentPane().add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 150, 30));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Gender", "Country", "E-mail", "Telephone", "Profile", "MajorID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.getTableHeader().setReorderingAllowed(false);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
            Table.getColumnModel().getColumn(4).setResizable(false);
            Table.getColumnModel().getColumn(5).setResizable(false);
            Table.getColumnModel().getColumn(6).setResizable(false);
            Table.getColumnModel().getColumn(7).setResizable(false);
            Table.getColumnModel().getColumn(8).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 780, 130));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Students Results"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Submit Result");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, -1));

        jButton3.setText("Reset Result");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 180, 120));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setText("All Students");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 240, -1));

        jButton7.setText("All Teachers");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 240, -1));

        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, -1));

        jButton11.setText("Filter");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 60, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 280, 120));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setText("Add Entry");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, -1));

        jButton9.setText("Edit Entry");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, -1));

        jButton10.setText("Delete Entry");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 180, 120));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 440));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem7.setText("Refresh List");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);
        jMenu2.add(jSeparator1);

        jMenuItem2.setText("Add new entry");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Edit selected entry");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Delete selected entry");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Options");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Settings");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("?");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem6.setText("About");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void Refresh(){
        MyDatabase db = new MyDatabase();
        db.Refresh();
    }
    public void ComboFilter(){
        MyDatabase db = new MyDatabase();
        ArrayList<String> ls = db.getMajor();
        ComboBox.setModel(new DefaultComboBoxModel(ls.toArray()));        
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = Table.getSelectedRow();  
        MyDatabase db = new MyDatabase();
        
        if (row <0 ){
            JOptionPane.showMessageDialog(this,"\tPlease select any data!");
        }
        if(row>=0){
            String ID = (String) Table.getValueAt(row, 0);
            if("0".equals((String) Table.getValueAt(row, 8))){
                 JOptionPane.showMessageDialog(this,"\tSorry, The results are only available for Students!");
            } else if(db.idExist("select COUNT(StudentID) from Results where StudentID="+ID)==0){
                
                JOptionPane.showMessageDialog(this,"\tSorry, This Student has no record yet! \n\tPlease go and submit the result for the selected student!");
                //System.out.println("Report");
            }else if(db.idExist("select COUNT(StudentID) from Results where StudentID="+ID)==1){
                try{
                    
                    
                    //String report = "C:\\Users\\Anonymous\\Documents\\NetBeansProjects\\DatabaseProject\\src\\appPackage\\report.jrxml";
                    //String ID = (String) Table.getValueAt(row, row)
                    //ImageIcon ico = new ImageIcon(getClass().getResource("/appPackage/default_profile.png"));
                    InputStream path = getClass().getResourceAsStream( "/appPackage/report.jrxml" )  ;
                    //path = path.substring(6);
                    //System.out.println(path);
                    JasperDesign jd = JRXmlLoader.load(path);
                    //JasperDesign jd = JRXmlLoader.load("C:\\Users\\Anonymous\\Documents\\NetBeansProjects\\DatabaseProject\\src\\appPackage\\report.jrxml");
                    String sql = "SELECT Courses.Name, Results.Mark, Students.StudentID, Students.FirstName, Students.LastName, Major.Name AS Major " +
                                "FROM ((Results " +
                                "        INNER JOIN Courses ON Courses.CourseID=Results.CourseID) " +
                                "        INNER JOIN Major ON Major.MajorID=Courses.MajorID) " +
                                "        INNER JOIN Students ON Results.StudentID=Students.StudentID " +
                                "WHERE Results.StudentID="+ID+";";
                    JRDesignQuery newQuery = new JRDesignQuery();    
                    newQuery.setText(sql);
                    jd.setQuery(newQuery);
                    
                    JasperReport jr = JasperCompileManager.compileReport(jd);
                    JasperPrint jp = JasperFillManager.fillReport(jr, null,MyDatabase.conn);
                    JasperViewer.viewReport(jp, false);
                    
                }catch(Exception e){
                    System.err.println(e);
                }
           
            }            
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JOptionPane.showMessageDialog(this,"\tDatabase Project by: \n\t  - RAILALA Andriatsimarivo 安卓\n\t  - moufou\n\t  - Kezy Joe\n\n");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new SettingGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        MyDatabase db = new MyDatabase();
        db.Refresh();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int row = Table.getSelectedRow();
        
        String Fname = (String) Table.getValueAt(row, 1);
        String Lname = (String) Table.getValueAt(row, 2);
        String Country = (String) Table.getValueAt(row, 4);
        String Email = (String) Table.getValueAt(row, 5);
        String Tel = (String) Table.getValueAt(row, 6);
        String Pic = (String) Table.getValueAt(row, 7);
        String Major = (String) Table.getValueAt(row, 8);
        MyDatabase db = new MyDatabase();
        if(Major!="0"){
            String major = db.getMajorByID(Major);
            MajorL.setText(major);
        }else
            MajorL.setText("Teacher");
       
        try{
            File file = new File(Pic);            
            if (file.exists()){
                ImageIcon imageIcon = new ImageIcon(Pic);            
                Image image = imageIcon.getImage(); // transform it 
                Image newimg = image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
                imageIcon = new ImageIcon(newimg);  // transform it back
                Profile.setIcon(imageIcon);
            }
            else{
                ImageIcon ico = new ImageIcon(getClass().getResource("/appPackage/default_profile.png"));
                Profile.setIcon(ico);
            }
        }catch(Exception e){
            ImageIcon imageIcon = new ImageIcon(getClass().getResource("/appPackage/default_profile.png"));
            Profile.setIcon(imageIcon);
        }        
        FNameL.setText(Fname);
        LNameL.setText(Lname);
        CountryL.setText(Country);
        emailL.setText(Email);
        numL.setText(Tel);
    }//GEN-LAST:event_TableMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        MyDatabase db = new MyDatabase();
        db.getData("select * from teachers ORDER BY TeacherID");
        //db.getTeachers();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        MyDatabase db = new MyDatabase();
        db.getData("select * from Students ORDER BY StudentID");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        MyDatabase db = new MyDatabase();
        String major = (String) ComboBox.getSelectedItem();
        db.filterByMajor(major);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void searchBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBoxKeyPressed
  
    }//GEN-LAST:event_searchBoxKeyPressed

    private void searchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBoxKeyReleased
        DefaultTableModel model = (DefaultTableModel) MainWindow.Table.getModel();
        model.setRowCount(0);
        String txt = searchBox.getText();
        String sqlStudent = "select * from Students where StudentID LIKE '%"+txt+"%' OR FirstName LIKE '%"+txt+"%' OR LastName LIKE'%"+txt+"%'ORDER BY StudentID";
        String sqlTeacher = "select * from teachers where TeacherID LIKE '%"+txt+"%' OR FirstName LIKE '%"+txt+"%' OR LastName LIKE'%"+txt+"%'ORDER BY TeacherID";
        MyDatabase db = new MyDatabase();
        db.getData(sqlStudent);
        db.getData(sqlTeacher);        
    }//GEN-LAST:event_searchBoxKeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new DataEntryGUI().setVisible(true);
        flag=1;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        DeleteEntry();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        EditEntry();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new DataEntryGUI().setVisible(true);
        flag=1;
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        DeleteEntry();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        EditEntry();        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row = Table.getSelectedRow();        
        if (row <0 ){
            JOptionPane.showMessageDialog(this,"\tPlease select any data!");
        }else if("0".equals((String) Table.getValueAt(row, 8))){
            JOptionPane.showMessageDialog(this,"\tSorry, The results are only available for Students!");
        }else{
            String fame = (String) Table.getValueAt(row, 1);
            String lname = (String) Table.getValueAt(row, 2);
            String ID = (String) Table.getValueAt(row, 0);
            String occ = (String) Table.getValueAt(row, 8);
            ResultGUI rs =  new ResultGUI();
            MyDatabase db = new MyDatabase();
            ResultGUI.FNameL.setText(fame);
            ResultGUI.LNameL.setText(lname);
            ResultGUI.IDF.setText(ID);
            ResultGUI.occL.setText(occ);
            if(db.idExist("select COUNT(StudentID) from Results where StudentID="+ID)==0){
                db.getCourses(occ);
            }else{
                db.getResult(ID);
            }            
            rs.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int row = Table.getSelectedRow();  
        MyDatabase db = new MyDatabase();
        
        if (row <0 ){
            JOptionPane.showMessageDialog(this,"\tPlease select any data!");
        }else if("0".equals((String) Table.getValueAt(row, 8))){
            JOptionPane.showMessageDialog(this,"\tSorry, The results are only available for Students!");
        }else if(row>=0){
            String ID = (String) Table.getValueAt(row, 0);
            if(db.idExist("select COUNT(StudentID) from Results where StudentID="+ID)==0){
                JOptionPane.showMessageDialog(this,"\tThis Student's result is already empty.");
            }else{
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to reset this student's result?", "Confirmation", dialogButton);
                if(dialogResult == 0) {  
                    String sql="delete from Results where StudentID="+ID;
                    db.manageDatabase(sql);
                    JOptionPane.showMessageDialog(this,"\tResult reseted successfully!");
                }                      
            }            
        }            
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void EditEntry(){
        int row = Table.getSelectedRow();
        if (row <0 ){
            JOptionPane.showMessageDialog(this,"\tPlease select any data!");
        }else{
            DataEntryGUI gui = new DataEntryGUI();
            MyDatabase db = new MyDatabase();
            String occ = (String) Table.getValueAt(row, 8);
            
            if("0".equals(occ)){        
                DataEntryGUI.occupCombo.setSelectedItem("Teacher");
            }else{
                DataEntryGUI.occupCombo.setSelectedItem("Student");
                String major = db.getMajorByID(occ);
                DataEntryGUI.majorCombo.setSelectedItem(major);
            }
            DataEntryGUI.IDF.setText((String) Table.getValueAt(row, 0));
            DataEntryGUI.FNameF.setText((String) Table.getValueAt(row, 1));
            DataEntryGUI.LNameF.setText((String) Table.getValueAt(row, 2));            
            DataEntryGUI.genderCombo.setSelectedItem((String) Table.getValueAt(row, 3));
            DataEntryGUI.countryF.setText((String) Table.getValueAt(row, 4));
            DataEntryGUI.emailF.setText((String) Table.getValueAt(row, 5));
            DataEntryGUI.phoneF.setText((String) Table.getValueAt(row, 6));
            DataEntryGUI.PathT.setText((String) Table.getValueAt(row, 7));
            DataEntryGUI.IDF.setEnabled(false);
            DataEntryGUI.occupCombo.setEnabled(false);
            flag=2;
            gui.setVisible(true);
        }
    }
    
    public void DeleteEntry(){
        int row = Table.getSelectedRow();
        if (row <0 ){
            JOptionPane.showMessageDialog(this,"\tPlease select any data!");
        }else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this data?", "Confirmation", dialogButton);
            if(dialogResult == 0) {
                String ID=(String) Table.getValueAt(row, 0);
                String occ=(String) Table.getValueAt(row, 8);
                MyDatabase db = new MyDatabase();
                if("0".equals(occ)){
                    String sql="delete from Teachers where TeacherID="+ID;
                    db.manageDatabase(sql);
                }else{
                    String sql="delete from Students where StudentID="+ID;
                    db.manageDatabase(sql);                  
                }
                db.Refresh();
                JOptionPane.showMessageDialog(this,"\tData deleted");
            }  
        }
    }
    
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox;
    private javax.swing.JLabel CountryL;
    public static javax.swing.JLabel FNameL;
    private javax.swing.JLabel LNameL;
    private javax.swing.JLabel MajorL;
    private javax.swing.JLabel Profile;
    public static javax.swing.JTable Table;
    private javax.swing.JLabel background;
    private javax.swing.JLabel emailL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel numL;
    private javax.swing.JTextField searchBox;
    // End of variables declaration//GEN-END:variables
    public static int flag=0;
    
}
