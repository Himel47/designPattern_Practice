package Template_Pattern;

public class Main_Tamplate {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class c = Class.forName(args[0]);
        Game game = (Game) c.newInstance();
        game.play();
    }
}
