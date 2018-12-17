/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;
import java.util.*;
public class thread implements Runnable{
     String name;
     String zina;
      int   time;
      Random random=new Random();
      
      public thread(String x){
          name=x;
          time=random.nextInt(30000);
      }
      public void run(){
      
          try{
              System.out.printf("%s is slept for %d \n",name,time);
                 Thread.sleep(time);
                  System.out.printf("%s is awak\n",name);
              
              
              
          
          }catch(Exception e)
           {
          
          
          
          
          
          
           }
           
          
          
          
      
      
      }
        public static void main(String[] args){
        Thread t1=new Thread(new thread("fiest1"));
        Thread t3=new Thread(new thread("fiest2"));
        Thread t4=new Thread(new thread("fiest3"));
        
        t1.start();
        t3.start();
        t4.start();
        
        
        }
   
    
    
}
