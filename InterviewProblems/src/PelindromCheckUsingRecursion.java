//created by Toufique on 04/02/2023

import java.io.*;
import java.util.*;

public class PelindromCheckUsingRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        debug(isPalindrome("aabab".toCharArray(), 0, 4));
        pw.close();
    }

    static boolean isPalindrome(char[] c, int s, int e) {
        if (s == e) return true;
        if (c[s] != c[e]) return false;
        if (s < e + 1)isPalindrome(c, s + 1, e - 1);
        return true;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
