/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostal_management_system;

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

   

    
    //student pays money for their needs
    public void payMoney(int payMoney){
        moneyPaid+=payMoney;
    }
    
    //when the student oders food foodPrice will be subcracted from the moneyPaid
    public void oderFood(int foodPrice){
        moneyPaid-=foodPrice;
    }
    
    
    
    
    
    //constructor for student class
    public Student(int StudentId, String name, int tel,String faculty) {
        this.faculty=faculty;
        this.StudentId = StudentId;
        this.name = name;
        this.tel = tel;
        moneyPaid=0;
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
