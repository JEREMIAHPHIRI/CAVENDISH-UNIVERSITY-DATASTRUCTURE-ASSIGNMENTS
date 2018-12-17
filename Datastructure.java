/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author j3r3miah
 */
public class Datastructure extends JPanel {
    
  
    
  String X =JOptionPane.showInputDialog(null,"Enter first x cordinate");
      String Y =JOptionPane.showInputDialog(null,"Enter first Y CORDIDNATE ");
      String X2 =JOptionPane.showInputDialog(null,"Enter second x cordinate");
      String Y2 =JOptionPane.showInputDialog(null,"Enter second Y CORDIDNATE ");
     int x=Integer.parseInt(X);
     int y=Integer.parseInt(Y);
     int x2=Integer.parseInt(X2);
     int y2=Integer.parseInt(Y2);
        String xs=String.valueOf(x),ys=String.valueOf(y),sx2=String.valueOf(x2),sy2=String.valueOf(y2);
        
     
   String Cords= String.format("X:%s Y:%s \n X2:%s , Y2:%s",xs,ys,sx2,sy2);
     // JOptionPane.showMessageDialog (null,Cords);               
  

    
  @Override
  public void paintComponent(Graphics j){ 
     
    
    
       super.paintComponent(j);
      this.setBackground(Color.BLACK); 
      j.setColor(Color.GREEN);
      j.drawRect(2,0,1300,555);
      j.setColor(Color.WHITE);
      
       j.drawLine(x,y,x2,y2);//actual scaller(white line)
       
     j.setColor(Color.red);
            j.drawLine(300,3,300, 1000);
           j.drawString("0",315,0);                       
       j.drawString("100",315,100);
        j.drawString("200",315,200);
         j.drawString("300",315,300);
          j.drawString("400",315,400);
           j.drawString("500",315,500);
            j.drawString("600",315,600);
            j.drawString("CHICAGO",315,700);
            j.drawString("LUSAKA",315,800);
            j.drawString("900",315,900);
            
             j.setColor(Color.yellow);
         j.drawLine(0,300,1300,298);
         j.setColor(Color.YELLOW);
         j.drawString("0\t ",0,315);
         j.drawString("100\t",100,315);
          j.drawString("200\t",200,315);
           j.drawString("300\t",300,315);
            j.drawString("400\t",400,315);
             j.drawString("LUSAKA\t",500,315);
              j.drawString("600\t",600,315);
              j.drawString("CHONGWE\t",700,315);
              j.drawString("800\t",800,315);
              j.drawString("900\t",900,315);
              j.drawString("1000\t",1000,315);
              j.drawString("1100\t",1100,315);
              j.drawString("1200\t",1200,315);
              j.drawString("1300\t",1300,315);
              j.setColor(Color.WHITE);
               j.drawString(Cords,35,69);
             
      
      
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame f=new JFrame("graphics graph");
      Datastructure d=new Datastructure();
      
      f.add(d);
      f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setSize(1500,750);
       //f.setLocation(620,120);
       
    }
    
}
