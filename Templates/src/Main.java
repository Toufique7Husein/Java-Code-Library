//created by Toufique on 28/03/2023

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line line = new Line("Black");
        line.getArea(p1, p2);
    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
