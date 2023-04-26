//created by Toufique on 20/04/2023

import java.io.*;
import java.util.*;

public class Flowers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] h = new int[n], a = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        pw.println(solve(h, a, n));
        pw.close();
    }

    static long solve(int[] h, int[] a, int n) {
        SegmentTree segmentTree = new SegmentTree(n);
        for(int i = 0; i < n ; i++){
            long l = segmentTree.rangeQuery(0, h[i]-2);
            segmentTree.update(h[i] - 1,l + a[i]);
        }
        return segmentTree.rangeQuery(0, n - 1);
    }

    private static class SegmentTree {

        private long[] sgTree;

        private int size;

        public SegmentTree(int n) {
            this.size = n;
            sgTree = new long[n * 4];
        }


        private void update(int index, long value) {
            pointUpdate(index, 0, size - 1, 0, value);
        }

        private long pointUpdate(int index, int start, int end, int node, long value) {
            if (index < start || index > end) {
                if (start >= 0 && end < size) {
                    return sgTree[node];
                }
                return 0;
            }
            if (start == index && end == index) {
                return sgTree[node] = value;
            }
            int mid = (start + end) / 2;
            long left = pointUpdate(index, start, mid, 2 * node + 1, value);
            long right = pointUpdate(index, mid + 1, end, 2 * node + 2, value);
            return sgTree[node] = combine(left, right);
        }

        private long rangeQuery(int left, int right) {
            return rangeQuery(left, right, 0, size - 1, 0);
        }

        private long rangeQuery(int left, int right, int start, int end, int node) {
            if (right < start || left > end) {
                return 0;
            }
            if (start >= left && end <= right) {
                return sgTree[node];
            }
            int mid = (start + end) / 2;
            long ls = rangeQuery(left, right, start, mid, 2 * node + 1);
            long rs = rangeQuery(left, right, mid + 1, end, 2 * node + 2);
            return combine(ls, rs);
        }

        private long combine(long left, long right) {
            return Math.max(left, right);
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
