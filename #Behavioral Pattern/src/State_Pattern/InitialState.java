package State_Pattern;

public class InitialState implements State{
    @Override
    public void deAction(Context context) {
        System.out.println("Player in Start State");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
