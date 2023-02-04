//created by Toufique on 03/02/2023

import java.io.*;
import java.util.*;

public class Div4_849F {
    public static void main(String[] args) {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), q = in.nextInt();
            long[] a = new long[n], tree = new long[n + 1];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            SegmentTreeRecursive seg = new SegmentTreeRecursive(n, tree);
            for (int i = 0; i < q; i++) {
                int type = in.nextInt();
                if (type == 1) {
                    int l = in.nextInt();
                    int r = in.nextInt();
                    seg.update(l, r, 1L);
                } else {
                    int indx = in.nextInt();
                    long cnt = seg.query(indx, indx);
                    long changing = a[indx - 1];
                    for (int j = 0; j < cnt; j++) {
                        changing = getDigitSum(changing);
                    }
                    a[indx - 1] = changing;
                    seg.update(indx, indx, 0L);
                    pw.println(changing);
                }
            }
        }
        pw.close();
    }
    static long getDigitSum(long v) {
        long sum = 0;
        while (v != 0) {
            sum += (v % 10L);
            v /= 10L;
        }
        return sum;
    }

    static class SegmentTreeRecursive {
        private int size;
        private long[] seg;
        // represents the lazy propagation lazy
        private long[] lazy;
        // reprsents the initial input
        private long[] val;

        SegmentTreeRecursive(int size) {
            this(size, new long[size + 1]);
        }

        SegmentTreeRecursive(int size, long[] val) {
            this.size = size;
            this.seg = new long[size * 4];
            this.lazy = new long[size * 4];
            this.val = val;
            build(1, 1, size);
        }

        // creating the segment tree
        private void build(int n, int lo, int hi) {
            if (lo == hi) {
                seg[n] = val[lo];
                return;
            }
            int mid = (hi + lo) >> 1;
            build(n << 1, lo, mid);
            build(n << 1 | 1, mid + 1, hi);
            seg[n] = seg[n << 1] + seg[n << 1 | 1];
        }

        // range update
        public void update(int lo, int hi, long newVal) {
            update(1, 1, size, lo, hi, newVal);
        }

        private void update(int n, int lo, int hi, int qlo, int qhi, long newVal) {
            if (lo == qlo && hi == qhi) {
                seg[n] += newVal * (hi - lo + 1);
                lazy[n] += newVal;
                return;
            }
            int mid = (lo + hi) >> 1;
            if (lazy[n] > 0) {
                lazy[n << 1] += lazy[n];
                lazy[n << 1 | 1] += lazy[n];
                seg[n << 1] += lazy[n] * (mid - lo + 1);
                seg[n << 1 | 1] += lazy[n] * (hi - (mid + 1) + 1);
                lazy[n] = 0;
            }
            if (qhi <= mid)
                update(n << 1, lo, mid, qlo, qhi, newVal);
            else if (qlo > mid)
                update(n << 1 | 1, mid + 1, hi, qlo, qhi, newVal);
            else {
                update(n << 1, lo, mid, qlo, mid, newVal);
                update(n << 1 | 1, mid + 1, hi, mid + 1, qhi, newVal);
            }
            seg[n] = seg[n << 1] + seg[n << 1 | 1];
        }

        // range query
        public long query(int lo, int hi) {
            return query(1, 1, size, lo, hi);
        }

        private long query(int n, int lo, int hi, int qlo, int qhi) {
            if (lo == qlo && hi == qhi)
                return seg[n];
            int mid = (lo + hi) >> 1;
            if (lazy[n] > 0) {
                lazy[n << 1] += lazy[n];
                lazy[n << 1 | 1] += lazy[n];
                seg[n << 1] += lazy[n] * (mid - lo + 1);
                seg[n << 1 | 1] += lazy[n] * (hi - (mid + 1) + 1);
                lazy[n] = 0;
            }
            if (qhi <= mid)
                return query(n << 1, lo, mid, qlo, qhi);
            else if (qlo > mid)
                return query(n << 1 | 1, mid + 1, hi, qlo, qhi);
            else
                return query(n << 1, lo, mid, qlo, mid) + query(n << 1 | 1, mid + 1, hi, mid + 1, qhi);
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

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
