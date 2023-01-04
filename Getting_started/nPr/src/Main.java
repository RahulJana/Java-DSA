/*
* Benefits of function:
* Modularity
* Maintainability
* DRY: Do not Repeat Yourself
*
* */

import java.util.*;
public class Main {
    public static void display(int n, int r, int res){
        System.out.println(n + "P" + r + "=" +res);
    }
    public static int fact_fn(int x){
        int fact = 1;
        for(int i=1; i<=x; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("n: ");
        int n = scn.nextInt();

        System.out.print("r: ");
        int r = scn.nextInt();

        int res = fact_fn(n)/fact_fn(n-r);
        display(n, r, res);
    }
}