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
public class Room {
    private int roomId;
    private String floor;
    private boolean availability;
    private float price;

    
    
    
    
    
    //constructor for room class
    public Room(int roomId, String floor) {
        this.roomId = roomId;
        this.floor = floor;
    }
    

   
       
    
    

    
  //getters and setters for room class

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price=price;
    }
    
}
