/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;
import javax.swing.*;
import java.awt.*;
public class jermiah extends JFrame
{
   public jermiah(){
    JPanel texts = new JPanel();
    JPanel fields=new JPanel();
       JLabel lab,labe=new JLabel();
            lab=new JLabel("enter your name below");
            labe=new JLabel("enter your surname below");
             JTextField name=new JTextField();
             JTextField surname=new JTextField();
       texts.add(lab);
       texts.add(labe);
      //panels below
       fields.add(name);
       fields.add(surname);
       JPanel container=new JPanel();
        container.add(texts);
        container.add(fields);
        add.container;

   }
    public static void main(String args[]){
        
   jermiah frame=new jermiah();
   frame.setVisible(true);
   frame.setSize(234,200);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
    
}
 