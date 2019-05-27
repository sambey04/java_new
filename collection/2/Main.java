import java.util.*;

class Main
{
public static void main(String args[])
{
LinkedList <String>list = new LinkedList <String>();

list.add("ram");

Iterator <String> obj = list.iterator();
while(obj.hasNext())
{
	System.out.println(obj.next());
}

}

}
