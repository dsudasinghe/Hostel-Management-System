/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostal_management_system;

/**
 *
 * @author Administrator
 */
public class NON_ACROOM extends Room{
    private float price;

 
    
    
    public NON_ACROOM(int roomId, String floor,float price) {
        super(roomId, floor);
        this.price=price;
    }
    
    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price=price;
    }
    
}
