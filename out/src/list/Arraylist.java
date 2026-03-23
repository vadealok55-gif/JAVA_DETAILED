import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arraylist {
     public static void main(String[] args) {

         // Create an empty ArrayList of Strings
         List<String> n1 = new ArrayList<>();
         System.out.println(n1.getClass().getName());
         // Output: java.util.ArrayList

         // Create a fixed-size list using Arrays.asList()
         List<Integer> ab = Arrays.asList(1, 2, 3, 4);
         System.out.println("\n" + ab.getClass().getName());
         // Output: java.util.Arrays$ArrayList
         // Note: Cannot add/remove elements, but can modify (set) existing elements.

         // Create an immutable list using List.of()
         List<Integer> n2 = List.of(1, 2, 3, 4, 5);
         System.out.println(n2.getClass().getName());
         // Output: java.util.ImmutableCollections$ListN
         // Note: Cannot modify (no add, remove, or set allowed)

         // Convert array to list using List.of() and wrap with new ArrayList for mutability
         String[] str = {"alok", "vade"};
         List<String> n4 = new ArrayList<>(List.of(str));
         n4.add("vadealok");
         System.out.println(n4);
         // Output: [alok, vade, vadealok]

         // Demonstrate ArrayList operations
         ArrayList<Integer> arr = new ArrayList<>();
         arr.add(1);
         arr.add(10);
         arr.add(100);
         arr.add(1, 11); // Insert 11 at index 1
         System.out.println("\n" + arr);
         // Output: [1, 11, 10, 100]

         // Add all elements from another list
         List<Integer> addingAll = List.of(444, 5555, 666);
         arr.addAll(addingAll);
         System.out.println("\n" + arr);
         // Output: [1, 11, 10, 100, 444, 5555, 666]

         // Access element at index 3
         int n = arr.get(3); // n = 100

         // Modify element at index 1
         arr.set(1, 987); // arr becomes [1, 987, 10, 100, 444, 5555, 666]

         // Remove by index
         arr.remove(2); // Removes value 10
         // arr = [1, 987, 100, 444, 5555, 666]

         // Remove by index
         arr.remove(1); // Removes value 987 (index 1)
         // arr = [1, 100, 444, 5555, 666]

         // Remove by value (first occurrence)
         arr.remove(Integer.valueOf(1)); // Removes value 1
         // arr = [100, 444, 5555, 666]

         // Check if list contains value
         boolean value = arr.contains(3); // false

         // Get size
         int bn = arr.size(); // 4

         // Sort using List.sort (null comparator = natural order)
         arr.sort(null);

         // Sort using Collections
         Collections.sort(arr); // Also sorts in natural order
         System.out.println("\nFinal sorted list: " + arr);
         // Output: Final sorted list: [100, 444, 666, 5555]


         List<Integer> list = new ArrayList<>();
         System.out.println(list.isEmpty());  // true


         list.clear();
         System.out.println(list); // []


         List<String> list1 = List.of("a", "b", "c", "a");
         System.out.println(list1.indexOf("a")); // 0

         System.out.println(list1.lastIndexOf("a")); // 3


         List<Integer> a = List.of(1, 2, 3);
         List<Integer> b = List.of(1, 2, 3);
         System.out.println(a.equals(b)); // true

         List<Integer> nums = List.of(10, 20, 30, 40, 50);
         System.out.println(nums.subList(1, 4)); // [20, 30, 40]


         arr.replaceAll(x -> x * 2);  // Doubles all elements


         arr.removeIf(x -> x > 1000); // Removes elements > 1000




     }

    public static class CopyonWriteArrayListDEMO {
        public static void main(String[] args) {


            CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();

            /*
             "Copy On Write" means whenever a write operation (adding ,removing) done on
             list it, makes a copy of list and modify over on them instead a real one
             due to it ensures that other threads reading the list uneffected
             */

            // Read Operation : Fast and Direct ,since they happen on stable list without modification
            // Write operation : a new Copy of list and then operations are performed then refernce list is updated in original if no reading operation is done

            List<Integer>   arr=new ArrayList<>();
            arr.add(3);
            arr.add(4);
            arr.add(5);
            System.out.println(arr);

            for(int i=0 ;i<arr.size();i++){
                System.out.println(arr.get(i));
                if(arr.equals(1)){
                    arr.add(9); // here 9 doesnt get added due while reading we are trying to add 9
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
}
