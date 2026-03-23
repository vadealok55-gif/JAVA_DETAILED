import java.util.*;

public class EnumMapDemo {
    public static void main(String[] args) {
         Map<Day ,String > map= new EnumMap<>(Day.class);
         map.put(Day.tue,"JAVALAB");
         map.put(Day.sat,"CLAB");
        System.out.println(Day.sat.ordinal());
        System.out.println(Day.tue.ordinal());
        // ordinal mean index of enum we want


        System.out.println(map);  // output will in order as enum are given in form


        // array of size as enum
        // no hashing
        // ordinal /index is used
        // faster than HashMap
        // Memory Efficient



    }
}
enum Day{
    mon , tue , wed , thur , fri , sat , sun
}
