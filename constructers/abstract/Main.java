abstract class Main extends Hello

{

public static void main(String args[])
{
System.out.println("in main");
Hello obj = new Hello();
obj.work();

}

}


 class Hello
{
	void work()
	{
	System.out.println("doing work");
	}
}
