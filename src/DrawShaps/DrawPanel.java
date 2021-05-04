/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawShaps;

import Rectangle.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.QuadCurve2D;
import java.util.Random;
import javafx.scene.shape.Ellipse;
import javax.swing.JFrame;

/**
 *
 * @author Akram
 */
public class DrawPanel extends JFrame {

    
    public void drawingEllipse(Graphics2D graphics2D){
        
        Ellipse2D  d = new Ellipse2D.Double(100, 100, 400, 400);
        graphics2D.fill(d);
        
    }
    
    public void drawingQuadCurve(Graphics2D graphics2D){
        graphics2D.setColor(Color.blue);
        QuadCurve2D  d = new QuadCurve2D.Double(100, 100, 200, 200 , 300 , 100);
        graphics2D.fill(d);
        graphics2D.drawLine(200, 200, 200, 200);
    }
    
     public void drawingCubicCurve(Graphics2D graphics2D){
        graphics2D.setColor(Color.red);
         CubicCurve2D  d = new CubicCurve2D.Double(100, 100, 100, 200 , 300 , 200 , 300 ,100);
        graphics2D.fill(d);
        graphics2D.setColor(Color.white);
        graphics2D.drawLine(100, 200, 100, 200);
        graphics2D.drawLine(300, 200, 300, 200);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D gd = (Graphics2D) g ;
        gd.setColor(Color.red);
        gd.setStroke(new BasicStroke(3));
        
        drawingCubicCurve(gd);
        drawingQuadCurve(gd);
//        drawingEllipse(gd);
    }

}
