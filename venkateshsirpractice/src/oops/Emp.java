package oops;

import java.util.ArrayList;  // ✅ import required

class Employee {
    int empNo;
    String name;
    float salary;

    Employee(int empNo, String name, float salary) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return empNo + " " + name + " " + salary;
    }
}

public class Emp {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "aaa", 5000.00f);
        Employee e2 = new Employee(102, "bbb", 5000.00f);
        Employee e3 = new Employee(103, "ccc", 56000.00f);

        ArrayList<Employee> a1 = new ArrayList<>();
        a1.add(e1);
        a1.add(e2);
        a1.add(e3);

        System.out.println(a1);
    }
}