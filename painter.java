
package datastructure;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class painter extends JPanel implements ActionListener{
    int x=0, velx=4;
    Timer time=new Timer(5,this);
     public void paintComponent(Graphics g){
           super.paintComponent(g);
           
           g.setColor(Color.GREEN);
           g.fillRect(300,x,20,22);
            g.fillRect(x,x,20,22);
             g.fillRect(x,200,x,22);
           time.start();
                  
     }
    public void actionPerformed(ActionEvent e){
     if(x<0 || x>378) 
      velx= -velx;
     x= x+velx;
     repaint();
        
    
    
    }
    
    public static void main(String[] args){
              JFrame frame=new JFrame();
               painter n=new painter();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
               frame.setSize(400,400);
               frame.add(n);
        
    }
    
    
}
