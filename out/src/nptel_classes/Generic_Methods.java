public class Generic_Methods {
   public <T>  void genericSolution(T t){
        System.out.println(t);
    }

//    public static void main(String[] args) {
//        Generic_Methods obj =new Generic_Methods();
//
//        obj.genericSolution(101);
//
//        obj.genericSolution("ALOK swayam");
//
//        obj.genericSolution(78.9);
//    }
//






 /*   public static <T> void swap(T x,T y){
       T temp;
       temp=x;
       x=y;
       y=temp;
    }

    public static void main(String[] args) {
        Integer x=new Integer(99);
        Integer y=new Integer(44);
        System.out.println(x+" "+y);
        swap(x,y);
        System.out.println(x+" "+y);
    }

output
99 44
99 44


   Method parameters are passed by value (even objects).
    When you call swap(x, y), copies of x and y are made.
    Inside swap(), you only swap these copies, not the original x and y in main().
    So after the method finishes, the original variables remain unchanged.

*/





}


/*
    generic methods

    <access specifier> <return type>  mName(<type list>) {
      //body
    }
*/