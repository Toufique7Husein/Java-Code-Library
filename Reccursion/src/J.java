//created by Toufique on 02/07/2023

import java.io.*;
import java.util.*;

public class J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();

        int[] a = new int[n + 1];
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer>[] ls = new ArrayList[n + 5];
        for (int i = 0; i <= n + 4; i++) ls[i] = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int key = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
            int x = a[i];
            if (set.contains(x)) ls[map.get(x)].add(i);
            else {
                map.put(x, key);
                ls[key].add(i);
                key++;
                set.add(x);
            }
        }


        SegmentTreeRecursive t = new SegmentTreeRecursive(n, a);
        t.build(1, 1, n);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            String Q = in.next();
            if (Q.equals("Q")) {
                int l = in.nextInt(), r = in.nextInt();
                int A = t.query(l, r);
                ArrayList<Integer> lss = ls[map.get(A)];
                int h = high(lss, r);
                t.update(h, h, -190);
                int B = t.query(l, r);
                debug(B);
                debug(high(lss, B), B);
           //     t.update(h, h, A);
                pw.println(A + B);
            } else {
                int ii = in.nextInt();
                int x =in.nextInt();
                if (!set.contains(x)) {
                    map.put(x, key);
                    ls[key].add(ii);
                    key++;
                }
                t.update(ii,ii, x);
            }
        }

        pw.close();
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
                lazy[n] = 0;
            }
            if (qhi <= mid)
                return query(n << 1, lo, mid, qlo, qhi);
            else if (qlo > mid)
                return query(n << 1 | 1, mid + 1, hi, qlo, qhi);
            else
                return Math.max(query(n << 1, lo, mid, qlo, mid) ,query(n << 1 | 1, mid + 1, hi, mid + 1, qhi));
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
