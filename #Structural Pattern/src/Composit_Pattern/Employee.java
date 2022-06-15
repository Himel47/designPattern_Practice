package Composit_Pattern;

public interface Employee {
    public int getID();
    public String getName();
    public double getSalary();
    public void print();
    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);

}
