/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author Akram
 */
public class DrawPanel extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.white);
        g.fillRect(150, 170, 100, 100);

        g.setColor(Color.white);
        g.fillRect(250, 270, 200, 200);

        g.setColor(Color.white);
        g.fillRect(450, 470, 100, 100);

    }

}
