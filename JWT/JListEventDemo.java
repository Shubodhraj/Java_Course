package JWT;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.Dimension;
import java.awt.FlowLayout;

class Frame extends JFrame implements ListSelectionListener{
   
    private JList jl;
    private JButton jb;
    private String[] names = {"Nokia","Samsung","Htc","Sony",
                       "Apple","Sony Ericsson","Philips",
                       "Toshiba","Micromax","Lenovo","Celkon",
                       "Casio","Acer"}; 
    Frame()
    {
        setTitle("JList with ListSelectionListener");
        setLayout(new FlowLayout());
        setJList();
        setJListAction();
        setSize(700,250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void setJList()
    {
        jl = new JList(names);
        JScrollPane js = new JScrollPane(jl);
        js.setPreferredSize(new Dimension(200,200));
        add(js);
        jb = new JButton("Select any one brand");
        add(jb);
    }
    
    private void setJListAction()
    {
        jl.addListSelectionListener(this);
    }
    
    public void valueChanged(ListSelectionEvent eve)
    {
        int returns = jl.getSelectedIndex();
        if(returns != -1)
        {
            jb.setText("Your selection : "+names[returns]);
        }
        else if(returns == -1)
        {
            jb.setText("Select any one brand");
        }
    }
}

class Javaapp {
   
    public static void main(String[] args) {
        
       Frame fr = new Frame();
    }
}