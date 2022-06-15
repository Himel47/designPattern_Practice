package Template_Pattern;

public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("Cricket Initialized! Start Playing.");
    }

    @Override
    void start() {
        System.out.println("Game Started. Welcome to the Game.");
    }

    @Override
    void stop() {
        System.out.println("Game Finished!");
    }
}
