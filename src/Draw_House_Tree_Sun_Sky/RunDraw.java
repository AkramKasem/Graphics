/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Draw_House_Tree_Sun_Sky;

import javax.swing.JFrame;

/**
 *
 * @author akram
 */
public class RunDraw {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw House Tree Sun Sky");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(900, 550);
        frame.setResizable(false);
        Household panel = new Household();
        frame.getContentPane().add(panel);
    }
    
}
