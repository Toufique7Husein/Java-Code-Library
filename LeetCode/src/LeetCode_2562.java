//created by Toufique on 18/02/2023

import java.io.*;
import java.util.*;

public class LeetCode_2562 {
    class Solution {
        public long findTheArrayConcVal(int[] nums) {
            long ans = 0;
            int l = 0, r = nums.length - 1;
            while(l <= r) {
                if(l == r) {
                    ans += nums[l];
                    break;
                }
                String str = nums[l] + "" + nums[r];
                ans += Long.parseLong(str);
                l++;
                r--;
            }
            return ans;
        }
    }
}
