import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String xxx = "aditya";
        String yyy = "ayditaw";

        if (isanagram(xxx, yyy)) {
            System.out.println("ha h ye");
        } else {
            System.out.println(" bhag bsdk");
        }
    }

    public static boolean isanagram(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charA1 = str1.toCharArray();
        char[] charA2 = str2.toCharArray();

        Arrays.sort(charA1);
        Arrays.sort(charA2);

        return Arrays.equals(charA1,charA2);
    }
}