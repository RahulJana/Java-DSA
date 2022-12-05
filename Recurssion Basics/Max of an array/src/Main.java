import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int maxNum = maxOfArray(arr, n-1);
        System.out.println(maxNum);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx < 0){
            return 0;
        }
        int max = maxOfArray(arr, idx-1);
        if(max < arr[idx]){
            max = arr[idx];
        }
        return max;
    }

}