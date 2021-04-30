/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Road_Task;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author akram
 */
public class Panel2D extends JPanel {

    int Rotation1 = 0;
    int Rotation2 = 0;

    public Panel2D() {
        setPreferredSize(new Dimension(1010, 570));
        setBackground(Color.blue); 
    }

    @Override
    public void paintComponent(Graphics g) {
        
        
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        
        g.setColor(Color.gray); 
        g.fillRect(0, 320, 1020, 300);
        g.setColor(Color.blue); 
        g.fillRect(0, 0, 1020, 320); 
        g.setColor(Color.orange); 
        g.fillOval(490, 120, 170, 170); 


        g.setColor(Color.darkGray); 
        g.fillArc(200, 150, 400, 400, 0, 180); 
        g.fillArc(0, 175, 600, 350, 90, 90); 
        g.fillArc(550, 75, 500, 550, 0, 180); 


        g.setColor(Color.green);
        g.fillOval(0, 500, 30, 30);
        g.fillOval(25, 500, 30, 30);
        g.fillOval(50, 500, 30, 30);
        g.fillOval(15, 480, 30, 30);
        g.fillOval(32, 480, 30, 30);
        g.fillOval(90, 500, 30, 30);
        g.fillOval(115, 500, 30, 30);
        g.fillOval(140, 500, 30, 30);
        g.fillOval(105, 480, 30, 30);
        g.fillOval(122, 480, 30, 30);
        g.fillOval(180, 500, 30, 30);
        g.fillOval(205, 500, 30, 30);
        g.fillOval(230, 500, 30, 30);
        g.fillOval(195, 480, 30, 30);
        g.fillOval(212, 480, 30, 30);
        g.fillOval(270, 500, 30, 30);
        g.fillOval(295, 500, 30, 30);
        g.fillOval(320, 500, 30, 30);
        g.fillOval(285, 480, 30, 30);
        g.fillOval(302, 480, 30, 30);
        g.fillOval(510, 500, 30, 30);
        g.fillOval(535, 500, 30, 30);
        g.fillOval(560, 500, 30, 30);
        g.fillOval(525, 480, 30, 30);
        g.fillOval(542, 480, 30, 30);
        g.fillOval(600, 500, 30, 30);
        g.fillOval(625, 500, 30, 30);
        g.fillOval(650, 500, 30, 30);
        g.fillOval(615, 480, 30, 30);
        g.fillOval(632, 480, 30, 30);
        g.fillOval(690, 500, 30, 30);
        g.fillOval(715, 500, 30, 30);
        g.fillOval(740, 500, 30, 30);
        g.fillOval(705, 480, 30, 30);
        g.fillOval(722, 480, 30, 30);
        g.fillOval(780, 500, 30, 30);
        g.fillOval(805, 500, 30, 30);
        g.fillOval(830, 500, 30, 30);
        g.fillOval(795, 480, 30, 30);
        g.fillOval(812, 480, 30, 30);
        g.fillOval(870, 500, 30, 30);
        g.fillOval(895, 500, 30, 30);
        g.fillOval(920, 500, 30, 30);
        g.fillOval(885, 480, 30, 30);
        g.fillOval(902, 480, 30, 30);
        g.fillOval(960, 500, 30, 30);
        g.fillOval(985, 500, 30, 30);
        g.fillOval(1010, 500, 30, 30);
        g.fillOval(975, 480, 30, 30);
        g.fillOval(992, 480, 30, 30);
        
        
        
        
        g.setColor(Color.green);
        g.fillOval(600, 220, 30, 40);
        g.fillOval(590, 240, 30, 30);
        g.fillOval(610, 240, 30, 30);
        g.fillRect(610, 260, 9, 60);
        g.setColor(Color.green);
        g.fillOval(660, 220, 30, 40);
        g.fillOval(650, 240, 30, 30);
        g.fillOval(670, 240, 30, 30);
        g.fillRect(670, 260, 9, 60);

        
        g.setColor(Color.black);
        g.fillRect(0, 300, 1020, 50);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.white);
        float[] dash = {20.0f};
        BasicStroke strok = new BasicStroke(3.0f, BasicStroke.CAP_SQUARE,
                BasicStroke.JOIN_MITER, 1.0f, dash, 0.0f);
        g2d.setStroke(strok);
        g2d.draw(new Line2D.Double(10, 320, 1000, 320));


        g.setColor(Color.green);
        g.fillOval(720, 250, 30, 40);
        g.fillOval(710, 270, 30, 30);
        g.fillOval(730, 270, 30, 30);
        g.fillRect(730, 290, 9, 60);
        g.setColor(Color.green);
        g.fillOval(780, 250, 30, 40);
        g.fillOval(770, 270, 30, 30);
        g.fillOval(790, 270, 30, 30);
        g.fillRect(790, 290, 9, 60);

        
        g.setColor(Color.red);
        g.fillRect(205, 305, 100, 30);
        g.fillOval(207, 278, 104, 45); 
        g.setColor(Color.blue);
        g.fillRect(210, 305, 100, 30); 
        g.fillOval(210, 280, 100, 45); 
        g.fillArc(180, 298, 60, 70, 0, 180);
        g.fillArc(285, 298, 60, 70, 0, 180);
        g.setColor(Color.yellow);
        g.fillArc(318, 301, 23, 23, 0, 80);
        g.setColor(Color.black); 
        g.fillOval(198, 313, 32, 32); 
        g.fillOval(298, 313, 32, 32); 
        g.setColor(Color.white); 
        g.fillOval(204, 319, 20, 20); 
        g.fillOval(304, 319, 20, 20); 
        g.setColor(Color.red);
        g.fillArc(230, 285, 70, 40, 0, 90);
        g.setColor(Color.black);
        g.fillArc(234, 286, 64, 36, 0, 90);
        g.setColor(Color.red);
        g.fillArc(220, 285, 70, 40, 90, 90);
        g.setColor(Color.black);
        g.fillArc(223, 286, 68, 36, 90, 90);
        g.setColor(Color.red);
        g.fillRect(258, 286, 10, 18);


        g.setColor(Color.white);
        g.fillOval(30 + Rotation2, 70, 90, 40);
        g.fillOval(70 + Rotation2, 70, 90, 40);
        g.fillOval(40 + Rotation2, 60, 50, 50);
        g.fillOval(90 + Rotation2, 60, 50, 50);
        g.fillOval(210 + Rotation1, 90, 90, 40);
        g.fillOval(250 + Rotation1, 90, 90, 40);
        g.fillOval(220 + Rotation1, 80, 50, 50);
        g.fillOval(270 + Rotation1, 80, 50, 50);
        g.fillOval(820 - Rotation1, 50, 90, 40);
        g.fillOval(860 - Rotation1, 50, 90, 40);
        g.fillOval(830 - Rotation1, 40, 50, 50);
        g.fillOval(880 - Rotation1, 40, 50, 50);


        g.setColor(Color.red);
        g.fillRect(100, 120, 100, 35);
        g.setColor(Color.white);
        g.fillRect(100, 150, 100, 35);
        g.fillRect(100, 150, 5, 150);

    }
}
