import java.util.*;

 class Mycomparator implements Comparator<Integer> {

    public int compare(Integer n1, Integer n2) {
        return n1 -n2;
    }

    //if -ve then n1 will come first then n2
    //if 0 then n1 and n2 are equal
    // if +ve  n2 will come first and then n2
}

class Mystringcompare implements Comparator<String>{
     public int compare(String s1,String s2){
         return s2.length()-s1.length();
     }

}
public class ComparatorInSORTING {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(52);
        arr.add(12);
        arr.sort(new Mycomparator());
        System.out.println(arr);


        List<String> str=Arrays.asList("alok","balaa","chotiii");


        str.sort(new Mystringcompare());


        str.sort((a,b)->b.length()-a.length());
        System.out.println(str);


    }
}
