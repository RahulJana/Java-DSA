/* link: https://www.youtube.com/watch?v=dbk42TKwk4M&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=23
* Inverse of a number:
* 8 7 6 5 4 3 2 1 <- positions
* 2 1 7 3 5 4 6 8 <- number(input)
* -----------------------------------
* 8 7 6 5 4 3 2 1 <- Positions
* 1 6 2 4 3 5 8 7 <- output
*
* Disclaimer: inverse of 1234 is 1234 .......LOL XD
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int nod = 0;
        while(temp!= 0){
            temp /= 10;
            nod ++;
        }
        System.out.println(nod);
        int div = (int)Math.pow(10, nod-1);
        int new_digit = 0;
        while(div != 0){
            int q = n/div;
            new_digit += nod * (int)Math.pow(10, q-1);
            System.out.println(new_digit);

            n %= div;
            div /= 10;
            nod -= 1;
        }
        System.out.println(new_digit);
    }
}