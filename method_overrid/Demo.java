class Parent
{
int money;
Parent(int m)
{
money=m;
}
Parent()
{
money=1000;
}


void  show()
{
System.out.println(""+money);
}}


class child extends Parent
{
int money=333;
}


class Demo
{
public  static void main(String args[])
{
child obj=new child(500);
obj.show();
}}
