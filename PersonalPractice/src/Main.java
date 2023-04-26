import java.io.*;
import java.util.*;

public class Main {
    static int indx = 0;
    public static void main(String[] args) {
        Plant[] plants = new Plant[10];

        plants[0] = new Plant("blah", "red");
        plants[1] = new Plant("rose", "red");
        plants[2] = new Plant("asas", "black");
        plants[3] = new Plant("d", "pink");
        plants[4] = new Plant("blads", "red");


        display(plants);
    }

    static void add(Plant[] plants, Plant p) {
        plants[indx++] = p;
    }

    static void remove(Plant[] plants, String n) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i].getName().equals(n)) plants[i] = null;
        }
    }

    static Plant search(Plant[] plants, String n) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i].getName().equals(n)) return plants[i];
        }
        return null;
    }
    static void display(Plant[] plants) {
        for (int i = 0; i < plants.length; i++) System.out.println(plants[i]);
    }
}
