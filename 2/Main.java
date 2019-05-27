import java.util.*;
import java.util.Map.Entry;
public class Main {
    public static void main(String args[]){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
 
        hm.put(1, "Sangram");
        hm.put(2, "Swastik");
        hm.put(3,"Ravi");
        System.out.println("Hashmap:-"+hm);
        if(hm.containsKey(1)){
            System.out.println("The hashmap contains key=1");
        } else {
            System.out.println("The hashmap does not contains key=1");
        }
        if(hm.containsKey(5)){
            System.out.println("The hashmap contains key=5");
        } else {
            System.out.println("The hashmap does not contains key=5");
        }
        
        if(hm.containsValue("Sangram")){
            System.out.println("The hashmap contains value=Sangram");
        } else {
            System.out.println("The hashmap does not contains value=Sangram");
        }
        if(hm.containsValue("Kishan")){
            System.out.println("The hashmap contains value=Kishan");
        } else {
            System.out.println("The hashmap does not contains value=Kishan");
        }
        System.out.println("List of all keys from the HashMap:");
                Set<Integer> keys = hm.keySet();
        for(Integer key: keys){
            System.out.println(key);
        }
        System.out.println("All Key->Value pairs:");
        Set<Entry<Integer, String>> entries = hm.entrySet();
        for(Entry<Integer,String> ent:entries){
            System.out.println(ent.getKey()+" --> "+ent.getValue());
        }
    }
}
