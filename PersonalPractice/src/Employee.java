
import java.io.*;
import java.util.*;

public class Employee extends Person {
    private String id;
    private String department;
    private double salary;

    public Employee(String name, String gender, int age, String id, String department, double salary) {
        super(name, gender, age);
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
