package Factory_Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_generateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter Name of the Plan you want to generate Bill: ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String planName = bufferedReader.readLine();

        System.out.println("Enter Unit number the bill will be calculated:");
        int units = Integer.parseInt(bufferedReader.readLine());

        Plan plan = planFactory.getPlan(planName);

        System.out.println("Bill for "+planName+" of "+units+" units is: ");
        plan.getRate();
        plan.calculateBill(units);
    }
}
