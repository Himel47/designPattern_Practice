package Composit_Pattern;

public class Main_CompositePattern {
    public static void main(String[] args) {
        Employee emp1 = new Cashier(101,"Himel",20000.0);
        Employee emp2 = new Cashier(102,"Sayem", 25000.0);
        Employee emp3 = new Accountant(301,"Ibrahim",28000.0);
        Employee manager1= new BankManager(201,"Rafi",100000.0);

        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        manager1.print();
    }
}
