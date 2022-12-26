package JWT;

// import javax.swing.*;    
// import java.awt.event.*;    

// class ComboBoxExample implements ActionListener{    
// JFrame f;  
// JLabel label;  
// JButton b;

// JComboBox cb;

// ComboBoxExample(){    
//     f=new JFrame("ComboBox Example");   
//     final JLabel label = new JLabel();          
//     label.setHorizontalAlignment(JLabel.CENTER);  
//     label.setSize(400,100);  
//     JButton b=new JButton("Show");  
//     b.setBounds(200,100,75,20);  
//     String languages[]={"C","C++","C#","Java","PHP"};        
//     final JComboBox cb=new JComboBox(languages);    
//     cb.setBounds(50, 100,90,20);    
//     f.add(cb); f.add(label); f.add(b);    
//     f.setLayout(null);    
//     f.setSize(350,350);    
//     f.setVisible(true);       
//     b.addActionListener(this); 
       
// }    



// public static void main(String[] args) {    
//     new ComboBoxExample();         
// }
// @Override
// public void actionPerformed(ActionEvent e) {
          
// String data = "Programming language Selected: "   
//    + cb.getItemAt(cb.getSelectedIndex());  
//     label.setText(data);  
// }  

//     // TODO Auto-generated method stub
    
// }    
 


import javax.swing.*;    
import java.awt.event.*;    
class ComboBoxExample {    
JFrame f;   
JLabel label;
JButton b;
ComboBoxExample(){    
    f=new JFrame("ComboBox Example");   
    JLabel label = new JLabel();          
    label.setHorizontalAlignment(JLabel.CENTER);  
    label.setSize(400,100);  
    label.setBounds(70, 50, 300, 20);
    JButton b=new JButton("Show");  
    b.setBounds(200,100,75,20);  
    String languages[]={"C","C++","C#","Java","PHP"};        
     JComboBox cb=new JComboBox(languages);    
    cb.setBounds(50, 100,90,20);    
    f.add(cb);
    f.add(label); 
    f.add(b);    
    f.setLayout(null);    
    f.setSize(500,500);    
    f.setVisible(true);       
    b.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e) {       
String data = "Programming language Selected: "   
   + cb.getItemAt(cb.getSelectedIndex());  
label.setText(data);  
}  
});           
}    
public static void main(String[] args) {    
    new ComboBoxExample();         
}    
}    