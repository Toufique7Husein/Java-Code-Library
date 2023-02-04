//created by Toufique on 04/02/2023

import java.io.*;
import java.util.*;

public class DigitSumUsingReccursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = 11234;
        debug(sumOfDigit(n));
        pw.close();
    }


    static int sumOfDigit(int num) {
        if(num == 0) return 0;
        return ((num % 10) + sumOfDigit(num / 10));
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
