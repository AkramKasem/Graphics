/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskOne;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author akram
 */
public class Shapes extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Akram Kasem  Section 5", 100, 100);
        g.drawLine(120, 120, 200, 120);
        g.setColor(Color.blue);
        g.drawLine(400, 300, 200, 400);
        g.setColor(Color.blue);
        g.drawLine(400, 300, 600, 400);
        g.setColor(Color.blue);
        g.drawLine(200, 400, 600, 400);
        g.setColor(Color.RED);
        g.drawRect(200, 400, 400, 450);
        g.setColor(Color.RED);
        g.fillRect(250, 450, 60, 60);
        g.drawRect(250, 450, 60, 60);
        g.setColor(Color.RED);
        g.fillRect(450, 450, 60, 60);
        g.drawRect(450, 450, 60, 60);
        g.setColor(Color.black);
        g.drawRect(370, 550, 90, 300);
        g.setColor(Color.PINK);
        g.fillOval(370, 650, 30, 20);
        g.drawArc(370, 650, 30, 20, 0, 360);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Shapes frame = new Shapes();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(900, 900);
        frame.setResizable(false);
    }

}
