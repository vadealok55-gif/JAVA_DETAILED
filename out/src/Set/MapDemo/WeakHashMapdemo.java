import java.util.WeakHashMap;

public class WeakHashMapdemo {
    public static void main(String[] args) {
          WeakHashMap<String, Image> map=new WeakHashMap<>();
          map.put(new String("ALOK"),new Image("VADE"));
        System.out.println(map); //output : stored will be output
        System.gc();             // system garbage collector removes weak reference stored
        EditInTheWaySuchThatitPRO();
        System.out.println(map); // output would be {} null
    }

    public static void EditInTheWaySuchThatitPRO(){
        System.out.println("wait until the garabge remoes it after command SYSTEM.GC()");
        try{
            Thread.sleep(10000);
        }catch(Exception Ignored){

        }
    }
}

class Image{
    String name;

    public Image(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }

}