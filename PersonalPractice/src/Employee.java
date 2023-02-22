//created by Toufique on 22/02/2023

import java.io.*;
import java.util.*;

public class Employee {

    Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }
    private String id;
    private String name;
   @Override
    public boolean equals(Object o){
        if(o==null)
            return false;
        if(this.getClass()!=o.getClass())
            return false;

        Employee e=(Employee)o;
        return e.id.equals(this.id) && e.name.equals(this.name);
    }

    @Override
    public int hashCode(){
        return id.hashCode() + name.hashCode();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
