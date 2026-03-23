import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        // Stack Lifo
        // Queue Fifo
        // elements are added at End and Removed from the Front

        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(5);//enqueue

        System.out.println(list);
        System.out.println(list.removeFirst());//dequeue

        list.getFirst();  //PEEK


        // linked list implements the Interface Queue;
        Queue<Integer> que=new LinkedList<>();

        que.add(2);  // another method offer
        que.add(3);
        que.add(4);
        que.add(5);
        que.remove();   // another poll
        System.out.println(que.peek());  //another element

        System.out.println(que);


        Queue<Integer> qe=new LinkedList<>();
        qe.add(1);
        System.out.println(qe.size());

        System.out.println(qe.remove()); // throws exception if empty
        System.out.println(qe.poll()); //null
        System.out.println(qe.element()); // throws exception if empty
        System.out.println(qe.peek()); // null



        Queue<Integer> que1=new ArrayBlockingQueue<>(2);
        que1.offer(1);//true   boolean offer(E e);
        que1.add(2);//true   boolean add(E e);

        System.out.println(que1.add(3));// throws exception
        System.out.println(que1.offer(3)); // false










    }
}
