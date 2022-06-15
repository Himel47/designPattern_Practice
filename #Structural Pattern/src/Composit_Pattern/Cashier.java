package Composit_Pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cashier implements Employee{

    private int id;
    private String name;
    private double salary;

    public Cashier(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary =salary;
    }

    List<Employee> employees = new ArrayList<Employee>();

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get((i));
    }

    @Override
    public void print() {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("========================");

    }
}
