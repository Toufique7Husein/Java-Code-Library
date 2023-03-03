import java.util.*;
import java.io.*;

public class Div2_846B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int T = in.nextInt();
        for (int t=0; t<T; t++) {
            int N = in.nextInt();
            long total = 0;
            int[] A = new int[N];
            for (int n=0; n<N; n++) {
                int a = in.nextInt();
                total += a;
                A[n] = a;
            }
            long max = 1;
            long sum = 0;
            for (int n=0; n<N-1; n++) {
                sum += A[n];
                long rest = total - sum;
                max = Math.max(max, gcd(sum, rest));
            }
            pw.println(max);
        }
        pw.close();
    }

    static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a%b);
    }

}
