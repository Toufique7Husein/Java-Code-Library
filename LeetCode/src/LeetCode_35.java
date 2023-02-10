//created by Toufique on 11/02/2023

import java.io.*;
import java.util.*;

public class LeetCode_35 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int l = 0, r = nums.length - 1;
            int pos = -1;
            while(l <= r) {
                int mid = l + (r - l) / 2;
                int v = nums[mid];
                if(v <= target) {
                    pos = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            if(pos == -1) return 0;
            if(nums[pos] != target) pos++;
            return pos;
        }
    }
}
