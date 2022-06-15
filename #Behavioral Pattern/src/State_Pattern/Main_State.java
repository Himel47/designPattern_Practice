package State_Pattern;

public class Main_State {

    public static void main(String[] args) {
        Context context = new Context();

        InitialState start = new InitialState();
        start.deAction(context);

        System.out.println(context.getState().toString());

        FinalState stop = new FinalState();
        stop.deAction(context);

        System.out.println(context.getState().toString());
    }
}
