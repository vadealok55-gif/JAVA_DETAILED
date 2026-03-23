import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {

        ConcurrentMap<String,Integer> map=new ConcurrentHashMap<>();

        // java 7 -- segment based locking --> 16 segments --> smaller hashmaps
        // every segment has different locking
        // only the segment being written to or read from is locked
        // read: do not require unless lock is not required write operation happening on same segment
        // write: lock

         // java 8 --> no segmentation
        // compare and swap method no locking except resizing or collision locking applies otherwise there will be no locking
        //  Thread A last saw --> x=42
        //  Thread A work ---> x to 50
        // if x is still 42, then change it to 50 else don't change and retry



        // put --> index (c and s) if yes put else retry
        // same methods


        // MAP  --> SORTED --> THREAD SAFE ---> ConcurrentSkipListMap

    }
}
