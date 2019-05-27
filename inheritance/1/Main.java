class Main implements Runnable
{
	public static void main(String atgs[])  
	{
Main r = new Main();
Thread t = new Thread(r);

Thread t1 = new Thread(r);
t.start();

t1.start();
	}


	
public void run()
{

	for(int n =0; n<5;n++){
		System.out.println(n);
	try
{
	Thread.sleep(100);

}
catch(InterruptedException e )
{
	System.out.println(e);
}
	}
}
}
	
