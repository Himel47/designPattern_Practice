package Strategy_Pattern;

public class Subtraction implements Strategy{
    @Override
    public float calcualtion(float a, float b) {
        return a-b;
    }
}
