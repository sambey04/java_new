
public class Main
{
public int a=0;
    public static void main(String[] args){
    thed t1=new thed();
    t1.start();
     thed t2=new thed();
    t2.start();
     thed t3=new thed();
    t3.start();
     thed t4=new thed();
    t4.start();
     thed t5=new thed();
    t5.start();
     thed t6=new thed();
    t6.start();
     thed t7=new thed();
    t7.start();
     thed t8=new thed();
    t8.start();
     thed t9=new thed();
    t9.start();
     thed t10=new thed();
    t10.start();
    }
   
}

class thed extends Thread{
 static  int a=0;
  synchronized public void run(){


       System.out.println(Thread.currentThread().getName());
   System.out.println(a);
   a++;
  
  
   }

};
