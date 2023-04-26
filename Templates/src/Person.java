//created by Toufique on 29/03/2023

import java.io.*;
import java.util.*;

public class Person {
    private String name;
    private String id;
    private int age;

    public Person(){}
    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void walk() {
        System.out.println("running slow");
    }
    public void walk(int cal) {
        System.out.println("running fast");
    }
    public int Salary() {
        return 12;
    }
    public int Salary(int bonus) {
        return bonus + 12;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }
}
