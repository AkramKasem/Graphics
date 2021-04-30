/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author akram
 */
public class MovingFanPanel extends FanePanel implements  ActionListener{
    
    private  Timer t;
    public MovingFanPanel() {
        t = new Timer(4, this);t.start();
        t.start();
        super.setAngle(super.getAngle()-1);
        repaint();
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        
        t.start();
        if (super.isClickWise()) {       
            super.setAngle(super.getAngle()-1);
            repaint();
        }else{          
            super.setAngle(super.getAngle()+1);
            repaint();
        }
    }
    
    
    
}
