import java.util.*;

public class Main {

    public static void bubbleSort(int[] arr) {
        // write your code here
        for (int i = 1; i <= arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - i); j++) {
                if (isSmaller(arr, j + 1, j)) {
                    swap(arr, j + 1, j);
                }
            }
        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int rightElement, int leftElement) {
        System.out.println("Swapping " + arr[rightElement] + " and " + arr[leftElement]);
        int temp = arr[rightElement];
        arr[rightElement] = arr[leftElement];
        arr[leftElement] = temp;
    }

    // return true if ith element is smaller than jth element
    public static boolean isSmaller(int[] arr, int rightElement, int leftElement) {
        System.out.println("Comparing " + arr[rightElement] + " and " + arr[leftElement]);
        if (arr[rightElement] < arr[leftElement]) {
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
        bubbleSort(arr);
        print(arr);
        scn.close();
    }

}