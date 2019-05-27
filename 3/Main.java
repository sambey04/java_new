import java.util.*;
public class Main {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println("Hashset:-"+hs);
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("s1");
        subSet.add("s2");
        hs.addAll(subSet);
        System.out.println("HashSet content after adding another collection:");
        System.out.println(hs);
        
        if(hs.contains("second"))
        {
            System.out.println("");
        }
        
        
        
        System.out.println("Clearing HashSet:");
        hs.clear();
       
        System.out.println("Hashset after clearing:"+hs);
        
        
    }
}
