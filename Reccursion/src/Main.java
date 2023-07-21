//created by Toufique on 02/02/2023

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = in.nextInt(), m = in.nextInt(), q = in.nextInt();
        for (int i = 0; i <= n; i++) map.put(i, n + 5);
        for (int i = 0; i < m; i++) {
            int l = in.nextInt(), r = in.nextInt();
            map.put(r, Math.min(l, map.get(r)));
          //  debug(r);
        }

        ArrayList<Integer> r = new ArrayList<>();
        for (Map.Entry<Integer, Integer> mm : map.entrySet()) if (mm.getValue() <= (n + 5)) r.add(mm.getKey());
        Collections.sort(r);

        int[] ans = new int[n + 1];
        for (int i = r.size() - 1; i >= 0; i--) {
            int curr = r.get(i);
            int v = map.get(curr);
            for (int j = v; j <= curr; j++) {
                if (ans[j] > 0) break;
                ans[j] = curr;
            }
        }
        for (int i = 0; i < q; i++) {
            int l = in.nextInt(), rr = in.nextInt();
            if (ans[l] >= rr) {
                pw.println("Yes");
            } else pw.println("No");
        }

        pw.close();
    }


    static class FastReader {
        InputStream is;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0, ptrbuf = 0;

        public FastReader(InputStream is) {
            this.is = is;
        }

        public int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = is.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public int skip() {
            int b;
            while ((b = readByte()) != -1 && isSpaceChar(b)) ;
            return b;
        }

        public String next() {
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while (!(isSpaceChar(b))) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }


        public String nextLine() {
            int c = skip();
            StringBuilder sb = new StringBuilder();
            while (!isEndOfLine(c)) {
                sb.appendCodePoint(c);
                c = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public char[] next(int n) {
            char[] buf = new char[n];
            int b = skip(), p = 0;
            while (p < n && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = readByte();
            }
            return n == p ? buf : Arrays.copyOf(buf, p);
        }

        public char readChar() {
            return (char) skip();
        }
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
