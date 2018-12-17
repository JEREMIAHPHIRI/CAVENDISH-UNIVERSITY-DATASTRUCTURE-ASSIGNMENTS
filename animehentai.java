
package datastructure;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class animehentai extends JPanel implements ActionListener{
    int v=0, velx=2;
    Timer d=new Timer(20,this);
    
    public void paintComponent(Graphics g){
             super.paintComponent(g);
             g.setColor(Color.GREEN);
             g.fillRect(v,100,23,v);
             g.setColor(Color.RED);
             g.fillRect(v,100,23,89);
                 g.setColor(Color.BLUE);
             g.drawArc(v,100,300,v,300,400);
             g.drawArc(62,100,300,v,300,velx); 
             g.drawArc(v,100,300,v,300,velx); 
             g.drawArc(33,100,300,v,300,velx); 
             g.setColor(Color.GREEN);
             g.drawArc(v,100,300,v,300,-velx); 
             g.drawArc(5,100,300,v,300,v); 
             g.setColor(Color.PINK);
             g.drawArc(v,100,300,-v,300,-velx); 
             g.drawArc(7,100,300,v,300,v);
             g.setColor(Color.ORANGE);
             g.fillRect(-v,velx,v,-velx);
            
             d.start();
    }
     public void actionPerformed(ActionEvent e){
         if(v<0 || v>150)
         velx=-velx;
         v=v + velx;
         repaint();
     
     
     }
    public static void main(String[] args)
    {
         JFrame m=new JFrame();
         animehentai a=new animehentai();
         m.add(a);         
        m.setSize(200,200);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
}
