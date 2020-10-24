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
public class AcRoom extends Room{
    private  float price=20000;

    public AcRoom(int roomId, String floor,float price) {
        super(roomId, floor);
        super.setAvailability(false);
        super.setOwnerId(0);
    }
    public  float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price=price;
        
    }
    
   

    
}
