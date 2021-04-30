/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Road_Task;

import javax.swing.JFrame;

/**
 *
 * @author akram
 */
public class Draw_New {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Akram Kasem  Section : 5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1035, 650);
        frame.setResizable(false);
        Panel2D panel = new Panel2D();
        frame.getContentPane().add(panel);
        
        
        
    }
    
    
    
}