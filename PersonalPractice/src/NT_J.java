//created by Toufique on 17/06/2023

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class NT_J {
    public static void main(String[] args) {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        BigInteger s = new BigInteger("999970");
        debug(s.nextProbablePrime());


        Prime p = new Prime(1000);
        p.sieve();
        int n = in.nextInt();
        int[] a = new int[n];
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            p.pf(a[i]);
        }

        int cnt = -1;
        int v = 0;
        for (int i = 2; i <= (int)1e6; i++) {
            if (p.cnt[i] > cnt) {
                v = i;
                cnt = p.cnt[i];
            }
        }
        if (cnt == n) {
            pw.println(0);
            pw.println(v + " " + 3);
            pw.close();
            return;
        }
        for (int i = 0; i < n; i++) if (a[i] % v == 0) vis[i] = true;
       // debug(vis[25]);
        int[] second = new int[(int)1e6 + 1];
        for (int i = 0; i < n; i++) {
            if (vis[i]) continue;
            for (int j: p.pf[a[i]]) second[j]++;
        }
        int cnt1 = -1;
        int v2 = 0;
        for (int i = 2; i <= (int)1e6; i++) {
            if (second[i] > cnt1) {
                v2 = i;
                cnt1 = second[i];
            }
        }
        int ans = n - cnt - second[v2];
        pw.println(ans);
        pw.println(v + " " + v2);
        pw.close();
    }

    static class Prime {
        int N;
        HashSet<Integer>[] pf;
        ArrayList<Integer> prime;
        boolean[] isPrime;
        int[] cnt = new int[(int)1e6 + 1];

        Prime(int N) {
            this.N = N;
            isPrime = new boolean[N + 1];
            prime = new ArrayList<>();
            pf = new HashSet[(int)(1e6) + 1];
            for (int i = 1; i <= (int)1e6; i++) pf[i] = new HashSet<>();
        }

        void sieve() {
            Arrays.fill(isPrime, true);
            isPrime[0] = isPrime[1] = false;

            for (int i = 2; i * i <= N; i++) {
                if (!isPrime[i]) continue;
                for (int j = i * i; j <= N; j += i) isPrime[j] = false;
            }

            for (int i = 0; i <= N; i++) if (isPrime[i]) prime.add(i);
        }

        void pf(int n) {
            int x = n;
            for (int i = 0; i < prime.size(); i++) {
                int p = prime.get(i);
                if (p * p > n) break;
                if (n % p == 0) {
                    pf[x].add(p);
                    while (n % p == 0) n /= p;
                }
            }
            if (n > 1) pf[x].add(n);
            for (int i: pf[x]) cnt[i]++;
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
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
}
