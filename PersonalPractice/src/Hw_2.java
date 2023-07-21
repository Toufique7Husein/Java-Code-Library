//created by Toufique on 18/06/2023

import java.io.*;
import java.util.*;

public class Hw_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next(), id = in.next();
        int section = in.nextInt();
        double cgpa = in.nextDouble();
        String gender = in.next();
        if (gender.equals("female") && name.length() == 4)System.out.println(id + " " + section);
        if (gender.equals("male") && name.charAt(0) == 'S')System.out.println(name + " " + cgpa);
        int N = in.nextInt();
        if (N >= 500)System.out.println("INVALID AMOUNT");
        if (N % 500 != 0)System.out.println("INVALID VALUE");
        if (N >= 20000) {
            System.out.println("EXCEEDED AMOUNT");
        } else {
            System.out.println("Transaction Successful");
            return;
        }
        System.out.println("ERROR Occurred");
    }
}
