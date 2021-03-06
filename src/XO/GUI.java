package XO;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * manipulates general GUI stuff
 *
 * @author Wonjohn Choi
 *
 */
public class GUI implements ActionListener {
    //manage general frame

    protected JFrame frame;
    protected JButton[][] buttons;
    protected Engine engine;
    protected boolean isEnded;

    /**
     * constructor
     */
    public GUI() {
        //instantiate
        frame = new JFrame("Tic-tac-toe ");
        buttons = new JButton[3][3];
        engine = new Engine();

        //set frame layout
        frame.setLayout(new GridLayout(3, 3));

        //flag to see whether game ended
        isEnded = false;

        //add buttons to frame
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton();
                frame.add(buttons[row][col]);
                buttons[row][col].addActionListener(this);
            }
        }

        //basic settings
        frame.setSize(450, 450);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * @Override when an action is performed,
     */
    public void actionPerformed(ActionEvent e) {
        //if game is not ended,
        if (!isEnded) {
            //get the chosen button
            JButton chosen = (JButton) e.getSource();
            //search for the button's location
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {

                    //if matched,
                    if (chosen == buttons[row][col]) {

                        //fill the virtual grid of engine
                        engine.fill(row, col, engine.currentPlayer);

                        //fill the text area of the button
                        if (engine.currentPlayer == Engine.O) {
                            ImageIcon ii = new ImageIcon(this.getClass().getResource("o.png"));
                            chosen.setIcon(ii);
                        } else if (engine.currentPlayer == Engine.X) {
                            ImageIcon ii = new ImageIcon(this.getClass().getResource("x.png"));
                            chosen.setIcon(ii);
                        }
                    }
                }
            }

            //disable the button
            chosen.setEnabled(false);

            //get the status of the game
            int status = engine.getStatus();

            //if game is ended,
            if (status != 0) {
                isEnded = true;

                //send the appropriate message
                if (status == 1) {
                    Fin x = new Fin("X Win");
//                    JOptionPane.showMessageDialog(frame, "'X' wins the game!");
                } else if (status == 2) {
                    Fin x = new Fin("O Win");
//                    JOptionPane.showMessageDialog(frame, "'O' wins the game!");
                } else if (status == 3) {
                    Fin x = new Fin("The game is tie!");
//                    JOptionPane.showMessageDialog(frame, "The game is tie!");
                }

//                int answer = JOptionPane.showConfirmDialog(frame, "Do you want to play another game?", "Message", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//                if (answer == JOptionPane.YES_OPTION) {
//                    isEnded = false;
//                    reset();
//                    engine.reset();
//                } else {
//                    System.exit(0);
//                }
            } else {
                //move to the next player
                engine.currentPlayer = engine.currentPlayer % 2 + 1;
            }
        }
    }

    public void reset() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col].setText("");              
                buttons[row][col].setIcon(null);
                buttons[row][col].setEnabled(true);
            }
        }
    }

}
