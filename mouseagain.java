
package datastructure;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class mouseagain extends JFrame{
    private JPanel mouse;
    private JLabel lable;
    
    
 public mouseagain(){
   super("mouse movements");
    
       mouse=new JPanel();
       lable=new JLabel();

     mouse.setBackground(Color.WHITE);
     mouse.setLayout(new FlowLayout());
     lable.setBackground(Color.white);
   
   //handling class prototype
    hand handle=new hand();
    mouse.addMouseListener(handle);
    lable.addMouseListener(handle);
   add(mouse,BorderLayout.CENTER);
   add(lable,BorderLayout.SOUTH);
 }
 
 
 private class hand implements MouseListener,MouseMotionListener{
           @Override
          public void mouseClicked(MouseEvent event){
          lable.setText("mosue on click");
           mouse.setBackground(Color.green);
          
          }
            @Override
          public void mousePressed(MouseEvent event){
          lable.setText("mosue pressed");
           mouse.setBackground(Color.yellow);
          }
           @Override
          public void mouseReleased(MouseEvent event){
          lable.setText("mosue released");
           mouse.setBackground(Color.blue);
          
          }
          
             @Override
          public void mouseEntered(MouseEvent event){
          lable.setText("mouse arena enter");
           mouse.setBackground(Color.green);
       
          }
          
           @Override
          public void mouseExited(MouseEvent event){
          lable.setText("mouse arena exited");
           mouse.setBackground(Color.white);
          
          
          }
          
           @Override
          public void mouseDragged(MouseEvent event){
          lable.setText("mouse arena being dragged");
           mouse.setBackground(Color.white);
          
          
          }
          
           @Override
          public void mouseMoved(MouseEvent event){
          lable.setText("mouse arena moving off the cliff");
           mouse.setBackground(Color.white);
          
          
          }
          
          
          
          }
        
    
    public static void main(String[] args){
        mouseagain m=new mouseagain();
        m.setSize(444,333);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    }  
          
 
 
 }
 
            


                                     