/*
    Only need to print the instruction not the final output.
    which means output format is: 1[10 -> 11];
    not the stack.

    You are required to:
        1. Print the instructions to move the disks.
        2. from tower 1 to tower 2 using tower 3 
        3.following the rules:
            3.1 move 1 disk at a time.
            3.2 never place a smaller disk under a larger disk.
            03.3 you can only move a disk at the top.
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1id = scn.nextInt();
        int t2id = scn.nextInt();
        int t3id = scn.nextInt();

        toh(n, t1id, t2id, t3id);
    }

    public static void toh(int n, int t1id, int t2id, int t3id) {
        if(n==0){
            return;
        }
        toh(n - 1, t1id, t3id, t2id); // Will the print the instruction(Output) to move (n-1) disk from t1id -> t3id
                                      // with the help of t2id, by abiding all the given rules.
        System.out.println(n + "[" + t1id + "->" + t2id + "]");
        // Output format: 1[10 -> 11]

        toh(n - 1, t3id, t2id, t1id); // Will the print the instruction(Output) to move (n-1) disk from t3id -> t2id
                                      // with the help of t1id, by abiding all the given rules.

    }

}