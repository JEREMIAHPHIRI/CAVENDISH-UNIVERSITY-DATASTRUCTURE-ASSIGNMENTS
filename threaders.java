
package datastructure;
import java.util.Scanner;
import java.awt.*;
public class threaders implements Runnable{
    String name;
    int time; 
    
    public threaders(String x)
    {  
       name=x;
       time=2000;}
    
    public void run(){
     try
     {
          System.out.printf("this is %s sleeping for %d\n", name,time);
       Thread.sleep(time);
          System.out.printf("%s is awake now \n", name);
          
        }catch(Exception e)
        {
              
        }
    
    
    }
    
    public static void main(String[] args){
        Thread x=new Thread(new threaders("one"));
        Thread c=new Thread(new threaders("two"));
        Thread v=new Thread(new threaders("last one"));
        x.start();
        c.start();
        v.start();
    }
}
