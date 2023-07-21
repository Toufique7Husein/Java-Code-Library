//created by Toufique on 24/05/2023

import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\Toufique Husein\\IdeaProjects\\Java-Code-Library\\Reccursion\\src\\myTextFile");
        File out = new File("C:\\Users\\Toufique Husein\\IdeaProjects\\Java-Code-Library\\Reccursion\\src\\Output");
        Scanner in = new Scanner(file);


        String s = "";
        int cntLine = 0;
        while (in.hasNextLine()) {
            String data = in.nextLine();
            s = s + data;
            cntLine++;
        }
        String[] ss = s.split(" ");
        System.out.println("Number Of Words in the file: " + ss.length);
        System.out.println("Number Of Line: " + cntLine);

        //Out in file
        PrintWriter pw = new PrintWriter(out);

        for (String word: ss) {
            if (word.length() >= 5) pw.println(word);
        }
        pw.close();


        in.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
