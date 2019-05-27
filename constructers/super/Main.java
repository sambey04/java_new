class Main 
{

	Main()
             {

System.out.println("in main constructer");
             }



public static void main(String args[])
{
Two obj = new Two();


}


}

class Two extends Main
{
	Two()
	{
		super();
System.out.println("in two constructer");
	}


}
