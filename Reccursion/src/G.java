//created by Toufique on 02/07/2023

import java.io.*;
import java.util.*;

public class G {
    public static void main(String[] args) {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            pw.println("Case " + (tt+ 1) + ":");
            int n = in.nextInt(), q = in.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>(), map1 = new HashMap<>();
            ArrayList<Integer>[] ls = new ArrayList[n];
            for (int i = 0; i < n; i++) ls[i] = new ArrayList<>();
            HashSet<Integer> set = new HashSet<>();
            int key = 0;
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                int x = in.nextInt();
                a[i] = x;
                if (set.contains(x)) ls[map1.get(x)].add(i);
                else {
                    map.put(key, x);
                    map1.put(x, key);
                    set.add(x);
                    ls[key].add(i);
                    key++;
                }
            }
            SegmentTreeRecursive st = new SegmentTreeRecursive(n, a);
            st.build(1, 1, n);

            for (int i = 0; i < q; i++) {
                int l = in.nextInt(), r = in.nextInt();
                int v = st.query(l + 1, r + 1);
                ArrayList<Integer> lss = ls[map1.get(v)];
                int low = low(lss, l + 1);
                int h = high(lss, r + 1);

                int ans = h - low + 1;
                pw.println(ans);
            }


        }

        pw.close();
    }
    static int low(ArrayList<Integer> ls, int x) {
        int l = 0, r = ls.size() - 1;
        int ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int v = ls.get(mid);
            if (v >= x) {
                ans = v;
                r = mid - 1;
            } else r = l + 1;
        }
        return ans;
    }
    static int high(ArrayList<Integer> ls, int x) {
        int l = 0, r = ls.size() - 1;
        int ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int v = ls.get(mid);
            if (v <= x) {
                ans = v;
                l = mid + 1;
            } else r = mid - 1;
        }
        return ans;
    }


    static class SegmentTreeRecursive {
        private int size;
        private int[] seg;
        private int[] lazy;
        private int[] val;

        SegmentTreeRecursive(int size) {
            this(size, new int[size + 1]);
        }

        SegmentTreeRecursive(int size, int[] val) {
            this.size = size;
            this.seg = new int[size * 4];
            this.lazy = new int[size * 4];
            this.val = val;
            build(1, 1, size);
        }
        private void build(int n, int lo, int hi) {
            if (lo == hi) {
                seg[n] = val[lo];
                return;
            }
            int mid = (hi + lo) >> 1;
            build(n << 1, lo, mid);
            build(n << 1 | 1, mid + 1, hi);
            seg[n] =Math.max(seg[n << 1], seg[n << 1 | 1]);
        }
        public void update(int lo, int hi, int newVal) {
            update(1, 1, size, lo, hi, newVal);
        }

        private void update(int n, int lo, int hi, int qlo, int qhi, int newVal) {
            if (lo == qlo && hi == qhi) {
                seg[n] = Math.max(newVal * (hi - lo + 1), seg[n]);
                lazy[n] = Math.max(newVal, lazy[n]);
                return;
            }
            int mid = (lo + hi) >> 1;
            if (lazy[n] > 0) {
                lazy[n << 1] = Math.max(lazy[n], lazy[n << 1]);
                lazy[n << 1 | 1] = Math.max(lazy[n], lazy[n << 1 | 1]);
                seg[n << 1] = Math.max(lazy[n] * (mid - lo + 1), seg[n << 1]);
                seg[n << 1 | 1] = Math.max(lazy[n] * (hi - (mid + 1) + 1), seg[n << 1 | 1]);
                lazy[n] = -(int)1e6;
            }
            if (qhi <= mid)
                update(n << 1, lo, mid, qlo, qhi, newVal);
            else if (qlo > mid)
                update(n << 1 | 1, mid + 1, hi, qlo, qhi, newVal);
            else {
                update(n << 1, lo, mid, qlo, mid, newVal);
                update(n << 1 | 1, mid + 1, hi, mid + 1, qhi, newVal);
            }
            seg[n] = Math.max(seg[n << 1] , seg[n << 1 | 1]);
        }

        public int query(int lo, int hi) {
            return query(1, 1, size, lo, hi);
        }

        private int query(int n, int lo, int hi, int qlo, int qhi) {
            if (lo == qlo && hi == qhi)
                return seg[n];
            int mid = (lo + hi) >> 1;
            if (lazy[n] > 0) {
                lazy[n << 1] = Math.max(lazy[n], lazy[n << 1]);
                lazy[n << 1 | 1] = Math.max(lazy[n],  lazy[n << 1 | 1]);
                seg[n << 1] = Math.max(lazy[n] * (mid - lo + 1), seg[n << 1]);
                seg[n << 1 | 1] = Math.max(lazy[n] * (hi - (mid + 1) + 1), seg[n << 1 | 1]);
                lazy[n] = -(int)1e6;;
            }
            if (qhi <= mid)
                return query(n << 1, lo, mid, qlo, qhi);
            else if (qlo > mid)
                return query(n << 1 | 1, mid + 1, hi, qlo, qhi);
            else
                return Math.max(query(n << 1, lo, mid, qlo, mid) ,query(n << 1 | 1, mid + 1, hi, mid + 1, qhi));
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
