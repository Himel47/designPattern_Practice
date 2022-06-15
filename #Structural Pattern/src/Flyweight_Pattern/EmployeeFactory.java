package Flyweight_Pattern;

import java.util.HashMap;

public class EmployeeFactory {

    private static HashMap<String,Employee> m = new HashMap<>();

    public static Employee getEmployee(String type){
        Employee emp = null;
        if(m.get(type)!=null){
            emp = m.get(type);
        }
        else{
            switch (type) {
                case "Developer" -> {
                    System.out.println("Developer Created!");
                    emp = new Developer();
                }
                case "Tester" -> {
                    System.out.println("Tester Created!");
                    emp = new Tester();
                }
                default -> System.out.println("No Such Employee");
            }

            m.put(type,emp);
        }
        return emp;
    }
}
