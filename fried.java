
package datastructure;
public class fried implements Runnable{
String name;
int time; 
    public fried(String x){
         name = x;
         time=2000;}    
@Override
    public void run()
    {
        try
    {
       System.out.printf("Hi my name is %s and sleeping for %d \n",name,time);
       Thread.sleep(time);
       System.out.printf("Hi %s ama wake now \n",name);
    }
    
    catch(Exception e)
    {
    
    }
  }
    public static void main(String[] args){
       Thread none=new Thread(new fried("coder"));
       Thread none1=new Thread(new fried("coder1"));
       Thread none2=new Thread(new fried("coder2"));
       Thread none3=new Thread(new fried("coder3"));
       Thread none4=new Thread(new fried("coder4"));
               
               none.start();
               none1.start(); 
               none2.start();
               none3.start();
               none4.start();
  
  
  }  
}

    

