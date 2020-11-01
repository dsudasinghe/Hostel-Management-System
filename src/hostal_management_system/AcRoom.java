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
    private final float price=20000;

    public AcRoom(int roomId, String floor) {
     //   super(roomId, floor);
        super.setAvailability(false);
        
    }

    
}
