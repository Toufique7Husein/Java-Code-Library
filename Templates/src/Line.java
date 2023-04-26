//created by Toufique on 28/03/2023

import java.io.*;
import java.util.*;

public class Line {
    private String color;

    public Line(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(Point p1, Point p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        double len = Math.sqrt(dx * dx + dy * dy);
        return len;
    }

    @Override
    public String toString() {
        return "Line{" +
                "color='" + color + '\'' +
                '}';
    }
}
