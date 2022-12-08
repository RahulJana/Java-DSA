/*
* Iterative algo.
*
* */


import java.util.*;
public class Main {
    public static int factorial(int len){
        int res = 1;
        for(int i = 2; i<=len; i++){
            res*=i;
        }
        return res;
    }
    public static void perm_str(StringBuilder str){
        int len = str.length();
        int fact = factorial(len);
        for(int i = 0; i<fact; i++){
            int temp = i;
            StringBuilder cpy = new StringBuilder(str);
            for(int div = len; div>=1; div--){
                int q = temp/div;
                int rem = temp%div;

                System.out.print(cpy.charAt(rem));
                cpy.deleteCharAt(rem);
                temp = q;
            }
            String dash = "-";
            System.out.println(dash.repeat(len+4)+">"+(i+1));
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scn.nextLine());
        System.out.println(sb);
        perm_str(sb);
    }
}