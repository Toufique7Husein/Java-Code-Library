//created by Toufique on 18/08/2023

//number of way to fill an array with 0 or and 1, 1 could not be consecutive


import java.io.*;
import java.util.*;

public class Random {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);


        debug(fun(1, 3, false));


        pw.close();
    }


    static int fun(int indx, int n, boolean one) {
        if (indx == n + 1) return 1;
        int ans = 0;
        //plece 0 here
        ans += fun(indx + 1, n, false);
        //place 1 here
        if (!one) {
            ans += fun(indx + 1, n, true);
        }


        return ans;
        //ans for array [indx....n]
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
