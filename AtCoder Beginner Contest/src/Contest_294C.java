//created by Toufique on 19/03/2023

import java.io.*;
import java.util.*;

public class Contest_294C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();
        ArrayList<Tri> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ls.add(new Tri(in.nextInt(), 'A'));
        }
        for (int i = 0; i < m; i++) {
            ls.add(new Tri(in.nextInt(), 'B'));
        }

        Collections.sort(ls);

        for (int i = 0; i < ls.size(); i++) {
            Tri tri = ls.get(i);
            if (tri.type == 'A') pw.print((i + 1) + " ");
        }
        pw.println();
        for (int j = 0; j < ls.size(); j++) {
            Tri tri = ls.get(j);
            if (tri.type == 'B') pw.print((j + 1) + " ");
        }
        pw.println();
        pw.close();
    }

    static class Tri implements Comparable<Tri>{
        int v;
        char type;
        Tri(int v, char type) {
            this.type = type;
            this.v = v;
        }
        @Override
        public int compareTo(Tri o) {
            return Integer.compare(this.v, o.v);
        }

        @Override
        public String toString() {
            return "[" + this.v + " " + this.type + "]";
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
