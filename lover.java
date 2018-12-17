
package datastructure;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;



   public class lover extends JFrame{
        JTextField firstnum;
        JTextField secondnum;
        JTextField thirdnum;
    public lover(){
           super("number box ");
             setLayout(new FlowLayout());
            
           JLabel firstnumlabel=new JLabel("firstnum");
             firstnum=new JTextField(2); 
           
             JLabel secondnumlabel=new JLabel("secondnum");
             secondnum=new JTextField(2);
            
              JLabel thirdnumlabel=new JLabel("thirdnum");
                 thirdnum=new JTextField(2);
            add(firstnumlabel);
            add(firstnum);
            add(secondnumlabel);
            add(secondnum);
            add(thirdnumlabel);
            add(thirdnum);
//------------------------------------------------- 
   
handler handle=new handler();
  firstnum.addActionListener(handle);
  secondnum.addActionListener(handle);
  thirdnum.addActionListener(handle);
             
             
    
    
    }    
  //---------------------------------------------------------
     public class handler implements ActionListener{
         public void actionPerformed(ActionEvent ae){
               if(ae.getSource()==thirdnum){
                   
                   try{String fn=firstnum.getText();
                   String sn= secondnum.getText();
                   String tn=thirdnum.getText();
              
                       
                   
                   
                   
                   
                   
                   JOptionPane.showMessageDialog(null,tn.lastIndexOf("red"));
                   } catch(Exception error){
                       JOptionPane.showMessageDialog(null,"please only enter the values");
                   
                   }
                    
               
               
               }
         
         }
     
     
     
     }    
   
   public static void main(String Args[]){
          String[] lister={"trims"," code","react"};
                List<String> list1=new ArrayList<String>();
                   for(String w: lister);
                       
       lover l=new lover();
          l.setSize(233,333);
          l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          l.setVisible(true);
          
   
   }
   
   }

