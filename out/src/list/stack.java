import java.util.*;

public class stack {

    public static void main(String[] args) {
        // LIFO -->Last In First Out
        // Inherits the list.vector

       Stack<Integer> st=new Stack<>();

       st.push(1);  // 1
       st.push(2);
       st.push(3);
       st.push(4);
        System.out.println(st);

       Integer poped_ele=st.pop();  // 2

       System.out.println(st);

        System.out.println(st.peek());  //3

        System.out.println(st.isEmpty());  // 4

        System.out.println(st.search(2));  //5


        //now using it as list.linkedlist<> in terms os list.stack

        // list.linkedlist can be used as list.stack in java due to it is a doubly linked list

        LinkedList<Integer> ll=new LinkedList<>();

        ll.addLast(1); //same as pop
        ll.addLast(2);
        ll.addLast(3);

        ll.getLast(); //  same as Peek

        ll.removeLast();  // same as POP

        ll.size();

        ll.isEmpty();


         // arrayList as Stack in case intead use Arraydeque

        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(1);// adding mean same as PUSH
        arr.add(2);
        arr.add(3);

        arr.get(arr.size()-1);// same as PEEK

        arr.remove(arr.size()-1);//same as POP



    }
}
