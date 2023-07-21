//created by Toufique on 18/06/2023

import java.io.*;
import java.util.*;

public class Students {

    public void info(String[] name, int[] id, double[] cgpa) {
        double sum = 0, avg =0;
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + " " + id[i] + " " + cgpa[i]);
            sum += cgpa[i];
        }
        avg = sum / name.length;
        System.out.println("Sum: "  + sum);
        System.out.println("Avg: " + avg);
    }

    public void info(String[] name, double[] marks) {
        double mark = 0.0;
        String nam = "";
        for (int i = 0; i < name.length; i++) {
            if (mark <= marks[i]) {
                nam = name[i];
                mark = marks[i];
            }
        }
        System.out.println("Highest Scorer: " + nam);
    }
}
