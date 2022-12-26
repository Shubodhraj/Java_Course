package JWT;
import javax.swing.*;


public class SwingFrame {

public static void main(String[] args) {
    JFrame jf = new JFrame("Swing Example");
    jf.setVisible(true);
    // jf.setTitle("Swing Example");
    jf.setSize(300, 300);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // JLabel l1, l2, l3, l4;
    JTextField t2, t3, t4;
    JButton b1;
    
    JLabel l1 = new JLabel("Addition of two numbers: ");
    JLabel  l2 = new JLabel("First Number: ");
    JLabel l3 = new JLabel("Second Number: ");
    JLabel  l4 = new JLabel("Result: ");

    t2 = new JTextField();
    t3 = new JTextField();
    b1 = new JButton("Add");
    t4 = new JTextField();

    jf.setLayout(null);
    l1.setBounds(50, 50, 200, 20);
    
    l2.setBounds(50, 80, 100, 20);
    t2.setBounds(250, 80, 100, 20);

    l3.setBounds(50, 130, 150, 50);
    t3.setBounds(250, 130, 150, 20);
    
    // l4.setBounds(50, 240, 200, 200);
    
    b1.setBounds(50, 230, 100, 20);
    t4.setBounds(250, 230, 100,  20);
    




    jf.add(l1);
    
    jf.add(l2);
    jf.add(t2);
    
    // jf.add(l2);
    
    jf.add(l3);
    jf.add(t3);

    // jf.add(l4);
    jf.add(b1);
    jf.add(t4);



}
    
}
