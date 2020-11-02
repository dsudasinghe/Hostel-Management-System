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
    private int floor;
    private boolean availability;
    private int type;
    private int numberOfmembers;
    
    
    
    
    public Room(int roomId,int type,int floor,int numberOfmembers)
    {
        this.roomId=roomId;
        this.type=type;
        this.floor=floor;
        this.numberOfmembers=numberOfmembers;
        if(numberOfmembers==2)
        {
        this.availability=false;
        }
        else
        {
            this.availability=true;
        }
    }
    
    
    

    /**
     * @return the roomId
     */
    public int getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    /**
     * @return the floor
     */
    public int getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(int floor) {
        this.floor = floor;
    }

    /**
     * @return the availability
     */
    public boolean isAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    /**
     * @return the type
     */
    public int isType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the numberOfmembers
     */
    public int getNumberOfmembers() {
        return numberOfmembers;
    }

    /**
     * @param numberOfmembers the numberOfmembers to set
     */
    public void setNumberOfmembers(int numberOfmembers) {
        this.numberOfmembers = numberOfmembers;
    }
    
    
  
    
}
