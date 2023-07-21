//created by Toufique on 25/05/2023

import java.io.*;
import java.util.*;

public class TrailingZero {
    long findMinimumValueWithKTrailingZeros(int k) {
        long l = 0, r = (long) 1e12, res = -1;
        while (l <= r) {
            long mid = (l + r) / 2;
            long zeros = countTrailingZerosOfFactorial(mid);
            if(zeros >= k) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if(countTrailingZerosOfFactorial(res) == k) return res;
        else return -1;
    }

    long countTrailingZerosOfFactorial(long n) {
        long cnt = 0;
        for (long x = 5; x <= n; x *= 5) {
            cnt += (n / x);
        }
        return cnt;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
