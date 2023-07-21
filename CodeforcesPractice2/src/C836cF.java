//created by Toufique on 07/07/2023

;import java.io.*;
import java.util.*;

public class C836cF {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        
        int t = in.nextInt();
        for(int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), x = in.nextInt();
            if (possible(n, x)) {
                int[] ans = solve(n, x);
                for (int i = 1; i <= n; i++) pw.print(ans[i] + " ");
                pw.println();
            } else pw.println(-1);
        }
        
        pw.close();
    }

    static int[] solve(int n, int x) {
        int[] ans = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            ans[i] = i;
        }
        ans[1] = x;
        ans[n] = 1;
        ans[x] = n;
        for (int i = 2; i < n; i++) {
            if (n % i == 0 &&  i % x == 0) {
                int temp = ans[x];
                ans[x] = i;
                ans[i] = temp;
                x = i;
            }
        }
        if (x == n) ans[n] = 1;
        return ans;
    }
    static boolean possible(int n, int x) {
        return n % x == 0;
    }
    
    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
