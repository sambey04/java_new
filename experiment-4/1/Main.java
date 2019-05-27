

class Demo  
 {
//void hello(){System.out.println("in default");}

private void hello(){System.out.println("in private");}
 
 


 }



class Main extends Demo
 {
   
	 
	 
	 
	 public static void main(String args[])
             {
	     Demo obj = new Demo();

	     obj.hello();
             }
 
 
}

