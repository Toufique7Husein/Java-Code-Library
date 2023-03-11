//created by Toufique on 12/03/2023

import java.io.*;
import java.util.*;

public class LeetCode_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Solution solution = new Solution();
        pw.println(solution.romanToInt("LVIII"));
        pw.close();
    }

    static class Solution {
        public int romanToInt(String s) {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int[] num = new int[s.length()];
            char[] ss = s.toCharArray();

            for(int i = 0; i < ss.length - 1; i++) {
                int curr = map.get(ss[i]), prev = map.get(ss[i + 1]);
                if(curr < prev) {
                    num[i] = (-1) * curr;
                } else num[i] = curr;
            }
            num[ss.length - 1] = map.get(ss[ss.length - 1]);
            int ans = 0;
            for(int i: num) ans += i;
            return ans;
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
