class Calc
{
void sum(int a,int b){System.out.println("int int ");}
void sum(int a,long b){System.out.println("int long");}

	public static void main()
	{
Calc obj= new Calc();
obj.sum(20,20);

	}
}
