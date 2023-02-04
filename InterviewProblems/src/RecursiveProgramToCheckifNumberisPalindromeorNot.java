//created by Toufique on 04/02/2023

import java.io.*;
import java.util.*;

public class RecursiveProgramToCheckifNumberisPalindromeorNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        {
            int n = 12371;
            int revN = revers(n, 0);
            if (n == revN) {
                pw.println("It Is Palindrome");
            } else pw.println("It is not Palindrome number");
        }

        //check for another Number
        {
            int n = 12321;
            int revN = revers(n, 0);
            if (n == revN) {
                pw.println("It Is Palindrome");
            } else pw.println("It is not Palindrome number");
        }

        pw.close();
    }

    static int revers(int n, int temp) {
        if (n == 0) return temp;
        temp = (temp * 10) + (n % 10);
        return revers(n / 10, temp);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
