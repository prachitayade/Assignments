package Core_Java.Generics;

        // 1.   Use Hashset to Hold Employee Objects

import java.util.HashSet;
import java.util.Set;

public class Employee1 {

    //Assume it has 3 variable name(String),salary(double) and id(int)
    int id;
    String name;
    double salary;
    String department;

    //The constructor, getter-setters are there

    public Employee1(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Employee1(String string, double d, int i) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Following is my equals and hashCode implementation
    public boolean equals(Employee1 e) {
        return name.equals(e.name);
    }

    public int hashCode() {
        return id;
    }


    public static void main(String[] args) {
        Employee1 e1  = new Employee1("Abc", 2.0, 1);
        Employee1 e2  = new Employee1("abc", 3.0, 4);
        Employee1 e3  = new Employee1("XYZ", 4.0, 3);
        Employee1 e4  = new Employee1("Mno", 5.0, 2);
        Employee1 e5  = new Employee1("Abc", 77.0, 1);

        Set<Employee1> sEmp = new HashSet<Employee1>();
        sEmp.add(e1);
        sEmp.add(e2);
        sEmp.add(e3);
        sEmp.add(e4);
        sEmp.add(e5);

        for(Employee1 e : sEmp){
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        }
    }

}
