import java.util.*;

public class ARRAYLISTcomapreVECTOR {

    public static void main(String[] args) {
       // Vector<Integer>  v=new Vector<>();
       List<Integer> v=new ArrayList<>();

        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                v.add(i);
            }
        });

        Thread t2=new Thread(()->{
           for(int i=0;i<1000;i++) {
               v.add(i);
           }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            System.out.println(e);
        }


         System.out.println(v.size());

        //Vector output : 2000 exact because of synchronisation
        //ArrayList output : 2000 != this because randomness
    }

}
