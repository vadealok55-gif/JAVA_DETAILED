import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {

        Hashtable<Integer,String> ht=new Hashtable<>();

        // it is a legacy class and thread safe, synchronized
        // no null value in (key or value) it is null pointer exception
        // slower than HashMap
        // collision due to uses linked list
        // All methods are Synchronized

        ht.put(1,"APPLE");
        ht.put(2,"banana");

        System.out.println(ht);
        System.out.println(ht.get(1));
        System.out.println(ht.containsKey(2));

        ht.remove(1);

        System.out.println(ht);

    }
}
