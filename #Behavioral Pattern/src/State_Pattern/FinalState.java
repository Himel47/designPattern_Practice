package State_Pattern;

public class FinalState implements State{
    @Override
    public void deAction(Context context) {
        System.out.println("Player in Final State");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
