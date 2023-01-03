import java.util.*;

public class Main {
    public static boolean handle_brackets(char ch, Stack<Character> st) {
        if(st.size() == 0){
            return false;
        }else if(st.peek() != ch){
            return false;
        }else{
            st.pop();
            return true;
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scn.nextLine());
        Stack<Character> st = new Stack<>();
        System.out.println(sb);
        boolean check = true;

        for(int i = 0; i<sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }else if (ch == ')') {
                check = handle_brackets('(', st);
            }else if (ch == '}') {
                check = handle_brackets('{', st);
            }else if(ch == ']'){
                check = handle_brackets('[', st);
            }
            if(!check){
                System.out.println(false);
                return;
            }
        }
        if(st.size() != 0){
            check = false;
        }
        System.out.println(check);

    }
}