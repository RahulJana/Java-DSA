/*
* Push -> Add
* Pop -> Remove
* Peek -> Get
* Size
* */


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        System.out.println(st);

        System.out.println(st.size());
        System.out.println(st.peek());

        st.pop();
        System.out.println(st);

    }

}