import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


public class SortedMapdemo {
    public static void main(String[] args) {
         // SortedMap<String ,Integer> map=new --> Interface

        /*
        SortedMap which Extends Map and entries are sorted by default order or by comparator

        SORTEDMAP is an interface and it implements TreeMap  and TreeMap implements NavigableMap extends SortedMaps
         */
        SortedMap<String ,Integer> map=new TreeMap<>((a,b)->b.length()-a.length());

        map.put("ALOK",99);
        map.put("VADE",78);
        map.put("Song",89);
        map.put("karthiK",93);
        map.put("ramesh",75);
        map.put("umesh",83);

        System.out.println(map); //output : {ALOK=99, Song=89, VADE=78}

        Map<String,Integer> map1=new TreeMap<>();
        map1.put("ALOK",99);
        map1.put("VADE",78);
        map1.put("Song",89);
        System.out.println(map1);  //same output but sortedMap has many methods which map doesn't have

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.reversed());
        System.out.println(map.headMap("Song"));
        System.out.println(map.tailMap("VADE"));



    }
}
