import java.util.HashSet;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetDemo {
    public static void main(String[] args) {
        // Set doesn't contain duplicate elements
        // set is Collection
        // time complexity :: 0(1) (find and insert)
        // faster operations

        // Map--> HashMap, LinkedHashMap , TreeMap , EnumMap
        // Set--> HashSet , LinkedHashSet, TreeSet , EnumSet

        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(45);
        set.add(1321);
        System.out.println(set); //output unordered HashSet


        Set<Integer> set1=new LinkedHashSet<>();
        set1.add(1);
        set1.add(45);
        set1.add(1321);
        System.out.println(set1);  // now ordered output

        Set<Integer> set2=new TreeSet<>();
        set2.add(1);
        set2.add(45);
        set2.add(1321);
        System.out.println(set2); // Sorted Order

        NavigableSet<Integer> set3=new TreeSet<>();
        // Now it can use navigable map methods too

        // use methods navigable maps
        // upto this there was No thread Safety

        // for thread safety

        Set<Integer> set5=Collections.synchronizedSet(set1);
        //now set5 is external synchronized
        // how all methods of set1 now get wrap in block of synchronized block
        // all operations are blocked

        //instead use ConcurrentSkipListSet

        Set<Integer> set6=new ConcurrentSkipListSet<>();



        //unmodifiable

        Set<Integer> set7 = Set.of(1, 2, 3, 4, 5);
        Set<Integer> set8 = Collections.unmodifiableSet(set7);


    }
}
