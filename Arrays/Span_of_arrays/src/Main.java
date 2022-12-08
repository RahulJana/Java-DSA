/*
* https://runestone.academy/ns/books/published/apcsareview/VariableBasics/minAndMax.html#:~:text=The%20int%20type%20in%20Java,Why%20those%20numbers%3F
* The int type in Java can be used to represent any whole number from -2147483648 to 2147483647.
* Why those numbers? Integers in Java are represented in 2’s complement binary and each integer gets 32 bits of space.
* In 32 bits of space with one bit used to represent the sign you can represent that many values.
* Why is there one more negative number than positive number? It is because 0 is considered a positive number.
* What do the last two lines print out? Did this surprise you?
* Java will actually return the maximum integer value if you try to subtract one from the minimum value.
* This is called underflow. And, Java will return the minimum integer value if you try to add one to the maximum.
* This is called overflow. It is similar to how odometers work. When would you ever use Integer.MIN_VALUE or Integer.MAX_VALUE?
* They are handy if you want to initialize a variable to the smallest possible value and then search a sequence of values for a larger value.
* */

import  java.util.Scanner;


public class Main {
    public static int largest_number(int[] arr){
        int result = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(result<arr[i]){
                result = arr[i];
            }
        }
        return result;
    }

    public static int smallest_number(int[] arr){
        int result = Integer.MAX_VALUE;

        for (int j : arr) {  // Enhanced For, giga-chad. Used for traversing through elements.
            if (result > j) {
                result = j;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("length: ");
        int length = scn.nextInt();

        int[] arr = new int[length];

        for(int i = 0; i<length; i++){
            arr[i] = scn.nextInt();
        }

        int max_num = largest_number(arr);
        int min_num = smallest_number(arr);

        System.out.println(max_num);
        System.out.println(min_num);
        // Or we can use Math.max and Math.min

        System.out.println("Span: "+ (max_num-min_num));

    }
}