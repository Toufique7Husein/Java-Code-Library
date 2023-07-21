//created by Toufique on 14/06/2023

import java.io.*;
import java.util.*;

public class Main {
    static long mod = (long)1e9 + 7;
    public static void main(String[] args) {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        long[][] a = new long[n][2];
        for (int i = 0; i < n; i++) {
            long x = in.nextLong(), k = in.nextLong();
            a[i][0] = x;
            a[i][1] = k;
        }
        pw.println(nod(a, n) + " " + sod(a, n) + " " + pod(a, n));

        pw.close();
    }

    static long nod(long[][] a, int n) {
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans = ((ans % mod) * ((a[i][1] + 1) % mod)) % mod;
        }
        return ans;
    }
    static long sod(long[][] a, int n) {
        long ans = 1;

        //s = (p ^ a + 1 + 1) / (p - 1)
        for (int i = 0; i < n; i++) {
            long neu = (bigMod(a[i][0], a[i][1] + 1, mod) - 1 + mod) % mod;
            long den = (bigMod(a[i][0] - 1, mod - 2, mod)) % mod;
            long s = (neu * den) % mod;

            ans = (ans * s) % mod;
        }
        return ans;
    }
    static long pod(long[][] a, int n) {
        long ans = 1;

        boolean odd = false;
        int posOd;
        for (int i = 0; i < n; i++) {
            if (a[i][1] % 2 == 0) {
                odd = true;
                posOd = i;
            }
            if (odd) {
                
            }
        }



        return ans;
    }

    static long bigMod(long base, long pow, long mod) {
        if (pow == 0) return 1 % mod;
        long x = bigMod(base, pow / 2, mod);
        x = (x * x) % mod;
        if (pow % 2 == 1) x = (x * base) % mod;
        return x;
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
