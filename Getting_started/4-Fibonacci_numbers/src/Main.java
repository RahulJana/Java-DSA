import java.util.Scanner;
// Without Recursion.
public class Main {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        Scanner scn = new Scanner(System.in);
        System.out.println("n: ");
        int n = scn.nextInt();
        System.out.println("n1: "+n1);
        System.out.println("n2: "+n2);
        for (int i = 3; i<=n; i++){
            int n3 = n1+n2;
            System.out.println("n"+i+": "+n3+";"+n1+","+n2);
            n1 = n2;
            n2 = n3;
        }
    }
}