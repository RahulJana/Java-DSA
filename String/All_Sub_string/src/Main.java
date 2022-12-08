import java.util.*;

public class Main {
    public static boolean check_palindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            char c1 = str.charAt(i);
            char c2 = str.charAt(j);
            if(c1 != c2){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scn = new Scanner(System.in);

        String s1 = scn.nextLine();
        System.out.println(check_palindrome(s1));

        for(int i = 0; i<s1.length(); i++){
            for(int j = i+1; j<=s1.length(); j++){
                String ss = s1.substring(i, j);
                if(check_palindrome(ss)){
                    System.out.println(ss);
                }
            }
        }
    }
}