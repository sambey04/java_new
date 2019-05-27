import java.util.*;
class Main
{
	public static void main(String args[])
	{
		System.out.println("lets do array");
aray obj = new aray();
obj.array1();
obj.array2();

	}
}


class aray
{
 void     array1(){
       	// first type of array
       int marks[] = new int[4];
//       marks[0]=0;
//
//      marks[1]=1;
//      marks[2]=2;
//      marks[3]=3;
      for(int i:marks)
      {
System.out.println(i);
i=1;
System.out.println(i);
      } 
      
}


void array2()
{
String arr2[] ={"ram","sham","man","kam"};

for(String i:arr2 )
{
	System.out.println(i);
}

}


}
