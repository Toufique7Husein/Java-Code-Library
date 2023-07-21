//created by Toufique on 25/05/2023

import java.io.*;
import java.util.*;

public class BigMod {
    long bigMod(long base, long exp, long mod) { // O(log(exp))
        if(exp == 0) return 1 % mod;
        if(exp % 2 == 1) {
            return base * bigMod(base, exp - 1, mod) % mod;
        } else {
            long half = bigMod(base, exp / 2, mod);
            return half * half % mod;
        }
    }
    
}
