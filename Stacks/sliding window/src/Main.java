/*
*  {2, 9, 3, 8, 1, 7, 12, 6, 14, 4};
* let, window size is 4
* Ans: {9, 9, 8, 12, 12, 14, }
*
*
*
* */

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 9, 3, 8, 1, 7, 12, 6, 14, 4};
        Stack<Integer> st = new Stack<>();
        int k = sc.nextInt(); // Window size
        for(int i = 0; i<arr.length -k; i++){
            for(int j=i; j<i+k; j++){
                if(j==i){
                    st.push(arr[j]);
                }else{
                    if(st.peek() < arr[j]){
                        st.push(arr[j]);
                    }
                }
            }
            System.out.println(st.peek());
            st.pop();
        }
    }
}