/*
*
* Algo:
* pop the small digits
* print ans
* push
*
*/

import java.util.*;

public class Main {
    public static void display(int[] arr) {
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] arr = {2,5,9,3,1,12,6,8,7};
        int[] res_arr = new int[arr.length];

        st.push(arr[arr.length-1]);
        res_arr[arr.length-1] = -1;  // Last element.

        for(int i = arr.length-2; i>=0; i--) {
            while(st.size() > 0 && st.peek() < arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                res_arr[i] = -1;
            }else{
                res_arr[i] = st.peek();
            }

            st.push(arr[i]);
        }
//        System.out.println();
        display(res_arr);
    }
}