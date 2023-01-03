import java.util.Scanner;

public class Main {
    public static int base_addition(int d1, int d2, int base){
        int result = 0;
        int carry = 0;
        int p = 1;
        int d1_temp = 0;
        int d2_temp = 0;

        while(d1>0 || d2>0 || carry>0){
            d1_temp = d1%10;
            d1 /= 10;

            d2_temp = d2%10;
            d2 /= 10;

            int addition_element = (d1_temp + d2_temp + carry)%base;
            carry = (d1_temp + d2_temp + carry)/base;

            result += addition_element*p;
            p *= 10;
        }

        return result;
    }

    public static int base_subtraction(int d1, int d2, int base){
        int result = 0;
        int carry = 0;
        int p = 1;
        int d1_temp = 0;
        int d2_temp = 0;

        while(d1>0 || d2>0 || carry>0){
            d1_temp = d1%10;
            d1 /= 10;

            d2_temp = d2%10;
            d2 /= 10;

            int addition_element = (d1_temp + d2_temp + carry)%base;
            carry = (d1_temp + d2_temp + carry)/base;

            result += addition_element*p;
            p *= 10;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d1 = scn.nextInt();
        int d2 = scn.nextInt();
        int base = scn.nextInt();

        int result = base_addition(d1, d2, base);
        System.out.print("[(" + d1 + ")" + base + "]+[(" + d2 + ")" + base + "] = " + result);
    }
}