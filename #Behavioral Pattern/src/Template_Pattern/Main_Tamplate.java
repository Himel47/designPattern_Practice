package Template_Pattern;

public class Main_Tamplate {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Game game = new Cricket();
        game.play();
        System.out.println();

        Class c = Class.forName(args[0]);
        Game game = (Game) c.newInstance();
        game.play();
    }
}
