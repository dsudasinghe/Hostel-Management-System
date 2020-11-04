/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostal_management_system;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lw
 */
public class getpay {
    
  
 

     
   
 public int getroomprice(int roomtype,int Acpayment,int nonacpayment)
 {
     
       switch (roomtype) {
           case 1:
               return Acpayment;
           case 0:
               return nonacpayment;
           default:
               return 0;
       }
 
 }
 
     
        
 public void getpaymentsfromall(int roomprice,int balance,int studentId)
{
    
    if(balance>roomprice)
    {
                //calculate new balance after pay
                balance=balance-roomprice;
                //set payed flag
                
       try {
            
            String myUrl = "jdbc:mysql://localhost/hostel";
            java.sql.Connection conn = DriverManager.getConnection(myUrl, "root", "");
            String query1 ="update student set paidOrNot = 1 where id = "+studentId+" ";
            String query2 ="update student set moneyPaid ="+balance+" where id = "+studentId+" ";
                    // execute the query, and get a java result set
                    try ( //create the java statement
                            Statement st = conn.createStatement()) {
                        // execute the query, and get a java result set
                        st.execute(query1);
                        st.execute(query2);
                    }
           }
       catch (SQLException e)
           {
           System.err.println("Got an exception! ");
           System.err.println(e.getMessage());
           }
    
    }
}


}