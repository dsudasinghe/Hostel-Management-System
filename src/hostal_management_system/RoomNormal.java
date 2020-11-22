/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostal_management_system;

/**
 *
 * @author lw
 */
public class RoomNormal extends Room{
    
    

   //  protected int roomprice=5;
    
     
    public RoomNormal(int roomId,int type,int floor,int numberOfmembers)
    {
        super.roomId=roomId;
        this.type=type;
        super.floor=floor;
        super.numberOfmembers=numberOfmembers;
        super.availability = numberOfmembers != 2;
    }
    
    
    
    
    
    
    
    
    
    
    
}
