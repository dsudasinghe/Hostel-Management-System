package hostal_management_system;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
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
