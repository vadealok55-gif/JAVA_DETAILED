import java.util.*;
import java.util.concurrent.*;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        //Interface BlockingQueue which extends Queue
        // thread safe queue
        // wait for queue to become non-empty / wait for space
        //multithreaded environment mostly used
        /*Standard Queue --> immediately
           empty ---> remove( no waiting )
           full ---> add( no waiting )


           but in blockingQueue
              put ---> blocks is queue is full until space becomes available
              take --> blocks if queue is empty until an element becomes available
              offer--> waits for space to become available,up to specified timeout

         */

        BlockingQueue<Integer> que=new ArrayBlockingQueue<>(5);//fixed capacity and no more increament in size()
        Thread t1=new Thread(new Producer(que));
        Thread t2=new Thread(new Consumer(que));

        t1.start();
        t2.start();




        BlockingQueue<Integer> queue1 =  new LinkedBlockingQueue<>();
        // optionally bounded backed by LinkedList
        // Uses two separate locks for enqueue and dequeue operations
        // Higher concurrency between producers and consumers
        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
        // unbounded
        // Binary Heap as array and can grow dynamically
        // Head is based on their natural ordering or a provided Comparator like priority queue
        // put wont block
        queue2.add("apple");
        queue2.add("banana");
        queue2.add("cherry");
        System.out.println(queue2);
        BlockingQueue<Integer> queue3 =  new SynchronousQueue<>();
        // each insert operation must wait for a corresponding remove operation by another thread and vice versa.
        // it cannot store elements, capacity of at most one element




    }
    static class Producer implements Runnable {
        private BlockingQueue<Integer> queue;
        private int value = 0;

        public Producer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Producer produced: " + value);
                    queue.put(value++);
                    Thread.sleep(1000);
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Producer interrupted");
                }
            }
        }
    }


    static class Consumer implements Runnable {
        private BlockingQueue<Integer> queue;

        public Consumer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Integer value = queue.take();
                    System.out.println("Consumer consumed: " + value);
                    Thread.sleep(1000);
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Consumer interrupted");
                }
            }
        }
    }
}
