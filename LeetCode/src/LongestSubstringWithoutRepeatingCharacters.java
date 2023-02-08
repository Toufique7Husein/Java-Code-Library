//created by Toufique on 08/02/2023

import java.io.*;
import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        char[] ss = s.toCharArray();
        int ans = 0;
        for(int i = 0; i < ss.length; i++) {
            HashSet<Character> set = new HashSet<Character>();
            //  System.out.println(ss[i]);
            for(int j = i; j < Math.min(100, ss.length); j++) {
                if(set.contains(ss[j])) {
                    ans = Math.max(ans, set.size());
                    break;
                } else set.add(ss[j]);
            }
            ans = Math.max(ans, set.size());
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
