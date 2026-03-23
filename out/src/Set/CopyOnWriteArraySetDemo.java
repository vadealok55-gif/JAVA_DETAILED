import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // y? set implementation are not thread safe when multiple threads try to modify data corruption and concurrent data inconsistency aa sakta hai

        // Thread-Safe
        // No duplicate
        // Copy On Write mechanism
        // Iterators Do not reflect Modifications

         ConcurrentSkipListSet<Integer> set= new ConcurrentSkipListSet<>();
        CopyOnWriteArraySet<Integer> cwas=new CopyOnWriteArraySet<>();

        for(int i=0;i<=5;i++){
            set.add(i);
            cwas.add(i);
        }
        System.out.println(set);
        System.out.println(cwas);

        for(int n:set){
            System.out.println("concurentskipList" + " : "+n);
            set.add(6);
        }

        System.out.println(set);
         // here the 6 may or amy not get added

        for(int n:cwas){
            System.out.println("concurentskipList" + " : "+n);
            cwas.add(6);
        }

        System.out.println(cwas);
        // but after iteration done then 6 get added / modify


    }
}
