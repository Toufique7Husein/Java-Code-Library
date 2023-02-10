//created by Toufique on 11/02/2023

import java.io.*;
import java.util.*;

public class LeetCode_136 {
    public int singleNumber(int[] nums) {
        int v = nums[0];
        for(int i = 1; i < nums.length; i++) {
            v ^= nums[i];
        }
        return v;
    }
}
