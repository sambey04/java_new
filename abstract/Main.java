class Main
{
	public static void main(String args[])
	{
		System.out.println("hello world");

car obj = new car();
bus obj1 = new bus();

show(obj);
	}
         
	public static void show(vehicle obj)
        {
           obj.maxspeed();
	   obj.weight();
        }

}


 abstract class vehicle
{


abstract void maxspeed();
abstract void weight();

}



  class bus extends vehicle
{
	void maxspeed()
	{
		System.out.println("100 kmhr");
	}

       void weight()
         {
	System.out.println("bus weight");
          }
}



 class car extends vehicle
{
	void weight()
	{
		System.out.println("car kg");
	}

	void maxspeed()
	{
		System.out.println("80kmhr");
	}
}


