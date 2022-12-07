import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1);
        System.out.println(s2);
//        s2 = "bye";
//        System.out.println(s2);
//        System.out.println(s1);
        /*
         * == checks the address, not the contents.
         * base_string.equals(target_string) checks the contents of the string, character by character matching.
         * -> first it checks the address, if address is same then it returns true.
          * -> If address is not same, then it does character by character matching.
         * */
        String s3 = new String("hello");
        if (s1 == s2) {
            System.out.println("s1" + "==" + "s2");
        } else {
            System.out.println(false);
        }

        System.out.println("s1==s3" + " : " + (s1 == s3));

        System.out.println("s1.equals(s3)" + " : " + (s1.equals(s3)));

        // Immutability of String

    }
}