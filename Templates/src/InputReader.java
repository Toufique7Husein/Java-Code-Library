//created by Toufique on 04/02/2023

import java.io.*;
import java.util.*;

public class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    //InputReader in = new InputReader(new FileReader("File_Name"));
    public InputReader(FileReader file) {
        reader = new BufferedReader(file);
        tokenizer = null;
    }

    public String next() {

        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
            return null;
        }

        return tokenizer.nextToken();
    }

    public String nextLine() {
        String line = null;
        try {
            tokenizer = null;
            line = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public boolean hasNext() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(reader.readLine());
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
