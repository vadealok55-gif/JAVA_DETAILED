import java.util.LinkedHashMap;
import java.util.*;

public class LinkedHashMapdemo
{
    public static void main(String[] args) {
        LinkedHashMap<String ,Integer> lhmap=new LinkedHashMap<>(11 ,0.3f,true);
        lhmap.put("Orange", 10);
        lhmap.put("Apple", 20);
        lhmap.put("Guava", 13);

        for(Map.Entry<String,Integer>  e:lhmap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println();
        lhmap.get("Guava");
        lhmap.get("Orange");
        lhmap.get("Guava");
        lhmap.get("Guava");

        for(Map.Entry<String,Integer> n:lhmap.entrySet()){
            System.out.println(n.getKey() + " " + n.getValue());
        }
        /*
          output :
                 Apple 20
                 Orange 10
                 Guava 13

         */
        //ordered output as inserted so it becomes slow compare Hashmap as it uses double linked list memory is also used more
        // (int) initially capacity  , (float) Load_factor  , (boolean) access_order

        /*
          access_order if false then after access there will be NO change
          access_order is TRUE then after access the LRU Algorithm is used so most used will be at last of linked list
            LRU  --->( Least Recently Used ) the least used will be on at starting of LINKEDLIST  and most used at last
         */

        HashMap<String,Integer> map=new HashMap<>();

        LinkedHashMap<String,Integer> map1=new LinkedHashMap<>(map);// hashmap get stored in linkedhashmap


    }
}

