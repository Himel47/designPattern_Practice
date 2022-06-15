package Decorator_Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_DecoratorPattern {
    private static int choice;

    public static void main(String[] args) throws IOException,NumberFormatException {
        do{
            System.out.println("=======Food Menu=======");
            System.out.println("    1. Veg Food.\n");
            System.out.println("    2. Non-Veg Food.\n");
            System.out.println("    3. Chinese Food.\n");
            System.out.println("    4. Exit.\n");
            System.out.println("Enter Your Choice: ");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(bufferedReader.readLine());

            switch (choice){
                case 1:{
                    vegFood vf = new vegFood();
                    System.out.println(vf.prepareFood());
                    System.out.println(vf.foodPrice());
                }
                break;

                case 2:{
                    Food f1 = new NonVegFood((Food) new vegFood());
                    System.out.println(f1.prepareFood());
                    System.out.println(f1.foodPrice());
                }
                break;

                case 3:{
                    Food f2 = new ChineseFood((Food) new vegFood());
                    System.out.println(f2.prepareFood());
                    System.out.println(f2.foodPrice());
                }
                break;

                default:{
                    System.out.println("No food Available except these.");
                }
                return;
            }
        }while (choice!=4);
    }
}
