//created by Toufique on 11/04/2023

import java.io.*;
import java.util.*;

public class Flowers extends Plant{
    private boolean hasSmall;
    private boolean hasThron;

    public Flowers(String name, String color, boolean hasSmall, boolean hasThron) {
        super(name, color);
        this.hasSmall = hasSmall;
        this.hasThron = hasThron;
    }

    public boolean isHasSmall() {
        return hasSmall;
    }

    public void setHasSmall(boolean hasSmall) {
        this.hasSmall = hasSmall;
    }

    public boolean isHasThron() {
        return hasThron;
    }

    public void setHasThron(boolean hasThron) {
        this.hasThron = hasThron;
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "hasSmall=" + hasSmall +
                ", hasThron=" + hasThron +
                "} " + super.toString();
    }
}
