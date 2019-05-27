class Main
{
	public static void main(String atgs[])
	{
try{
		int ram = Integer.valueOf(atgs[0]);
//System.out.println(atgs[0]);
System.out.println(Integer.valueOf(atgs[0])/Integer.valueOf(atgs[1]));
}catch(ArithmeticException e){System.out.println("dont divide by zero bitch");}
catch(ArrayIndexOutOfBoundsException a){System.out.println("index sucks"+a);}


	}
}
