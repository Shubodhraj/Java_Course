package JWT;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.Color;
import java.awt.event.*;

public class EventHandlingOuterClass {

    JFrame jf;
    JButton b;
    JLabel l;

    EventHandlingOuterClass() {
        JFrame jf = new JFrame();
        JButton b = new JButton("Red");
        l = new JLabel("Label");
        jf.setLayout(null);
        jf.setSize(500, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.setBounds(100, 100, 100, 50);
        jf.add(b);

        l.setBounds(250, 100, 150, 50);
        jf.add(l);

        b.addActionListener(eh);
    }

    EventHandlerExample eh = new EventHandlerExample(this);

    public static void main(String[] args) {
        new EventHandlingOuterClass();

    }

}

class EventHandlerExample implements ActionListener {
    EventHandlingOuterClass ehoc;

    EventHandlerExample(EventHandlingOuterClass ehoc) //passing the object of EventHandlingOuterClass to EventHandlerExample class constructor.
     {    
        this.ehoc = ehoc;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ehoc.l.setText("HI hello");
        ehoc.l.setBackground(Color.BLUE);

    }
}
