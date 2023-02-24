//created by Toufique on 24/02/2023

import java.io.*;
import java.util.*;

public class Hello2023_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            int ans = -1;
            for(int i = 0;i<n-1;i++){
                if(s[i] == 'L' && s[i+1] == 'R'){
                    ans = i+1;
                    break;
                } else if(s[i] == 'R' && s[i + 1] == 'L'){
                    ans = 0;
                    break;
                }
            }
            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
