import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=0;i<t;i++){
            int a = scn.nextInt();
            int b = scn.nextInt();
            int n = scn.nextInt();
            for(int j = 0; j<n; j++){
                double res = a+ Math.pow(2, j)+b;
            }
        }

    }
}