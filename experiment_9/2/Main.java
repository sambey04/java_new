class Main {  

public static void main(String args[]){  
Thread t1 = new Thread(){
	public void run(){ 
int x=0;
 		while(x<4){	

System.out.println(x);
		x=x+2;
}
	}
//Multi t1=new Multi();  
 } ; 

Thread t2 = new Thread(){
int x=1;
	public void run(){ 
	       while(x<4){	
	
System.out.println(x);  
	       	       x=x+2;
	       }
	}

//Multi t1=new Multi();  
 } ; 




	t1.start();  
	t2.start();  

}
}
