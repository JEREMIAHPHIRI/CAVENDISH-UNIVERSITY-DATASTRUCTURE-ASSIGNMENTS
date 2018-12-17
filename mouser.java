
package datastructure;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

   ;
public class mouser extends JFrame{
    private JLabel label;
    private JPanel mouse;
public mouser(){
    super("new one");
   
    label=new JLabel();
    mouse=new  JPanel();
     mouse.setLayout(new FlowLayout(333));
     mouse.setBackground(Color.WHITE);
     add(mouse,BorderLayout.CENTER);
     add(label,BorderLayout.EAST);
          
     
    handler handle=new handler(); 
     mouse.addMouseListener(handle);
     label.addMouseListener(handle);     
}   
  private class handler implements MouseListener,MouseMotionListener{
    
      @Override   
     public void mouseClicked(MouseEvent event){
         label.setText("clicked");
         mouse.setBackground(Color.RED);
        }
      @Override
      public void mousePressed(MouseEvent event)
      {
          label.setText("pressed");
         mouse.setBackground(Color.PINK);
      
      
      }
       @Override
      public void mouseReleased(MouseEvent event){
               label.setText("release");
         mouse.setBackground(Color.WHITE);
     }
      
       @Override
      public void mouseEntered(MouseEvent event){
              label.setText("entered");
         mouse.setBackground(Color.WHITE);
      
      
      }
    @Override
      public void mouseExited(MouseEvent event){
          label.setText("exited");
         mouse.setBackground(Color.red);
      
      }
       @Override
      public void mouseDragged(MouseEvent event){
            label.setText("dreaagin");
         mouse.setBackground(Color.pink);
       
      }
      
        @Override
      public void mouseMoved(MouseEvent event){
            label.setText("moving");
         mouse.setBackground(Color.yellow);
       
      } 
}
  public static void main(String[] args){
      mouser m=new mouser();
    
       m.setSize(400,400);
       m.setVisible(true);
          m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  }
  
  
}

