/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostal_management_system;

/**
 *
 * @author lw
 */
public class Order {
    
    //int studentid;
    private int accountbalance;
    private int brakfast=100;
    private  int lunch=150;
    private int dinner=200;
    private int milk=50;
    private int total;
    private int studentid;
   
  
    
 
    public Order(int studentid,int accountbalance,int isbreak,int islunch,int isdinner,int ismilk){
        
        
        this.studentid=studentid;
        this.accountbalance=accountbalance;
        this.total=(brakfast*isbreak)+(lunch*islunch)+(dinner*isdinner)+(milk*ismilk);
       
    }

    /**
     * @return the accountbalance
     */
    public int getAccountbalance() {
        return accountbalance;
    }
    
    public int getnewAccountbalance(){
    
        return accountbalance-total;
    }

    /**
     * @param accountbalance the accountbalance to set
     */
    public void setAccountbalance(int accountbalance) {
        this.accountbalance = accountbalance;
    }

    /**
     * @return the brakfast
     */
    public int getBrakfast() {
        return brakfast;
    }

    /**
     * @param brakfast the brakfast to set
     */
    public void setBrakfast(int brakfast) {
        this.brakfast = brakfast;
    }

    /**
     * @return the lunch
     */
    public int getLunch() {
        return lunch;
    }

    /**
     * @param lunch the lunch to set
     */
    public void setLunch(int lunch) {
        this.lunch = lunch;
    }

    /**
     * @return the dinner
     */
    public int getDinner() {
        return dinner;
    }

    /**
     * @param dinner the dinner to set
     */
    public void setDinner(int dinner) {
        this.dinner = dinner;
    }

    /**
     * @return the milk
     */
    public int getMilk() {
        return milk;
    }

    /**
     * @param milk the milk to set
     */
    public void setMilk(int milk) {
        this.milk = milk;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the studentid
     */
    public int getStudentid() {
        return studentid;
    }

    /**
     * @param studentid the studentid to set
     */
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
