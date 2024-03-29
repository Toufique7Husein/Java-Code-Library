//created by Toufique on 21/01/2023

import java.io.*;
import java.util.*;

public class Main {
    static int a, b;
    static double dp[][];
    static int[][] vis;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();

        for (int tt = 0; tt < t; tt++) {

            int n = in.nextInt();
            vis = new int[35][35];
            dp = new double[35][35];
            for (int i = 0; i < 35; i++) {
                for (int j = 0; j < 35; j++) vis[i][j] = -1;
            }

            a = in.nextInt();
            b = in.nextInt();
            pw.println(solve(n, 0));
        }
        pw.close();
    }
    
   static double solve(int at, int sum) {
        if (at == 0) return (sum == a || sum == b) ? 1.0 : 0.0;
        double temp = dp[at][sum];
        if (vis[at][sum] != -1) return temp;
        vis[at][sum] = 1;
        temp = (1D / 2D) * solve(at - 1, sum + 1);
        temp += (1D / 2D) * solve(at - 1, sum);

        return temp;
    }




    static class Pair implements Comparable<Pair>{
        long a, cnt;
        Pair(long a, long cnt) {
            this.a = a;
            this.cnt = cnt;
        }


        @Override
        public int compareTo(Pair o) {
            return Long.compare(this.a, o.a);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "a=" + a +
                    ", cnt=" + cnt +
                    '}';
        }
    }

    static class Prime {
        ArrayList<Integer> prime;
        boolean[] isPrime;
        int N = (int)1e3;
        HashMap<Integer, Integer> map;

        Prime() {
            prime = new ArrayList<>();
            isPrime = new boolean[N + 1];
            map = new HashMap<>();

            Arrays.fill(isPrime, true);
            isPrime[0] = isPrime[1] = false;
        }

        void sieve() {
            for (int i = 2; i * i <= N; i++) {
                if (!isPrime[i])continue;
                for (int j = i * i; j <= N; j += i) isPrime[j] = false;
            }
            for (int i = 2; i <= N; i++) if (isPrime[i])prime.add(i);
        }

        void pf(int n) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < prime.size(); i++) {
                int p = prime.get(i);
                if (p * p > n) break;
                if (n % p == 0) {
                    while (n % p == 0) {
                        n /= p;
                        set.add(p);
                    }
                    map.put(p, map.getOrDefault(p, 0) + 1);
                }
            }
            if (n > 1 && !set.contains(n)) map.put(n, map.getOrDefault(n, 0) + 1);
        }

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

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
