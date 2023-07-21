//created by Toufique on 28/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round875C {
    public static void main(String[] args) {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (; t > 0; t--) {
            int n = in.nextInt();
            ArrayList<Pair>[] adj = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            boolean visi[] = new boolean[n];
            int temp[] = new int[n];
            for (int i = 0; i < n - 1; i++) {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                adj[x].add(new Pair(y, i));
                adj[y].add(new Pair(x, i));

            }
            int max = 1;
            ArrayDeque<Pair> dq = new ArrayDeque<>();
            dq.add(new Pair(0, 1));
            while (!dq.isEmpty()) {
                Pair p = dq.poll();
                int u = p.vertex;
                int currRank = p.rank;
                for (Pair pp : adj[u]) {
                    int v = pp.vertex;
                    int vRank = pp.rank;
                    int newRank = currRank;
                    if (!visi[v]) {
                        if (vRank < temp[u]) newRank++;
                        temp[v] = vRank;
                        visi[v] = true;
                        dq.add(new Pair(v, newRank));
                        max = Math.max(max, newRank);
                    }
                }
            }
            pw.println(max);
        }
        pw.close();
    }

    static class Pair {
        int vertex;
        int rank;

        public Pair(int a, int b) {
            vertex = a;
            rank = b;
        }
    }

    public static class FastReader {
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
