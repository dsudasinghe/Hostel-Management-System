/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostal_management_system;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException; 
import java.math.BigInteger; 

/**
 *
 * @author lw
 */
public class Encrypt {
    
    
    
     public static String Md5encryption(String input) 
    { 
        try { 
  
            MessageDigest md = MessageDigest.getInstance("MD5"); 
  
            // digest() method for calculate message digest 
            //  of an input digest() return array of byte 
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            //  signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // messageDigest Convert  into hex value 
            String hashCode = no.toString(16); 
            while (hashCode.length() < 32) { 
                hashCode = "0" + hashCode; 
            } 
            return hashCode; 
        }  

        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 
    
    
    
    
    
    
    
    
    
}
