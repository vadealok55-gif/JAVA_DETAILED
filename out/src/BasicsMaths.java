import java.util.*;
public class BasicsMaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int count=0;
        while(n!=0){
            int t=n%10;
            rev=rev*10+t;
            n=n/10;
            count++;
        }

        System.out.println(rev+" "+count);
        sc.close();

    }
}
