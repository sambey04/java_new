class Main
{

public static void main(String args[])
{

Car obj = new Car();
obj.speed();

}

}


 class Vehicle
{
  void speed()
 
 {
 System.out.println("in Vechile speed");
 }

void ram()
{
	System.out.println("in Vehicle ram");
//super.speed();
}
}

class Bike extends Vehicle
{
void speed()
{
        System.out.println("in bike in speed");
}

}

class Car extends Vehicle
{
//void speed(){
  //  System.out.println("in car in speed");
//}
}


