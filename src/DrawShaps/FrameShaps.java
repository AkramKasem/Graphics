/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawShaps;

import Rectangle.*;
import java.awt.Color;

/**
 *
 * @author Akram
 */
public class FrameShaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DrawPanel f = new DrawPanel();
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setSize(700, 700);
        f.setResizable(false);
        f.setTitle("Akram section 5");
        f.getContentPane().setBackground(Color.black);
    }
    
}
