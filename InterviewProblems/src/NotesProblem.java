//created by Toufique on 04/02/2023

import java.io.*;
import java.util.*;

public class NotesProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        solve();
        pw.close();
    }

    static void solve() {
        int[] notes = {1000, 500, 100, 50, 10, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();
        int amount = 245;
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                int cnt = amount / notes[i];
                map.put(notes[i], cnt);
                amount %= notes[i];
            }
        }
        for (int i = 0; i < notes.length; i++) {
            if (map.containsKey(notes[i])) System.out.println(notes[i] + " " + map.get(notes[i]));
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
