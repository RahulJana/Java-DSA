import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // String s1 = null;
        // System.out.println(s1);
        /*
         * o/p: null
         */

        // String s1 = new String();
        // System.out.println(s1);
        /*
         * o/p: (nothing/blank)
         */

        // String s1 = scn.next(); // Next takes values separated by space.
        // String s2 = scn.next();
        /*
         * dnvlosd dsvnblsk
         * dnvlosd
         * dsvnblsk
         */
        // String s1 = scn.nextLine();
        // String s2 = scn.nextLine();
        /*
         * ibowebv
         * opewvf
         * ibowebv
         * opewvf
         */
        // System.out.println(s1);
        // System.out.println(s2);

        String str = scn.nextLine();
        System.out.println(str);
        System.out.println(str.length());
        /*
         * In String length is a method/function so we have call it like a
         * function:str.length().
         * Where in case of array it is a data-member.
         */
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr.length);

    }
}