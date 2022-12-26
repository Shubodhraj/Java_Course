package JWT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleEventExample implements ActionListener {
    JFrame jf;
    JButton b1, b2 ;
    JTextField t1;
    JLabel l1;
   
    void createFrame(){
        jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(200,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(null);

        t1 = new JTextField();
        t1.setBounds(50, 50, 150, 50);
        jf.add(t1);

        b1 = new JButton("To Capital");
        b1.setBounds(50, 100, 150, 50);
        jf.add(b1);

        b2 = new JButton("Reset");
        b2.setBounds(250, 150, 150, 50);
        jf.add(b2);

        l1 = new JLabel();
        l1.setBounds(50, 150, 150, 50);
        jf.add(l1);

        b1.addActionListener(this);

        b2.addActionListener(ce);

    }

public static void main(String[] args) {
    SimpleEventExample se = new SimpleEventExample();
    se.createFrame();
    
}


public void actionPerformed(ActionEvent e) {

    String s = t1.getText();
    String s1 = s.toUpperCase();
    l1.setText(s1);
    
    
}

public class clearEvent implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        t1.setText("");
        
    }
     
}
clearEvent ce = new clearEvent(); 
}
