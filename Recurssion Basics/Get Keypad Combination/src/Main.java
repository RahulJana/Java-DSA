import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    /*
     * // Codes in the number pad.
     * 0 -> .;
     * 1 -> abc
     * 2 -> def
     * 3 -> ghi
     * 4 -> jkl
     * 5 -> mno
     * 6 -> pqrs
     * 7 -> tu
     * 8 -> vwx
     * 9 -> yz
     */
    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1); // Rest of the string.

        ArrayList<String> recursionResult = getKPC(ros);
        ArrayList<String> myResult = new ArrayList<>();

        String codeCh = codes[ch - '0'];  // Converting Char -> int.
        for (int i = 0; i < codeCh.length(); i++) {
            char chCode = codeCh.charAt(i);
            for (String resultantString : recursionResult) {
                myResult.add(chCode + resultantString);
            }
        }
        return myResult;
    }
}