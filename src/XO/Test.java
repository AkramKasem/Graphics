package XO;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * Simple Test Program to run the whole application
 * @author Wonjohn Choi
 *
 */
public class Test {
    static GUI gui;
	public static void main(String args[])
	{
        JFrame frame = new JFrame();
        frame.setTitle("Tic Tac Toe Game");
        frame.setSize(450, 450);
        frame.setResizable(false);

        JButton button = new JButton("Start Game");
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.add(button,GridLayout.class);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {  
                frame.dispose();
                gui = new GUI();
            }
        });
            
            
		
	}
}
