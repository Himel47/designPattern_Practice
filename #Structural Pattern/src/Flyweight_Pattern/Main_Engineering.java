package Flyweight_Pattern;

import java.util.Random;

public class Main_Engineering {

    private static String employeeType[]= {"Developer","Tester"};
    private static String skills[]= {"Java", "C#", ".Net", "Python"};

    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            Employee employee = EmployeeFactory.getEmployee(getRandEmployee());

            employee.assignSkill(getRandSkill());

            employee.task();
        }
    }

    private static String getRandSkill() {

        Random random = new Random();
        int randInteger = random.nextInt(employeeType.length);

        return employeeType[randInteger];
    }

    private static String getRandEmployee() {

        Random random = new Random();
        int randInteger = random.nextInt(skills.length);

        return skills[randInteger];
    }
}
