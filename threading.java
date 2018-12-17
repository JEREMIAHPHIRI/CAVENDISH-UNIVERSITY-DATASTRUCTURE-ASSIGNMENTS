
package datastructure;
import java.awt.*;
import java.util.Scanner;
public class threading implements Runnable {
int time;
String name;
public  threading(String x){
   name=x;
   time=3000;
   

}
@Override
   public void run()
   {
       
       
       try{
             System.out.printf("%s is sleeping for %d\n",name,time);
              Thread.sleep(time);
                System.out.printf("%s iswake\n",name);
           
              // Thread.start("stsart");
               
       
       
       
       }catch(Exception e){
               }
   
   }

   public static void main(String[] args){
   
    Thread c=new Thread(new threading("one"));
      Thread c2=new Thread(new threading("two"));
        Thread c3=new Thread(new threading("thre"));
        
        c2.start();
        c.start();
        c3.start();
   }
   }

