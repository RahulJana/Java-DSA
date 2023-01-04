import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder(scn.nextLine());

        System.out.println(sb);

        for(int i = 0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                }else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        System.out.println(false);
        System.out.println("--- end ---");

        // check symmetry

    }
}