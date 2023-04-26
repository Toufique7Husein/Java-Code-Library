import java.io.*;
import java.util.*;

public class Faculty extends Employee {
    private String initial;
    private String rank;

    public Faculty(String name, String gender, int age, String id, String department, double salary, String initial, String rank) {
        super(name, gender, age, id, department, salary);
        this.initial = initial;
        this.rank = rank;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "initial='" + initial + '\'' +
                ", rank='" + rank + '\'' +
                "} " + super.toString();
    }
    @Override
    public void printInf() {
        super.printInf();
        System.out.println("Initial: " + this.initial + " Rank: "+ this.rank + " Salary" + this.getSalary());
    }
}
