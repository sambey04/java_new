class Main
{
	public static void main(String args[])
	
	{
VehicleFactory obj= new VehicleFactory();
Vehicle obj1 = obj.getInstance("2wheel");
obj1.speed();
	}
}


class Vehicle
{
void speed()
{
System.out.println("in vehicle");
}
}

class Car extends Vehicle
{

void speed()
{
System.out.println("in car");
}
}

class Bike extends Vehicle
{

void speed()
{
System.out.println("in bike");
}
}

class Truck extends Vehicle
{

void speed()
{
System.out.println("in truck ");
}
}


