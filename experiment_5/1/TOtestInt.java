import java.util.*;  

class TOtestInt
{
	public static void main(String args[])
	{

Scanner in = new Scanner(System.in);
Arithmetic obj = new Arithmetic();
System.out.println("enter value ");
int value = in.nextInt();
obj.square(value);
obj.printS();
	}
}
class Arithmetic implements Test
 {
   int sq;

public void square(int value)
{

sq= value*value;

}

public void printS()
{
	System.out.println("square is =" +sq);
}

 }



