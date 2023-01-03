import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<String> ls = new ArrayList<>();
        ls.add("( `(0 3 0)` )");
        ls.add("o_O");
        ls.add(";)");
        ls.add("=_=");
//        System.out.println(ls);

        for(int i = 0; i<ls.size(); i++){
            String val = ls.get(i);
            System.out.println(val);
        }
        System.out.println("---------------------------------------");
        for(String val: ls){
            System.out.println(val);
        }
    }
}