import java.util.*;

public class Main {

    public static void insertionSort(int[] arr) {
        // write your code here
        for (int i = 1; i < arr.length; i++) { // Taking i = 1, as we have faith that 0th element is sorted.
            for (int j = i - 1; j >= 0; j--) {
                if (isGreater(arr, j, j + 1)) {
                    swap(arr, j, j + 1);
                } else {
                    break;
                }
            }
        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int rightIndex, int leftIndex) {
        System.out.println("Swapping " + arr[rightIndex] + " and " + arr[leftIndex]);
        int temp = arr[rightIndex];
        arr[rightIndex] = arr[leftIndex];
        arr[leftIndex] = temp;
    }

    // return true if jth element is greater than ith element
    public static boolean isGreater(int[] arr, int rightIndex, int leftIndex) {
        System.out.println("Comparing " + arr[leftIndex] + " and " + arr[rightIndex]);
        if (arr[leftIndex] < arr[rightIndex]) {
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
        insertionSort(arr);
        print(arr);
        scn.close();
    }

}