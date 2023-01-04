import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
/*
*         int[] arr;  // Declaration
*         arr = new int[5];  // Assignment
*
* */
        // combined
        int[] arr = new int[5];
        System.out.println(arr.length);
        Scanner scn = new Scanner(System.in);

        // Storing the values.
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        int[] arr2 = arr;
        arr2[2] = 69;

        System.out.println("Values of arr2: ");
        for(int i = 0; i< arr2.length; i++){
            System.out.println(arr2[i]);
        }

        // The value of arr[2] will also change.
        System.out.println("Values of arr: ");
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}