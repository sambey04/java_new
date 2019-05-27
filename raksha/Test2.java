import java.util.*;
//import java.util.io.*;
import java.lang.*;


class Test2
{

int number;
	void method1()
{
Scanner i = new Scanner(System.in);
System.out.print("Enter a number");
number=i.nextInt();
} 


public void method2()
{
System.out.print( number*number);
}

void method3()
{
System.out.print(number);
}
}



class Tests
{
public static void main(String[] args)
{
Test2 obj= new Test2();
obj.method1();
//Tests object= new Tests();
obj.method2();
obj.method3();
}
}
