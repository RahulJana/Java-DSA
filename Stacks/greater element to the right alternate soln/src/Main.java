/*
* Solving this problem itrating from left to right.
* */

import java.util.*;

public class Main {
    public static void display(int[] arr){
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];

        st.push(0);
        for(int i = 1; i<arr.length; i++){
            while(st.size() > 0 && arr[st.peek()] < arr[i]){
                int pos = st.peek();
                res[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size() > 0){
            int pos = st.peek();
            res[pos] = -1;
            st.pop();
        }
        display(res);
    }
}