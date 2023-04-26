//created by Toufique on 02/03/2023

import java.io.*;
import java.util.*;

public class Animal {

    static {
        System.out.println("Hello");
    }
    public void eat() {
        System.out.println("Animal Eating");
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
