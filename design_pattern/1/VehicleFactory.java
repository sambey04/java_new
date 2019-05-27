public class VehicleFactory
{
	public Vehicle getInstance(String str)
	{
		if(str.equals("2wheel"))
			return new Bike();
		else if (str.equals("4Wheel"))
			return new Car();
	        else
			return new Truck();
	}
}
