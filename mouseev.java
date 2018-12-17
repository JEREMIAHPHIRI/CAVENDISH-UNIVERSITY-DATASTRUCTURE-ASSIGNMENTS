
package datastructure;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author j3r3miah
 */
public class mouseev extends JFrame{
       //mouse events
    private JPanel mousepanel;
    private JLabel statusbar;
    
    public mouseev(){
     super("mouse event holder");
      
     mousepanel=new JPanel();
     mousepanel.setBackground(Color.WHITE);
     mousepanel.setLayout(new FlowLayout());
     statusbar=new JLabel();
     add(mousepanel,BorderLayout.CENTER);
     add(statusbar,BorderLayout.SOUTH);     
     handler handle=new handler();
        mousepanel.addMouseListener(handle);
        statusbar.addMouseListener(handle);
     
}
   
    public  class handler implements MouseListener,MouseMotionListener{
     @Override  
    public void mouseClicked(MouseEvent event){
        statusbar.setText("mosuse now clicked");
        mousepanel.setBackground(Color.GREEN);}
     @Override
    public void mousePressed(MouseEvent event){
         statusbar.setText("mouse now pressed");
          mousepanel.setBackground(Color.pink);
    }
    public void mouseReleased(MouseEvent event){
         statusbar.setText("mouse now releease");
          mousepanel.setBackground(Color.BLACK);
    
    }
     @Override
    public void mouseEntered(MouseEvent event){
       statusbar.setText("you have entered the zone");
           mousepanel.setBackground(Color.BLUE);

    }
      @Override
     public void mouseExited(MouseEvent event){
          statusbar.setText("you exitig the xone");
           mousepanel.setBackground(Color.WHITE);  
     }
     @Override
     public void mouseDragged(MouseEvent event){
         statusbar.setText("are you drugged?"); 
         
         
     } 
     @Override
     public void mouseMoved(MouseEvent event){
         statusbar.setText("are you moving the mouse?"); 
         }    
    } 
    public static void main(String[] args){
        mouseev m=new mouseev();
        m.setSize(444,333);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    }
}
