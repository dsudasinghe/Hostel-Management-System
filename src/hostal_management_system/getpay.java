/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostal_management_system;

import java.sql.DriverManager;
import java.sql.ResultSet;
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
            String query1 ="update student set paidOrNot = 1 where id = "+studentId+"; ";
            String query2 ="update student set moneyPaid ="+balance+" where id = "+studentId+"; ";
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
    else
    {
        System.out.println("insufficent balance skipped");
    }
}

 
 
 
 
  
 public int getroomtype(int studentid1)
 {
     
      try {
            
            String myUrl = "jdbc:mysql://localhost/hostel";
            java.sql.Connection conn = DriverManager.getConnection(myUrl, "root", "");
           
                    
                String query ="SELECT type FROM rooms where room_id IN (SELECT room_id FROM reservation where student_id="+studentid1+");";

          // execute the query, and get a java resultset
          try ( // create the java statement
                  Statement st = conn.createStatement()) {
              // execute the query, and get a java resultset
              ResultSet rs = st.executeQuery(query);
              
              // iterate through the java resultset
              while (rs.next())
              {
                  int typeofroom = rs.getInt("type");
                  
                  
                  
                  // print the results
                  System.out.format("type is %s\n", typeofroom);
                  return typeofroom;
              }
          }


                    
           }
       catch (SQLException e)
           {
           System.err.println("Got an exception! ");
           System.err.println(e.getMessage());
           }
     
     System.out.println("d");
     return 3;
     

 }
 
 
 
 
  
 public int getbalanceofaccount(int studentid1)
 {
      
    try {
            
            String myUrl = "jdbc:mysql://localhost/hostel";
            java.sql.Connection conn = DriverManager.getConnection(myUrl, "root", "");
            
            String query ="SELECT moneyPaid FROM student WHERE id="+studentid1+";"; 
            
            
        // execute the query, and get a java result set
        try ( //create the java statement
                Statement st = conn.createStatement()) {
            // execute the query, and get a java result set
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next())
            {
                int bal = rs.getInt("moneyPaid");
                
                return bal;
            }
        }
        }
       catch (SQLException e)
        {
           System.err.println("Got an exception! ");
           System.err.println(e.getMessage());
       }
     return 0;
    

 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

}           