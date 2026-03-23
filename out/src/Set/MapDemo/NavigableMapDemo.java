import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer,String> map=new TreeMap<>((a,b)->a-b);
        map.put(1,"ONE");
        map.put(5,"Five");
        map.put(2,"Two");

        System.out.println(map);
        System.out.println(map.lowerKey(3));
        System.out.println(map.ceilingKey(2));
        System.out.println(map.higherEntry(1));
        System.out.println(map.descendingMap());
    }
}
