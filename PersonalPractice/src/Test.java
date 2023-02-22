//created by Toufique on 21/02/2023

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);


        HashMap<Employee, Integer> map = new HashMap<>();
        map.put(new Employee("2", "3"), 12);
        debug(map.get(new Employee("2", "3")));

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
