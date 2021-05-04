/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sky;

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
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            int x = rand.nextInt(700);
            int y = rand.nextInt(700);
            g.drawLine(x, y, x, y);

        }

    }

}
