/*
* 73912 --> -6 [Same as -1 rotation.]
* 27391 --> -5 [Back to original digit]
* 12739 --> -4
* 91273 --> -3
* 39127 --> -2
* 73912 --> -1
* 27391 --> 0 <--------------------BASE DIGIT
* 12739 --> +1 rotation
* 91273 --> +2 ''
* 39127 --> +3 ''
* 73912 --> +4 ''
* 27391 --> +5 '' [Back to original digit]
* 12739 --> +6 '' [Same as +1 rotation]
*
*
* 0 == +5 == -5
* +1 == -4 == +6
* +2 == -3
* +3 == -2
* +4 == -1
*
* */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Digit: ");
        Scanner scn = new Scanner(System.in);
        int dig = scn.nextInt();

        System.out.println("Enter Rotation: ");
        int rot = scn.nextInt();

    }
}