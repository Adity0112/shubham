import java.util.HashMap;
import java.util.Scanner;

public class Hashmapexample {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        System.out.println("enter");
        String at = mk.nextLine();

        //logic

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i< at.length();i++){
            char ch = at.charAt(i);


            /*  mk.charAt(i): It picks one character from the string
                              mk at a specific position (index) i.
             */
            // char is a data type that stores a single character.

            map.put(ch,map.getOrDefault(ch,0)+1); // frquency finding
        }
        System.out.println(map);
    }
}
