import java.util.*;

public class vector {
    public static void main(String[] args) {
       //list.vector class syncronized thread safe
       //list.vector is used in more than single threaded scenarios
       //list.vector mostly not used when single threaded scenarios due to its processing speed and memory usage more compare to arraylist

        // Main feature Synchronize , legacy class (mean before Collections frameworks it was there)
             Vector<Integer> vec = new Vector<>();

         // list.vector capacity initial by deafult 10

             Vector<Integer> vector=new Vector<>(5);//setting capacity as 5 initial
        // once cross limit of capcity it increases Double
        Vector<Integer> vector1 =new Vector<>(10, 5);
         //by crossing limit it increments by 5

        System.out.println(vector1.capacity());


        // list.vector constructor
         LinkedList<Integer> ll=new LinkedList<>();
         ll.add(2);
         ll.add(3);
         ll.add(4);

         Vector<Integer> neww=new Vector<>(ll);
         System.out.println(neww);


         // methods

        /*
           list.vector.add();  adding of element

           list.vector.add(index,element);   index based value adding

           list.vector.set(index , ele);

           list.vector.get(index);

           list.vector.remove(object);  removes first occurance of element

           list.vector.remove(index);   removes ele at index

           list.vector.size()  // returns size of list.vector

           list.vector.capacity();    //returns capacity of list.vector

           list.vector.isEmpty();

           list.vector.contains();

           list.vector.clear();   //removes all ele in list.vector

         */
    }
}
