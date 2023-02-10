//created by Toufique on 11/02/2023

import java.io.*;
import java.util.*;

public class LeetCode_14 {
    public String longestCommonPrefix(String[] strs) {
        int len = Integer.MAX_VALUE;
        String ans = "";
        for (int i = 0; i < strs.length; i++) {
            len = Math.min(len, strs[i].length());
        }
        outer:
        for (int i = 0; i < len; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) break outer;
            }
            ans = ans + c;
        }
        return ans;
    }
}
