package XO;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fin extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1600441073860748609L;
    JPanel contentPane, botomPane, p;
    JLabel imageLabel, headerLabel;
    JButton Replay, exit;
    Box b, bb, bbb;

    public Fin(String X_or_O) {
        try {
            imageLabel = new JLabel();
            headerLabel = new JLabel();
            Replay = new JButton("Try Again");
            exit = new JButton("exist");
            Replay.addActionListener(this);
            exit.addActionListener(this);
            b = Box.createHorizontalBox();
            bb = Box.createHorizontalBox();
            p = new JPanel();
            botomPane = new JPanel(new GridLayout(2, 1));
            botomPane.add(Replay);
            botomPane.add(exit);
            botomPane.add(bb);
            this.setUndecorated(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.contentPane = (JPanel) getContentPane();
            this.contentPane.setLayout(new BorderLayout());
            this.setSize(330, 300);
            headerLabel.setFont(new java.awt.Font("Comic sans ms", Font.BOLD, 40));
            headerLabel.setText(X_or_O );
            b.add(headerLabel);
            p.add(b);
            contentPane.add(p, java.awt.BorderLayout.NORTH);
            ImageIcon ii = new ImageIcon(this.getClass().getResource("Winner.gif"));
            imageLabel.setIcon(ii);
            this.contentPane.add(imageLabel, java.awt.BorderLayout.CENTER);
            this.contentPane.add(botomPane, java.awt.BorderLayout.SOUTH);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            
            
            
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            System.exit(0);
        } else if (e.getSource() == Replay) {
            this.dispose();
            Test.gui.isEnded = false;
            Test.gui.reset();
            Test.gui.engine.reset();
        }

    }


}
