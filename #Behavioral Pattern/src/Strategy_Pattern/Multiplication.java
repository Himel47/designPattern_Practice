package Strategy_Pattern;

public class Multiplication implements Strategy{
    @Override
    public float calcualtion(float a, float b) {
        return a*b;
    }
}
