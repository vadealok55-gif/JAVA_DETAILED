import java.util.*;
public class DequeDemo {
    public static void main(String[] args) {
        // double ended queue
        //insertion and deletion at both front and rear


        /*
        Insertion Methods

        addFirst(E e):
        addLast(E e):
        offerFirst(E e):
        offerLast(E e):

        REMOVING methods

        removeFirst():
        removeLast():
        pollFirst():
        pollLast():

        Examination Methods

        getFirst():
        getLast():
        peekFirst():
        peekLast():

        offer ,poll ,peek returns null if empty where asw others throws exception


         STACK METHODS

         push(E e):Adds an element at the first (addFirst())
         pop() :  removes returns first element  (removeFirst())


         */


        Deque<Integer> deque1=new ArrayDeque<>();
        deque1.addFirst(10);
        deque1.addLast(39);
        deque1.offerFirst(34);
        deque1.offerLast(23);
        System.out.println(deque1);//34 10 39 23
        deque1.removeFirst();
        deque1.removeLast();
        System.out.println(deque1); // 10 39



        Deque<Integer> deque2=new LinkedList<>();


        /*
        these all works under LinkedList<>() deque also
        but
        when it comes to ArrayList<>--->
        faster iteration
        lower memory
        no null allowed
        here after inserting and deleting is applied then all elements does not shift because it is circular deque
        head and tail using


        when it comes to Linked list<>--->
        insertion in somewhere in middle is faster

         */

    }
}
