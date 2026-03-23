/*

public class LinkedList {
    public static void main(String[] args) {
        list.Node ll=new list.Node();
        list.Node ll1=new list.Node();
        ll.val=1;
        ll1.val=10;
        ll.next=ll1;
        ll1.next=null;

    }
}
public class list.Node{
    public int val;
    public list.Node next; //refernce to next node
}

*/
import java.util.*;
public class linkedlist{
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        // implemention behind done by java, where it is doublly linked list
        // same if finding any number using loop will be done
        System.out.println(list);
        list.remove(1);//index based
        list.remove(Integer.valueOf(3));

        System.out.println(list);

        list.addFirst(2);//O(1)
        list.addLast(10);//O(1)

        int n=list.get(1);//gives value of indexed 1

        int n1=list.getFirst();

        int n3=list.getLast();

        list.removeFirst();
        list.removeFirstOccurrence(2);
        list.removeLastOccurrence(3);
        list.removeIf(x->x%2==0);

        System.out.println(list);


        LinkedList<String> str1=new LinkedList<>(Arrays.asList("alok","baala","vade"));
        LinkedList<String> str2=new LinkedList<>(Arrays.asList("baala","chotiie"));

        str1.removeAll(str2);

        System.out.println(str1);
        //output: alok vade

         //linked list as List behaves
        // linked list can behave like list.stack in list.stack
    }
}