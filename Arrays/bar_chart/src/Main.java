import java.lang.*;
import java.util.Scanner;
//import java.util.Collections;



public class Main {
    public static int find_max(int[] arr){
        int res = Integer.MIN_VALUE;
        for(int i : arr){
            if(res < i){
                res = i;
            }
        }
        System.out.println("Largest_num: "+ res);
        return res;
    }
    public static void get_bar_chart(int[] arr, int max_num){
        for(int i=max_num; i>=1; i--){
            for(int j:arr){
                if(j >= i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("n: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
//        System.out.println(Collections.max(arr));
        int max_num = find_max(arr);
        get_bar_chart(arr, max_num);
    }
}