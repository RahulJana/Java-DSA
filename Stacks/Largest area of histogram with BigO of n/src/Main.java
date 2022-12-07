import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int[] arr = {2,1,2};  // [2,1,5,6,2,3]
        int[] res_arr = new int[arr.length];
        int n = arr.length;

        int[] rb = new int[arr.length]; // right boundary -> Will store index of the NSE right
        st.push(n -1);
        rb[n-1] = n;
        for(int i = n-2; i>=0; i--){
            // pop
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() > 0){
                rb[i] = st.peek();
            }else{
                rb[i] = n;  // End of the list;
            }
            // populate rb
            st.push(i);
        }

        int[] lb = new int[arr.length]; // left boundary -> Will store index of NSE left
        st = new Stack<>();
        st.push(0);
        lb[0] = -1;

        for(int i = 1; i<n; i++){
            // pop
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() > 0){
                lb[i] = st.peek();
            }else{
                lb[i] = -1;  // Begining of the list
            }
            // populate lb
            st.push(i);
        }

        int maxHeight = 0;
        int maxArea = 0;

//        System.out.println(rb);
//        System.out.println(lb);

        for (int i = 0; i < arr.length; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;
            if (area > maxArea) {
                maxArea = area;
                maxHeight = arr[i];
            }
        }
        System.out.println(maxArea);
        System.out.println(maxHeight);
    }
}