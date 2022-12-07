// Complexity O(n2)

import java.util.*;

public class Main {
    public static int rectangleArea(int length, int width){
        return length*width;
    }
    public static int check_large_right(int[] hist, int value, int index){
        int count = 0;
        for(int i = index; i<hist.length; i++){
            if(hist[i] >= value){
                count++;
            }else{
                return count;}
        }
        return count;
    }
    public static int check_large_left(int[] hist, int value, int index){
        int count =0;
        for(int i = index-1; i>=0; i--){
            if(hist[i] >= value){
                count++;
            }else{
                return count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] hist = {6,2,5,4,5,1,6};
        ArrayList<Integer> res_area = new ArrayList<>();  // use Collections.max()

        int single_hist = 1;
        for(int i = 0; i<hist.length; i++){
            int toRight = check_large_right(hist, hist[i], i);
            int toLeft = check_large_left(hist, hist[i], i);

            int width = toLeft+toRight;
            res_area.add(width*hist[i]);
        }
        System.out.println(res_area);
        System.out.println(Collections.max(res_area));


    }
}