import java.util.ArrayList;
import java.util.*;

public class Main {
    public static boolean check_prime(int digit) {
        int count = 0;
        for(int i = 1; i<=digit/2; i++){
            if(digit%i == 0){
                count++;
            }
        }
        if(count == 1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>(List.of(10, 3, 4, 7, 69));
        for(int i=0; i<al.size(); i++){
            boolean res = check_prime(al.get(i));
            if(res == true){
                al.remove(i);
            }
        }
        System.out.println(al);
    }
}