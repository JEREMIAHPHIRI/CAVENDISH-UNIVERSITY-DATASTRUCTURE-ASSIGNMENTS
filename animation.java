/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author j3r3miah
 */

public class animation extends JPanel implements ActionListener{
    String happy;
    Timer time=new Timer(5,this);
    int number=0 , velnumber=2;
    JButton animate=new JButton();
    @Override
   public void paintComponent(Graphics g){
       super.paintComponent(g);
      
        g.setColor(Color.RED);
        g.fillRect(number,333,22,222);
        //g.drawArc(number, 333, 222,333,222,22);
       time.start();
        
     } 
   
 public void actionPerformed(ActionEvent e){
   if(number <0 || number >378)
     velnumber = -velnumber;
      number= number + velnumber;
      repaint();
    
    
 }
  public static void main(String[] args){
        animation t=new animation();
        JFrame m=new JFrame();
        m.setSize(400,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.add(t);
    
   }
 }
