package JWT;
import javax.swing.*;
import java.awt.event.*;

class EventHandling implements ActionListener{
JFrame jf;
JButton b;
JTextField tf;
JLabel l1;

public void eventTest(){
    jf = new JFrame();
    jf.setVisible(true);
    jf.setSize(300, 300);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    b = new JButton();
    tf = new JTextField();

    l1 = new JLabel("Event handling");
    l1.setBounds(50, 50, 200, 20);
    jf.add(l1);

    jf.setLayout(null);
    b.setBounds(50, 80, 100, 20);
    tf.setBounds(250, 80, 100, 20);

    jf.add(b);
    jf.add(tf);
    b.addActionListener(this);

}
 

public void actionPerformed(ActionEvent ae){
String s = "Hello";
tf.setText(s);
}




public static void main(String[] args) {
    EventHandling eh = new EventHandling();
    eh.eventTest();
}

   

}


