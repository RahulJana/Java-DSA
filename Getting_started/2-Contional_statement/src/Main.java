import java.awt.*;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("marks: ");
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();

        if(marks >= 90){
            System.out.println("A++");
        } else if (marks >= 80) {
            System.out.println("A");
        }else {
            System.out.println("B");
        }
    }
}