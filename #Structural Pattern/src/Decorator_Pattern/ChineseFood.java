package Decorator_Pattern;

public class ChineseFood extends FoodDecorator{
    public ChineseFood(Food newFood){
        super(newFood);
    }
    public String prepareFood() {
        return super.prepareFood()+" wtih Fried Rice";
    }

    public double foodPrice() {
        return super.foodPrice()+65.0;
    }
}
