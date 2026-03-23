import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // queue interface part
        // priority wise
        //custom comparator for customizing   ordering
        // does not allow null elements

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(2);
        pq.add(23);
        pq.add(3);

        System.out.println(pq.peek());// lower ordering due to natural priority

//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }
        // output 2 3 23

        System.out.println(pq); //not ordered but it gives in loop natural  ordered
  // output [2 23 3]


     // priorityQueue only tells about the peek element the internal elements doesn't in form of ordered


     //Internal working
     /*
        PriorityQueue is implemented as a MIN-HEAP by default( for natural ordering)
        min heap--->
         where parents node s are less than children nodes

                         1
                     2       3
                  5    6   9    7

       time complexity :  O(log n) remove
                          O(log n) insert
                          O( 1 )  peek smallest element


      */

        PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
        //it reverses the natural order

        PriorityQueue<Integer> pq2=new PriorityQueue<>((x,y)->y-x);
    }
}
