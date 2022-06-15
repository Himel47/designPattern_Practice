package Strategy_Pattern;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public float executeStrategy(float num1, float num2){
        return strategy.calcualtion(num1,num2);
    }
}
