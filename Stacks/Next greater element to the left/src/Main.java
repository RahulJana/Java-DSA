import java.util.*;

public class Main {
    public static void display(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] arr = {2,5,9,3,1,12,6,8,7};
        int[] res_arr = new int[arr.length];

        st.push(arr[0]);  // 1st element of the stack.
        res_arr[0] = arr[0];
        for(int i = 1; i<arr.length-1; i++){
            while (st.size() != 0 && st.peek() > arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                res_arr[i] = -1;
            }else{
                res_arr[i] = st.peek();
            }
            st.push(arr[i]);
        }
        display(res_arr);
    }
}