//created by Toufique on 08/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_872B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        /*
        * 2 3
        * 7 8 9 -3 10 8-->:
        *
        * */

       // ∑i=1n∑j=1m(max1≤x≤i,1≤y≤jax,y−min1≤x≤i,1≤y≤jax,y)


        /*int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {

        }*/

        for (int i = 1; i <= 2; i++) {
            ArrayList<String> ls = new ArrayList<>();
            for (int j = 1; j <= 3; j++) {
                ls.add(i + " " + j);
            }
            debug(ls);
        }


        pw.close();
    }

    static long solve(int n, int m, int[] a) {
        long ans = 0;



        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
