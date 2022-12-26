package JWT;
import javax.swing.*;
import java.awt.event.*;

class CalculateEvent extends JFrame  {
    JLabel l1, l2, l3, l4;
    JTextField t2, t3, t4;
    JButton b1, b2;
    JFrame jf;

public void eventTest(){
    
    jf = new JFrame();


    jf.setVisible(true);
    jf.setSize(300, 300);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    l1 = new JLabel("Addition of two numbers: ");
    l2 = new JLabel("First Number: ");
    l3 = new JLabel("Second Number: ");
    l4 = new JLabel("Result: ");

    t2 = new JTextField();
    t3 = new JTextField();
    b1 = new JButton("Add");
    b2 = new JButton("Clear");
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

    b2.setBounds(50, 330, 100, 20);
    




    jf.add(l1);
    
    jf.add(l2);
    jf.add(t2);
    
    // jf.add(l2);
    
    jf.add(l3);
    jf.add(t3);

    // jf.add(l4);
    jf.add(b1);
    jf.add(b2);
    jf.add(t4);



    event e = new event();
    b1.addActionListener(e);

    event2 e2 = new event2();
    b2.addActionListener(e2);






}

public class event2 implements ActionListener{

  
    public void actionPerformed(ActionEvent e1) {
       
        t2.setText("");
        t3.setText("");
        t4.setText("");

        
    }

   
}



public class event implements ActionListener{


    
public void actionPerformed(ActionEvent ae){
int a = Integer.parseInt(t2.getText());
int b = Integer.parseInt(t3.getText());
int c = a +b;
String s = Integer.toString(c);
t4.setText(s);
}
}


 

public static void main(String[] args) {
    CalculateEvent eh = new CalculateEvent();
    eh.eventTest();
}

   

}







