import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {


        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();

            /*
             "Copy On Write" means whenever a write operation (adding ,removing) done on
             list it, makes a copy of list and modify over on them instead a real one
             due to it ensures that other threads reading the list uneffected
             */

        // Read Operation : Fast and Direct ,since they happen on stable list without modification
        // Write operation : a new Copy of list and then operations are performed then refernce list is updated in original if no reading operation is done

        List<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);

        for(int i=0 ;i<arr.size();i++){
            System.out.println(arr.get(i));
            if(arr.equals(1)){
                arr.add(9); // here 9 doesn't get added due while reading we are trying to add 9
                System.out.println(i);
            }
        }

        System.out.println(arr);
        // output [3 4 5] output where 9 does nt get add

        CopyOnWriteArrayList<String> str=new CopyOnWriteArrayList<>();
        str.add("Milk");
        str.add("alok");
        str.add("alkk");

        for(String s: str){
            System.out.println(s);
            if(s.equals("alok")){
                str.add("VADE");

            }
        }

        System.out.println(str);
        // output of CopyOnWriteArrayList [Milk, alok, alkk, VADE] gets added





    }
}

