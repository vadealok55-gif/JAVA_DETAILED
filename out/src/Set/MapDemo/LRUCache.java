import java.util.*;

public class LRUCache<K,V> extends LinkedHashMap<K,V>{
    int capacity;
    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size()> capacity;
    }


    public static void main(String[] args) {
   LRUCache<String ,Integer> map=new LRUCache<String ,Integer>(3);

   map.put("Bob",99);
   map.put("Alice",89);
   map.put("Ram",98);
   map.put("Vipul",89);

   map.get("Bob");

   //output : after this line
     //   {Alice=89, Ram=98, Vipul=89}  after 3 capacity Bob got removed here



        map.put("Bob",99);
        map.put("Alice",89);
        map.put("Ram",98);
        map.get("Bob");
        map.put("Vipul",89);
       // output {Ram=98, Bob=99, Vipul=89}
        // here we set as 3 so sfter three insertion bob was on get method so Alice is remoevd

        System.out.println(map );


    }
}
