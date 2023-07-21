import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int z = in.nextInt();
        long ans = 0;
        for (int i = 1; i <= z; i++) {
            long B = i / 2;
            long L = (z - i) / 2;
            if (B == L) continue;
            ans = Math.max(ans, B * L);
        }
        System.out.println(ans);
    }
}
