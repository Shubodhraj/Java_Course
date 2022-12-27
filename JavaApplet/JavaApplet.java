package JavaApplet;
import javax.swing.*;  
import java.applet.*;
import java.awt.*;

public class JavaApplet extends JApplet {
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("Hello, welcome!! ", 50, 50);



    }
    
}
/* 
<applet code="public class JavaApplet extends JApplet {
.class" width="300" height="300"> 
</applet> 
*/  