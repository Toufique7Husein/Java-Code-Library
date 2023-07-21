import java.io.*;
import java.util.*;

public class Hw3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int n = in.nextInt();
            if (n == 0) break;
            System.out.println(n);
        }

        System.out.println(gcd(20, 200));
        System.out.println(sumOfDigit(786));

    }

    static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    static int sumOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

}
