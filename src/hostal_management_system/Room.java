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
    private int ownerId;

    
    
  
    
    //constructor for room class
    public Room(int roomId, String floor) {
        this.roomId = roomId;
        this.floor = floor;
        availability=false;
        ownerId=0;
    }
    

    public void reserveRoom(int ownerId){
        availability=true;
        this.ownerId=ownerId;
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

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    
}
