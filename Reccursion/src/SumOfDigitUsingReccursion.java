//created by Toufique on 21/02/2023

import java.io.*;
import java.util.*;

public class SumOfDigitUsingReccursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        debug(sumOfDigits(10000));

        pw.close();
    }

    static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
