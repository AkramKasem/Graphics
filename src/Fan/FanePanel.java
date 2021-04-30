/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fan;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author akram
 */
public class FanePanel extends JPanel {

    private Color fanColor = Color.BLACK;

    private int angle = 0;
    private boolean clickWise = false ;

    public void drawFan(Graphics g) {
        g.setColor(fanColor);
        int w = (int) (0.8 * getWidth());
        int h = (int) (0.8 * getHeight());

        int x = (int) (0.1 * getWidth());
        int y = (int) (0.1 * getHeight());

        for (int i = 0; i <= 3; i++) {
            g.fillArc(x, y, w, h, i * 90 + angle, 30);
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFan(g);

    }

    public Color getFanColor() {
        return fanColor;
    }

    public void setFanColor(Color fanColor) {
        this.fanColor = fanColor;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public boolean isClickWise() {
        return clickWise;
    }

    public void setClickWise(boolean clickWise) {
        this.clickWise = clickWise;
    }

    
}
