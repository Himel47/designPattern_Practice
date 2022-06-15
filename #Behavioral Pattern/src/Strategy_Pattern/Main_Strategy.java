package Strategy_Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Strategy {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 1st Value: ");
        float num1 = Float.parseFloat(bufferedReader.readLine());

        System.out.println("Enter 2nd Value: ");
        float num2 = Float.parseFloat(bufferedReader.readLine());

        Context context = new Context(new Addition());
        System.out.println("Addition: "+context.executeStrategy(num1,num2));

        context = new Context(new Subtraction());
        System.out.println("Subtraction: "+context.executeStrategy(num1,num2));

        context = new Context(new Multiplication());
        System.out.println("Multiplication: "+context.executeStrategy(num1,num2));

    }
}
