import java.util.*;
class Main
{
	public static void main(String args[])
	{
		ArrayList<String > list = new ArrayList<String>();
		list.add("sam");
		list.add("sam");
		list.add("sam");
		list.add("sam");
		list.add("raksha");
		list.add("raksha");
		list.add("raksha");
		list.add("raksha");
		Iterator obj = list.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
	}
}
