
package datastructure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ani extends JPanel implements ActionListener{
    //animation not mouseevent
    Timer time=new Timer(20,this);
    int x=0 , velx=2;
    
     public void paintComponent(Graphics g){
         super.paintComponent(g);
          g.setColor(Color.RED);
          g.fillRect(34,x,4,x);
          g.setColor(Color.BLUE);
          g.drawArc(x,3,230/velx,5*x,x,x);
          time.start();
     }
     
     public void actionPerformed(ActionEvent e){
      if(x<0 || x>400)
          velx=-velx;
          
     x=x+velx;
     repaint();
     
     
     }
     
      public static void main(String[] args){
        JFrame m=new JFrame();
        ani call=new ani();
        m.add(call);
        m.setSize(444,333);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    }
    
}
