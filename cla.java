
package datastructure;
import java.util.Scanner;
import java.awt.*;
public class cla implements Runnable{
   int time;
   String c;
   
   public cla(String x){
       c=x;
       time=2000;}
   
   @Override
   public void run(){
       try{      
       System.out.printf("%s is now asleep %d"
               + "\n",c,time);
         Thread.sleep(time);
         System.out.printf("hey iam %s and am awake now \n",c);
       } 
           catch(Exception e)
                 {
                 }
   }
   
   public static void main(String[] args){
    
          Thread one=new Thread(new cla("tag"));
             Thread two=new Thread(new cla("tag1"));
                Thread three=new Thread(new cla("tag2"));
                   Thread four=new Thread(new cla("tag3"));
                      Thread five =new Thread(new cla("tag4"));
            one.start();
            two.start();
            three.start();
             four.start();
             five.start();
       
   }
   
   
   }
   






