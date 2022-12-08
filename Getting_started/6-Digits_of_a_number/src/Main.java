import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nod = 0;
        int temp = n;
        while(temp != 0){
            temp /= 10;
            nod++;
        }
        System.out.println(nod);
        int div = (int)Math.pow(10, nod-1);
        while(div!= 0){
            int q = n/div;
            System.out.println(q);

            n%=div;
            div/=10;
        }
    }
}