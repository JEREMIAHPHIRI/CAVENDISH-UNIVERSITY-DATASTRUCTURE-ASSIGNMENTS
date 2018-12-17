
package datastructure;

import java.awt.*;
import javax.swing.*;

public class happlet extends JPanel{
    private int diameter=100;
     public void paintComponent(Graphics g){
         super.paintComponent(g);
         g.fillOval(10,10,diameter,diameter);
              
     }
    
    public void setdiameter(int newdiameter)
    {
    
    diameter=(newdiameter>=0? newdiameter:10);
    repaint();    
    
    }
    public Dimension getPreferredSize(){
    return new Dimension(200,200);
    }
    
    
    
     public Dimension getMinimumSize(){
    return getPreferredSize();
    }
    
}
