
package datastructure;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class jeremiah extends JFrame {
    JTextField name;
    JTextField number;
    JPasswordField password;
    JTextArea text;
    JLabel namelable;
    JLabel numberlable;
    JLabel passwordlable;
    JButton button;
 
    public jeremiah( ){
        super("titled");
         setLayout(new FlowLayout());

          namelable=new JLabel("NAME");  
          name=new JTextField(015);
             
          numberlable=new JLabel("NUMBER");
          number=new JTextField(015);
          
          passwordlable=new JLabel("PASSWORD");
          password=new JPasswordField(015);
         
          JPanel fields=new JPanel();
          fields.setLayout(new GridLayout(3,3,1,0));
          JPanel labels=new JPanel();
          labels.setLayout(new GridLayout(3,3));
          JPanel container=new JPanel();
          text=new JTextArea();
            //LABELS FOR FIELD LABELS 
            //FIELDS FOR INPUT FIELD
          
              labels.add(namelable);
              fields.add(name);
              
              labels.add(numberlable);
              fields.add(number);
              
              labels.add(passwordlable);
              fields.add(password);
               
              button=new JButton("SUBMIT");
 //CONTAINER FOR FINAL CONTAINER OF THE OTHER PANELS        
             container.add(labels,BorderLayout.EAST); 
             container.add(fields,BorderLayout.WEST);
             
             container.add(button,BorderLayout.SOUTH);
             container.setBackground(Color.WHITE);
             container.add(text);
             add(container,BorderLayout.CENTER);
            
           
 // EVENT HANDLING              
         Handler handle=new Handler();
         name.addActionListener(handle);
         number.addActionListener(handle);
         password.addActionListener(handle);
         button.addActionListener(handle);
        
    }
    
    public class Handler implements ActionListener{
        public void actionPerformed(ActionEvent ae)
        
        
        {
          if(ae.getSource()==button)
               
           try {   //decalaration of instance variables here
               
                String passwords,numbers,names;
               
                  passwords=password.getText();
                   numbers=number.getText();
                     names=name.getText();
                 //INT DECALRATIONS 
               
                 int numberint;
                    numberint=Integer.parseInt(numbers);
                     
                         
                       JOptionPane.showMessageDialog(null,numberint,"number",JOptionPane.WARNING_MESSAGE);
                        
                    text.setText(passwords);
                        
                       
            }catch(Exception e){
               
             JOptionPane.showMessageDialog(null,"YOU HAVE AN ERROR IN YOUR PROGRAM","number",JOptionPane.WARNING_MESSAGE);
            
            };
        }
              
               
        
        
        }

public static void main(String[] args){
    jeremiah c=new jeremiah();
      c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      c.setSize(300,333);
      c.setVisible(true);
      }
}



    
    
    
    
    
    
    
    
