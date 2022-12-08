import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int counter = 0;
        while(n != 0){
            n /= 10;
            counter += 1;
        }
        System.out.print(counter);
    }
}