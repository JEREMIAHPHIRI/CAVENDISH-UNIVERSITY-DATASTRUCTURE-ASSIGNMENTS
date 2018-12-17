
package datastructure;
import java.util.*;

public class runner implements Runnable{
  String name;
  int time;
 Random r=new Random();
 
 
  public runner(String x){
      name=x;
      time=r.nextInt(222);
  }
  @Override
  public void run(){
  try{
      System.out.printf("%s is sleeping for %d \n",name,time);
         Thread.sleep(time);
      System.out.printf("%s is NOW AWAKE \n",name);
         
  
  
  } catch(Exception e)
  {
      
  
  
  }
  
  
  
  }
    public static void main(String[] args){
      Thread t1=new Thread(new runner("first"));
      Thread t2=new Thread(new runner("second"));
      Thread t3=new Thread(new runner("third"));
      Thread t4=new Thread(new runner("fourth"));
      
      t1.start(); 
      t2.start();
      t3.start();
      t4.start();
        
    
    }      
  






}


