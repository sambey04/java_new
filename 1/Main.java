import java.util.*;
public class Main {
    public static void main(String args[]){  
    ArrayList<String> list=new ArrayList<String>();
    list.add("Sangram");  
    list.add("Ravi");  
    list.add("Swastik");  
    list.add("Anuj");  

    Iterator itr=list.iterator();  
        System.out.println("Original ArrayList Content");
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }    
    System.out.println("Duplicate ArrayList:");
    ArrayList<String> copy = (ArrayList<String>) list.clone();
       Iterator itr1=copy.iterator();  

    while(itr1.hasNext()){  
                 System.out.println(itr1.next());  
        }
        
    
    Collections.reverse(list);
    System.out.println("Reversed ArrayList Content is:");
        Iterator itr2=list.iterator();  

    while(itr2.hasNext()){  
                 System.out.println(itr2.next());  
        }
    }  
}
