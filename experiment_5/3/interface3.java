interface area
{
static final float pi=3.142f;
float compute(float x,float y);
}
class rectangle implements area
{
public float compute(float x,float y)
{return(x*y);}
}
class circle implements area
{
public float compute(float x,float y)
{return(pi*x*x);}
}
class test
{
public static void main(String args[])
{
rectangle rect=new rectangle();
circle cr=new circle();
area ar;
ar=rect;
System.out.println("Area of the rectangle= "+ar.compute(10,20));
ar=cr;
System.out.println("Area of the circle= "+ar.compute(10,0));
}
}