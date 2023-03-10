//created by Toufique on 10/03/2023

import java.io.*;
import java.util.*;

public class LeetCode_67 {
    public int[] plusOne(int[] digits) {
        boolean checkAll9 = true;
        for(int i: digits) {
            if(i != 9) {
                checkAll9 = false;
                break;
            }
        }
        if(checkAll9) return forIncreasedDigits(digits);
        int carry = 0;
        int v = digits[digits.length - 1] + 1;
        if(v == 10) {
            digits[digits.length - 1] = 0;
            carry = 1;
        } else digits[digits.length - 1] = v;
        for(int i = digits.length - 2; i >= 0; i--) {
            if(carry == 0) break;
            int vv = carry + digits[i];
            if(vv == 10) {
                digits[i] = 0;
            } else {
                digits[i] = vv;
                break;
            }
        }
        return digits;
    }
    public int[] forIncreasedDigits(int[] digits) {
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        for(int i = 1; i < ans.length; i++) {
            ans[i] = 0;
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
