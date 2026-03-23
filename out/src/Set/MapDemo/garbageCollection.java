import java.lang.ref.WeakReference;

public class garbageCollection{
    public static void main(String[] args) {
//         Phone ph= new Phone("samsung ","F-62");    --> Strong Reference
//        System.out.println(ph);
//         ph=null;
//
//        System.out.println(ph);

        WeakReference<Phone> ph=new WeakReference<>(new Phone("SAMSUNG","F-62"));
        System.out.println(ph.get()); //output of reference

        System.gc();  // calling System garbageCollection removes it

        try{
            Thread.sleep(10000);
        }catch(Exception Ignored){

        }

        System.out.println(ph.get());    //Output : null
    }
 }
class Phone{
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}



