/*
* Sample_input: aabbcdeefff
* Sample_output: a2b2cde2f3
*
*
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scn.nextLine());
        char temp = ' ';
        int count = 0;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i<sb.length(); i++) {
            if (temp != sb.charAt(i)) {
                if(count > 1){
                    res.append(count);
                }
                res.append(sb.charAt(i));
                temp = sb.charAt(i);
                count = 1;
            } else {
                count++;
            }
            if(i == sb.length()-1){  // To add the count of last element.
                res.append(count);
            }
        }
        System.out.println(res);
    }
}