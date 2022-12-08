import java.util.Scanner;

public class Main {

    public static void printDecreasing(int num){
        if(num > 0){
            System.out.println(num);
            printDecreasing(num-1);
        }
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        if(n <= 0){
            return;
        }
        printDecreasing(n);
    }
}
