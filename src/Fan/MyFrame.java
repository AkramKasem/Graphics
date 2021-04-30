/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fan;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author akram
 */
public class MyFrame  extends JFrame{

    public MyFrame(){
        setTitle("My Fan Frame");
        setSize(300 ,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        FanePanel fp = new FanePanel();
        fp.setSize(100,100);
        fp.setLocation(50, 50);
        
        FanePanel fp2 = new FanePanel();
        fp2.setSize(100,100);
        fp2.setLocation(50, 150);
        
        Container c = getContentPane();
        c.setLayout(null);
        c.add(fp);
        c.add(fp2);
                
        setVisible(true);
               
    }
    public static void main(String[] args) {
        new MyFrame();
    }
    
    
    
}
