
package datastructure;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class paint extends JPanel implements ActionListener{
         private JLabel lable=new JLabel("THIS IS MOUNT GOMERY");
         int x=0, velx=2;
         Timer time=new Timer(10, this);
         Timer time1=new Timer(50, this);
         Timer time2=new Timer(100, this);
         
         public void paintComponent(Graphics g){
             super.paintComponent(g);
             g.setColor(Color.RED);
             g.drawRect(x,222,23,2);
             
             time.start();
               g.drawRoundRect(x,200,x,22,x,22);
                time1.start();
                  g.drawOval(x,200,330,22);
                     time2.start();
                       g.drawLine(10,x,330,22);
                     time2.start();
                        g.drawLine(100,x,90,x);
                     time2.start();}
                  
   public void actionPerformed(ActionEvent e){
       //but
       if(x<0 || x>460)
           velx= -velx;
        
           x=x+velx;
           repaint(); 
             
         
         }
   
          public static void main(String[] args){
              JFrame frame=new JFrame();
               paint n=new paint();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
               frame.setSize(400,400);
               frame.add(n);
        
    } 
    
    
}
