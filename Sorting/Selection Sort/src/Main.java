import java.io.*;
import java.util.*;

public class Main {

    public static void selectionSort(int[] arr) {
        // write your code here
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (isSmaller(arr, j, minIndex)) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int rightIndex, int leftIndex) {
        System.out.println("Swapping " + arr[rightIndex] + " and " + arr[leftIndex]);
        int temp = arr[rightIndex];
        arr[rightIndex] = arr[leftIndex];
        arr[leftIndex] = temp;
    }

    // return true if ith element is smaller than jth element
    public static boolean isSmaller(int[] arr, int rightIndex, int leftIndex) {
        System.out.println("Comparing " + arr[rightIndex] + " and " + arr[leftIndex]);
        if (arr[rightIndex] < arr[leftIndex]) {
            return true;
        } else {
            return false;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        selectionSort(arr);
        print(arr);
    }

}