//created by Toufique on 24/05/2023

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(45, 5);
        Rectangle r2 = new Rectangle(100, 500);
        Rectangle r3 = new Rectangle(110, 500);
        Rectangle r4 = new Rectangle(101, 500);
        Rectangle r5 = new Rectangle(110, 500);

        ArrayList<Rectangle> rls = new ArrayList<>();
        rls.add(r1);
        rls.add(r2);
        rls.add(r3);
        rls.add(r4);
        rls.add(r5);

        Stack<Double> stack = new Stack<>();
        for (Rectangle r: rls) stack.add(r.calculateArea());

        for (double s: stack) {
            if (s > 500.0) System.out.println(s);
        }

    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
