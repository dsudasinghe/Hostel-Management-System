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
public class Hostal_management_system {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student(1,"lahiru",923,"foc");
        s1.payMoney(10000);
        s1.oderFood(100);
        
        System.out.println(s1.getMoneyPaid());
        System.out.println(s1.toString());
    }
    
}
