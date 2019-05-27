import java.util.Scanner; 
class Worker
 {

	 int age=51;
         String name="sandeep";
       
	 void ComPany(int hours)
	 {
  System.out.println("total hours done = " +hours);
	  System.out.println("total salary = " +hours*3 + "Rs");
	
       } 
 }

class DailyWorker extends Worker
 {
DailyWorker()
{
	System.out.println("enter your hours ");
        Scanner sc = new Scanner(System.in); 
        int hours  = sc.nextInt(); 
super.ComPany(hours);
}
 }

class SalariedWorker extends Worker
 {
 SalariedWorker(){
int	 hours=40;
         super.ComPany(hours);
 }}



class Main
 {
  public static void main(String args [])
   {
System.out.println("enter 1 if you are Daily worker ");
  Scanner sc = new Scanner(System.in); 
       int test  = sc.nextInt(); 
if(test==1)
{DailyWorker obj = new DailyWorker();}
else
{SalariedWorker obj = new SalariedWorker();}



   }
 }


