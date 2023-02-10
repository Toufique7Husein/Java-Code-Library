//created by Toufique on 10/02/2023

import java.io.*;
import java.util.*;

public class PelindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = 121;
        if (n == iterativeReverse(n)) {
            pw.println("Yes it is Palindrome");
        }
        debug(recursiveRevers(0, 987654321));
        pw.close();
    }

    static long iterativeReverse(long n) {
        long ans = 0;
        while (n != 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        return ans;
    }

    static long recursiveRevers(long ans, long n) {
        if (n == 0) return ans;
        return recursiveRevers(ans * 10 + n % 10, n / 10);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
