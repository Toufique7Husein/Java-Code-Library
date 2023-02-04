//created by Toufique on 02/02/2023

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        massage();


        pw.close();
    }

    static void massage() {
        System.out.println("hiii");
        massage1();
    }
    static void massage1() {
        massage2();
        System.out.println("hiii");
    }
    static void massage2() {
        massage3();
        System.out.println("hiii");
    }
    static void massage3() {
        massage4();
        System.out.println("hiii");
    }
    static void massage4() {
        System.out.println("hiii");
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
