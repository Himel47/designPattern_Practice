package Template_Pattern;

public abstract class Game {
    abstract void initialize();
    abstract void start();
    abstract void stop();

    public final void play(){
        initialize();

        start();

        stop();
    }
}
