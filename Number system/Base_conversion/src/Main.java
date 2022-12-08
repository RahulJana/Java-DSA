import java.util.*;
import java.lang.*;

public class Main {

//    public static boolean check_possibility(int digit, int base){
//        int i = 0;
//        boolean possibility;
//        int num_digits = 0;
//        int digit_copy = digit;
//        int[] arr;
//        while(digit_copy != 0){
//            digit_copy /= 10;
//        }
//    }
    public static int convert_base(int digit, int base, int target_base){
        int rv = 0;
        int p = 1; // smallest power: (number)^0 = 1
        int temp_dig;
        while(digit > 0){
            temp_dig = digit%target_base;
            digit /= target_base;

            rv += temp_dig * p;
            p = p * base;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Digit: ");
        int digit = scn.nextInt();

        System.out.print("Base: ");
        int base = scn.nextInt();

//        boolean possibility = check_possibility(digit, base);
//
//        if(!possibility){
//            System.exit(0);
//        }
        System.out.print("target_base: ");
        int target_base = scn.nextInt();

        int result = convert_base(digit, base, target_base);

        System.out.print("[" + digit + "]" + base + " = " + "[" + result+"]" + target_base);
    }
}