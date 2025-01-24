import java.io.OptionalDataException;
import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        int[] ad = {116778689};

        if (number(ad)) {
            System.out.println("true");
        } else {
            System.out.println("nahi");
        }
    }

       public static  boolean number(int[] ad){
        int start = 0;
           int last = ad.length -1;

           while(start< last){
               if(ad[start] != ad [last]){
                   return false;
               }
               start++;
               last--;
           }
           return true;
       }

}
