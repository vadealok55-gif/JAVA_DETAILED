import java.util.*;

public class identityHashMapDEMO {
    public static void main(String[] args) {
        String key1=new String("key");
        String key2=new String("key");
//        Map<String,Integer> map=new HashMap<>(); here it gives same Hashcode for both keys
        Map<String,Integer> map=new IdentityHashMap<>(); // it gives different IdentityHashCode && checks (==) checks Memory reference

        map.put(key1,1);
        map.put(key2,2);


        System.out.println(System.identityHashCode(key1));// hashcode is diff
        System.out.println(System.identityHashCode(key2));// here also diff hashcode


        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());// string hashcode is same in both
        System.out.println(map);// replace value
    }
}
