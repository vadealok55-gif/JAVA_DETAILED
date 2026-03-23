import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListDemo {
    public static void main(String[] args) {
           ConcurrentSkipListMap<String ,Integer> map =new ConcurrentSkipListMap<String, Integer>();
           // extends NavigableMap
           map.put("apple",2);

           // same all methods used here check with map.

          // 1 2 3 4 5 6 7 8 9

          /*
          internal working of skip list

          level 3 :      1----5----9
          level 2 :      1-3-5-7-9
          level 1 :      1 2 3 4 5 6 7 8 9

          searching is probabilistic if 2 should be searched
          then it first checks level3 and then between 1 and 5

          then it checks level 2 and checks between 1 and 3

          then it searched function stop

          TimeComplexity :: O ( log n )




           */
    }
}
