package JWT;

import javax.swing.*;
import java.awt.event.*;

public class KeyEventDemo implements KeyListener, ActionListener{
    JFrame jf;
    JTextField tf;
    JLabel jl;
    JButton jb;


    KeyEventDemo(){
        jf = new JFrame();
        jf.setSize(500, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(null);
        tf = new JTextField();
        tf.setBounds(50, 50, 200, 20);
        jf.add(tf);

        jl = new JLabel();
        jl.setBounds(50, 100, 100, 20);
        jf.add(jl);

        jb = new JButton("Clear");
        jb.setBounds(250, 100, 100, 20);
        jf.add(jb);

        tf.addKeyListener(this);

        // BottonClear bc =  new BottonClear();
        jb.addActionListener(this);

    }
    public static void main(String[] args) {
        new KeyEventDemo();
    }
    @Override
    public void keyPressed(KeyEvent arg0) {
        // TODO Auto-generated method stub
        String s = "Key is pressed";
        jl.setText(s);
        
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub
        String s = "Key is released";
        jl.setText(s);
        
    }
    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub
        String s = "We are typing";
        jl.setText(s);
        
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        tf.setText("");
        
    }

   



    // class BottonClear implements ActionListener{

    //     @Override
    //     public void actionPerformed(ActionEvent arg0) {
    //         // TODO Auto-generated method stub
    //         tf.setText("");
            
    //     }

    // }

}


