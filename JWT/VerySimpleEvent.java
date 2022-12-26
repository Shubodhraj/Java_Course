package JWT;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.*;

class MyEvent implements ActionListener{

JFrame jf;
JTextField tf;
JButton b1, b2;
JLabel l1;

MyEvent(){
    jf = new JFrame();
    jf.setVisible(true);
    jf.setSize(500,500);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setLayout(null);
    tf = new JTextField();
    tf.setBounds(50, 50, 100, 20);
    
    b1 = new JButton("Click");
    b1.setBounds(50, 100, 100, 20);

    b2 = new JButton("Clear");
    b2.setBounds(200, 100, 100, 20);

    l1 = new JLabel("Label");
    l1.setBounds(250, 70, 50, 20);

    jf.add(tf);
    
    jf.add(l1);
    jf.add(b2);
    jf.add(b1);

    // Event1 e1 = new Event1();

    b1.addActionListener(this);

    // Event2 e2 = new Event2();
    b2.addActionListener(this);



}


// class Event1 implements ActionListener{

//     @Override
//     public void actionPerformed(ActionEvent e) {
//             String s = tf.getText();
//             l1.setText(s.toUpperCase());



//         // TODO Auto-generated method stub
        
//     }

       
// }

// class Event2 implements ActionListener{

//     @Override
//     public void actionPerformed(ActionEvent arg0) {

//         tf.setText("");
//         // TODO Auto-generated method stub
        
//     }
    
// }



public static void main(String[] args) {
    
    new MyEvent();
}


@Override
public void actionPerformed(ActionEvent ob) {
    if(ob.getSource() == b1){
        String s = tf.getText();
        tf.setText(s.toUpperCase());}


    else{
        tf.setText("");
    }

    }
    // TODO Auto-generated method stub

    
}

















// public class VerySimpleEvent {
// JFrame jf;
// JButton b;
// JLabel l;
//     VerySimpleEvent()
// {
//     JFrame jf = new JFrame();
//     JButton b = new JButton("Red");
//     l = new JLabel("Label");
//     jf.setLayout(null);
//     jf.setSize(500, 500);
//     jf.setVisible(true);
//     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//     b.setBounds(100, 100, 100, 50);
//     jf.add(b);

//     l.setBounds(250, 100, 150, 50);
//     jf.add(l);
    
//     b.addActionListener(eh);
// }   
// EventHandlerExample eh = new EventHandlerExample();
// // public AbstractButton jf;
// public static void main(String[] args) {
//          new VerySimpleEvent();

//     }
//     class EventHandlerExample implements ActionListener{

//         @Override
//         public void actionPerformed(ActionEvent e) {
//            //System.out.println("Hello");
//            l.setText("HI hello");
//            l.setBackground(Color.BLUE);
//         //    jf.setBackground(Color.RED);
//             // TODO Auto-generated method stub
            
//         }
    
//     }


    
// }




