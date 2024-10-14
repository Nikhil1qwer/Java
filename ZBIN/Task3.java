package ZBIN;

import java.util.*;

class DOB {
    private int day, mnth, year;
    DOB(int day, int mnth, int year) {
        this.day = day;
        this.mnth = mnth;
        this.year = year;
    }

    DOB() {
        this(0,0,0);
    }

    @Override
    public String toString() {
        return Integer.toString(day) + "-" + Integer.toString(mnth) + "-" + Integer.toString(year);
    }

    public String reverseDOB() {
        return Integer.toString(year) + "-" + Integer.toString(mnth) + "-" + Integer.toString(day);
    }
}

class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;
    private DOB dob;

    Employee(String name, Double salary, DOB dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return name + " " + salary + " " + dob.toString();
    }


    @Override
    public int compareTo(Employee that) {
        if(this.dob.equals(that.dob)) {
            return this.name.compareTo(that.name);
        }
        return this.dob.reverseDOB().compareTo(that.dob.reverseDOB());
    }

}

public class Task3 {
    public static void main(String[] args) {
        try {
            start();
        } catch(Exception e) {
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void start() throws Exception {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Nikhil", 100000.0, new DOB(4, 10, 2005));
        employees[1] = new Employee("Hemanth", 100000.0, new DOB(12, 10, 2006));
        employees[2] = new Employee(null, null, new DOB());
        Arrays.sort(employees);

        for(Employee e: employees) {
            System.out.println(e.toString());
        }

    }
}
