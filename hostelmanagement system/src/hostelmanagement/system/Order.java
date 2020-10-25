/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagement.system;

/**
 *
 * @author lw
 */

import java.sql.*;


public class Order {
    
    int total;
    int accountbalance;
    int brakfast;
    int lunch;
    int dinner;
    int milk;
    int   studentid;
    
 
    public Order(int studentid,int accountbalance,int isbreak,int islunch,int isdinner,int ismilk){
        
        
        this.studentid=studentid;
        this.accountbalance=accountbalance;
        
        
        
     
        total=(brakfast*isbreak)+(lunch*islunch)+(dinner*isdinner)+(milk*ismilk);
        accountbalance=0;
         
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    
    