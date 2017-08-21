
package appPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public  class MyDatabase {
    public static Connection conn;
    Statement st;
    ResultSet rs;
    public MyDatabase(){
        try{
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");   
            Class.forName("com.mysql.jdbc.Driver");
           
            String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "./Database.mdb;DriverID=22;READONLY=false";
            
            String db = "jdbc:odbc:Database";
            String mysql ="jdbc:mysql://localhost:3306/database";
            String path = getClass().getResource( "/appPackage/Database.mdb" )+""  ;
            path = path.substring(6);
            //System.out.println(path);
            String data = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+path+";";
            conn = DriverManager.getConnection(mysql,"root",""); 
        }catch(ClassNotFoundException | SQLException e){
            System.err.println(e);
        }
        
    }
    
    public String getMajorByID(String ID){
        String major="";
        try{
            st = conn.createStatement();
            String sql = "select Name from Major where MajorID="+ID;
            rs = st.executeQuery(sql);
            rs.next();
            major = rs.getString("Name");
        }catch(Exception e){
            System.err.println(e);
            System.err.println("ERROR");
        }
        return major;
    }
    
   
    public int idExist(String sql){
        String ret="";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            ret = rs.getString(1);
            int res = Integer.parseInt(ret);
            if(res>0){
                return 1;
            }else
                return 0; 
        }catch(Exception e){
            System.err.println(e);
        }
        return 0;
    }
         
    public void tableSetting(String sql, DefaultTableModel model){
        try{
            //model = (DefaultTableModel) MainWindow.Table.getModel();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                String Data = rs.getString(1);                              
                model.addRow(new Object[]{Data});                
            }             
        }catch(Exception e){
            System.err.println(e);
        }
    }
            
    public void Refresh(){        
        DefaultTableModel model = (DefaultTableModel) MainWindow.Table.getModel();
        model.setRowCount(0);
        getData("select * from Students ORDER BY StudentID");
        getData("select * from teachers ORDER BY TeacherID");
    }
    
    public void getCourses(String ID){
        try{
            DefaultTableModel model = (DefaultTableModel) ResultGUI.resultTable.getModel();
            model.setRowCount(0);
            st = conn.createStatement();
            String sql ="select Name from Courses where MajorID="+ID;
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                
                String name = rs.getString(1);               
                              
                model.addRow(new Object[]{name,"0","0"});                
            } 
            
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void getResult(String ID){
        try{
            DefaultTableModel model = (DefaultTableModel) ResultGUI.resultTable.getModel();
            model.setRowCount(0);
            st = conn.createStatement();
            String sql ="SELECT Courses.Name, Results.Mark, Results.Attendance " +
                    "FROM Courses INNER JOIN Results " +
                    "ON Courses.CourseID=Results.CourseID " +
                    "WHERE Results.StudentID="+ID;
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                String course = rs.getString(1);
                String mark = rs.getString(2); 
                String attendance = rs.getString(3);
                //String course = getCourseByID(courseID);
                              
                model.addRow(new Object[]{course,mark,attendance});                
            } 
            
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void getData(String sql){
        try{
            DefaultTableModel model = (DefaultTableModel) MainWindow.Table.getModel();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                String ID = rs.getString(1);
                String name = rs.getString(2);
                String Lname = rs.getString(3);
                String gender = rs.getString(4);
                String country = rs.getString(5);
                String email = rs.getString(6);
                String telephone = rs.getString(7);
                String pic = rs.getString(8); 
                String major="0";
                try{
                    major=rs.getString(9);
                }catch(Exception e){
                    major="0";
                }                
                model.addRow(new Object[]{ID,name, Lname,gender,country,email,telephone,pic,major});                
            }             
        }catch(Exception e){
            System.err.println(e);
        }
    }
    public void manageDatabase(String sql){
        try{
            st = conn.createStatement();            
            int s = st.executeUpdate(sql);
        }catch(Exception e){
            System.err.println(e);
        }       
    }
    
    public String getID(String sql){
        String ID="";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            ID = rs.getString(1);
        }catch(Exception e){
            System.err.println(e);
        }
        return ID;
    }
    
    public ArrayList getTeachers(){
        ArrayList<String> ls = new ArrayList<>(); 
        try{
            st = conn.createStatement();
            String sql = "select FirstName, LastName from Teachers";
            rs = st.executeQuery(sql);
            while(rs.next()){
                ls.add(rs.getString(1)+" "+rs.getString(2));
            }
        }catch(Exception e){
                 System.err.println(e);
        }
        return ls;
    }
    
    public ArrayList getMajor(){
        ArrayList<String> ls = new ArrayList<>(); 
        try{
            st = conn.createStatement();
            String sql = "select Name from Major";
            rs = st.executeQuery(sql);
            while(rs.next()){
                ls.add(rs.getString(1));
            }
        }catch(Exception e){
                 System.err.println(e);
        }
        return ls;
    }
    public void filterByMajor(String mj){
        try{
            DefaultTableModel model = (DefaultTableModel) MainWindow.Table.getModel();
            model.setRowCount(0);
            st = conn.createStatement();            
            String sql = "select MajorID from Major where Name='"+mj+"'";
            rs = st.executeQuery(sql);
            rs.next();
            String majorID = rs.getString(1);
            //System.out.println(majorID);
            sql = "select * from Students where MajorID="+majorID+" ORDER BY StudentID";
            rs = st.executeQuery(sql);            
            while (rs.next()){
                String ID = rs.getString(1);
                String name = rs.getString(2);
                String Lname = rs.getString(3);
                String gender = rs.getString(4);
                String country = rs.getString(5);
                String email = rs.getString(6);
                String telephone = rs.getString(7);
                String pic = rs.getString(8); 
                String major = rs.getString(9);
                model.addRow(new Object[]{ID,name, Lname,gender,country,email,telephone,pic,major});
            }  
        }catch (SQLException e){
            System.err.println(e);
        }
    }
    
}
