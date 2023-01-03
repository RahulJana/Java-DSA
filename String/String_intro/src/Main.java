/*
* Java is so fucked up: https://www.youtube.com/watch?v=On4698IIBCk
* */


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = "Hello";
        System.out.println(s1);

        // Input strings
        String s2 = scn.next();
        String s3 = scn.next();

        System.out.println(s2);
        System.out.println(s3);

        scn.nextLine();  // Essential for using next line
        String s4 = scn.nextLine();
        String s5 = scn.nextLine();
//
        System.out.println(s4);
        System.out.println(s5);
    }
}