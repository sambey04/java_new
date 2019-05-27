class Main implements Runnable
{
	public static void main(String aths[])
	{
		System.out.println("hello");

                
Main obj = new Main();
Lol obj1 = new Lol();
Thread t1 = new Thread(obj);
Thread t2 = new Thread(obj);
t1.start();
t2.start();
//System.out.println(c);	
	
	}
public void run()
{

	//obj1.func();
Lol ob= new Lol();
ob.func();

}}



class Lol{


int c=0; 
public void func()
{

	c++;
}
}
