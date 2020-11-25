package hostal_management_system;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

import java.sql.*;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author Lahiru Dananjaya
 */
public class Student {
    private int StudentId;
    private String name;
    private int tel;
    private String faculty;
    private int moneyPaid;
    
    
    
    
    //set system date time for check in/out status
    public String checkIn(){
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
           LocalDateTime now = LocalDateTime.now();  
           return dtf.format(now);
    }
    
    public String checkOut(){
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
           LocalDateTime now = LocalDateTime.now();  
           return dtf.format(now);
    }

   

    
    //student pays money for their needs
    public void payMoney(int payMoney){
        moneyPaid+=payMoney;
    }

   
    
    //defualt constructor
    public Student() {
    }
   
    
    
    
   
    //constructor for student class
    public Student(int StudentId, String name, int tel,String faculty) {
        this.faculty=faculty;
        this.StudentId = StudentId;
        this.name = name;
        this.tel = tel;
        moneyPaid=0;
        try {
            String myUrl = "jdbc:mysql://localhost/hostel";
            java.sql.Connection conn = DriverManager.getConnection(myUrl, "root", "");
            
            String query ="INSERT INTO `student`(`id`, `name`, `tel`, `faculty`, `moneyPaid` , `paidOrNot` )"+" VALUES (?,?,?,?,?,0)";
            
            PreparedStatement pst = conn.prepareStatement(query); 
            pst.setInt(1,this.StudentId);
            pst.setString(2, this.name);
            pst.setInt(3, this.tel);
            pst.setString(4,this.faculty);
            pst.setString(5,String.valueOf(this.moneyPaid));
            pst.execute();
        
        }
        catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }

    
    public Student(int StudentId,int payment){
        
        this.StudentId = StudentId;
        this.moneyPaid=payment;
        
    }
    
    
    
    
    
    
    //getters and setters of Student class
    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getMoneyPaid() {
        return moneyPaid;
    }

    public void setMoneyPaid(int moneyPaid) {
        this.moneyPaid = moneyPaid;
    }
    
    
    
    
    
    
    
    public String toString(){
        return "Student{" +
                "studentId=" + StudentId +
                ", name='" + name + '\'' +
                ", moneyPaid=" + moneyPaid +
                ", Faculty ='"+faculty +'\'' +
                '}';
    }
}
