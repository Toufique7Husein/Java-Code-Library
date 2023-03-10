//created by Toufique on 10/03/2023

import java.io.*;
import java.util.*;

public class LeetCode_69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        debug(mySqrt(2147395599));

        pw.close();
    }
    static int mySqrt(int x) {
        long l = 1, r = x;
        long ans = x;
        while(l <= r) {
            long mid = l + (r - l) / 2;
            long temp = mid * mid;
            if(temp <= x) {
                l = mid + 1;
                ans = mid;
            } else {
                r = mid - 1;
            }
        }
        return (int)ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
