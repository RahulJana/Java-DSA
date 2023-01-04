import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello world!");

//        String s1 = scn.nextLine();
//        System.out.println(s1);
//
//        System.out.println(s1.length());  // Length of a string
//
//        System.out.println(s1.charAt(0));
//
//        char c = s1.charAt(1);
//
//        System.out.println(c);

        // String is immutable we can't directly change the value of the string

        // Substring:
//        System.out.println(s1.substring(1, 5)); // 12345678 -> 2345
//
//        // Concatenate two strings
//        String s2 = "ncie";
//        String s3 = "incin";
//        String s4 = s2+s3;
//        s4 += "cnidcopcooc";
//        System.out.println(s4);

        // Splitting strings
        String s6 = "npenv owenvon vownepv owevnpw";
        String[] parts = s6.split(" ");  // Splits and stores into array of datatype String
        for(String i:parts){
            System.out.println(i);  // the data type of i is set to string; as "i" accesses the items rather than the index, and here items are string
        }
        System.out.println(parts.length);
    }
}