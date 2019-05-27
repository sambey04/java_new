import java.util.*;

class Main
{
	public static void main(String atgs[])
	{
		Vector <String> obj =new Vector <String>();
		obj.add("sam");

                Iterator <String> ir = obj.iterator();

		while(ir.hasNext())
		{
		System.out.println(ir.next());
		}


	}
}
