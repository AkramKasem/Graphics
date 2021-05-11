/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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

        Graphics2D gd = (Graphics2D) g;

        gd.setColor(Color.red);
        gd.fillRoundRect(150, 170, 100, 100, 50, 50);

        gd.setColor(Color.white);
        gd.fillRoundRect(250, 270, 200, 200, 50, 50);

        gd.setColor(Color.blue);
        gd.fillOval(300, 320, 100, 100);

        gd.setColor(Color.red);
        gd.fillRoundRect(450, 470, 100, 100, 50, 50);

    }

}
