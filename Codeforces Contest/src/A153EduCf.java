//created by Toufique on 17/08/2023
;import java.io.*;
import java.util.*;

public class A153EduCf {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        
        int t = in.nextInt();
        for(int tt = 0; tt < t; tt++) {
            String s = in.next();
            String s1 = "";
            String s2 = "";

            int n = s.length();
            for (int i = 0; i < n; i++) s1 = s1 + "()";
            for (int i = 0; i < n; i++) s2 = s2 + "(";
            for (int i = 0; i < n; i++) s2 = s2 + ")";

            if (ok(s, s1)) {
                pw.println("YES");
                pw.println(s1);
                continue;
            }
            if (ok(s, s2)) {
                pw.println("YES");
                pw.println(s2);
                continue;
            }
            pw.println("NO");
        }
        
        pw.close();
    }

    static boolean ok(String s1, String s2) {
        char[] s = s2.toCharArray();
        char[] t = s1.toCharArray();
        for (int i = 0; i < s.length; i++) {
            boolean good = false;
            for (int j = 0; j < t.length; j++) {
               if ((i + j) >= s.length) {
                   good = true;
                   break;
               }
               if (s[i + j] != t[j]) {
                   good = true;
                   break;
               }
            }
       //     debug(i, s2, good);
            if (!good) return false;
        }
        return true;
    }
    
    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
