
package datastructure;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class apple extends JFrame{
    JButton butt;
      JTextField xf,yf,zf;
        JTextArea text;
      //private String xf,yf,zf;
     public apple(){
         
         super("summer");
         setLayout(new FlowLayout());
         
        
           JLabel x =new JLabel("x");
           JLabel y=new JLabel("y");
           JLabel z=new JLabel("z");
         
                xf=new JTextField(25);
                yf=new JTextField(25);
                zf=new JTextField(25);
           
             butt=new JButton("solve");
            text=new JTextArea(10,10);
               
               
            
              add(x);  
              add(xf);
              add(y);
              add(yf);
              add(z); 
              add(zf);
              add(butt);
              add(text);
                      
                      Handler handle=new Handler();
                      xf.addActionListener(handle);
                      yf.addActionListener(handle);
                      zf.addActionListener(handle);
                         butt.addActionListener(handle);
                          //text.addActionListener(handle);
     
     
     }
     
     class Handler implements ActionListener{
         @Override
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==butt){
             String xfs,yfs,zfs;
               xfs=xf.getText();
               yfs=yf.getText();
               zfs=zf.getText();
                  double xfd,yfd,zfd;
                     xfd=Double.parseDouble(xfs);
                     yfd=Double.parseDouble(yfs);
                     zfd=Double.parseDouble(zfs);
                  if(zfd>0 && yfd>0 && xfd>0){
                  double adder=zfd*yfd*xfd;
                      // convert back to text for display
                             String xfdc,yfdc,zfdc,adderstring;
                                    xfdc=String.valueOf(xfd);
                                    yfdc=String.valueOf(yfd);
                                    zfdc=String.valueOf(zfd);
                                    adderstring=String.valueOf(adder);
                               text.setText(adderstring);
                               //JOptionPane.showMessageDialog(null,adderstring);    
                               
                     
                     
                     
                     }
                     else{
                            JOptionPane.showMessageDialog(null,"pelase enter a numer greater than zero");
                     
            }
         }
       }
    }
     
    
    public static void main(String[] args){
          //JFrame l=new JFrame();
          
         apple l=new apple();
         // l.add(l);
          l.setSize(600,400);
          l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          l.setVisible(true);
    }
 }
