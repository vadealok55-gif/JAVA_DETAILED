import java.util.*;
public class ImmutableMapDemo {
    public static void main(String[] args) {
        //Immutable mean content doesn't change
        
        Map<String,Integer> map=new HashMap<>();
        
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);

        Map<String, Integer> map1 = Collections.unmodifiableMap(map);
        // map1.put("ALOk",98);  throws Exception

        Map<String, Integer> map3 = Map.of("alok", 98, "daa", 43);

        map3.put("vade",43); // if you run this you will get an exception


        // limitation  that We add only upto 10 key-value pairs Only so another method is used

       Map<String,Integer> map4=Map.ofEntries(Map.entry("alok",54),Map.entry("vade",42));

       // now we can add no.of entries here





    }
}
