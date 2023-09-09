//created by Toufique on 10/08/2023

import java.io.*;
import java.util.*;

public class ExceelSheetIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        debug(getIndex(289908));

        pw.close();
    }
    static String getIndex(int v) {
        String ans = "";
        while (v > 0) {
            int temp = (v - 1) % 26;
            char c = (char)(temp + 'A');
            ans = c + "" + ans;
            v = (v - 1) / 26;
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
