package Strategy_Pattern;

public class Addition implements Strategy{
    @Override
    public float calcualtion(float a, float b) {
        return a+b;
    }
}
