import java.io.*;
import java.util.*;

public class Hw_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner((Readable) System.out);
        int length = in.nextInt(), breath = in.nextInt();
        System.out.println("Perimeter: " + 2 * (length + breath));
        System.out.println("Area: " + 2 * (length + breath));
    }
}
