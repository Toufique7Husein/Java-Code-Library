//created by Toufique on 09/02/2023

import java.io.*;
import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums) {
            if(map.containsKey(i)) {
                int cnt = map.get(i);
                cnt++;
                map.put(i, cnt);
            } else map.put(i, 1);
        }

        int fInd = -1;
        int X = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int ocr = map.get(nums[i]);
            ocr--;
            if(ocr == 0) map.remove(nums[i]);
            int need = target - nums[i];
            if(map.containsKey(need)) {
                fInd = i;
                X = need;
                break;
            } else map.put(nums[i], ocr + 1);
        }
        int[] ans = new int[2];
        ans[0] = fInd;
        for(int i = 0; i < n; i++) {
            if(fInd == i) continue;
            if(X == nums[i]) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
