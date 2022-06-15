package Observer_Pattern;

public class Youtube {

    public static void main(String[] args) {
        Channel gaming_SK = new Channel();

        Subscriber s1 = new Subscriber("Himel");
        Subscriber s2 = new Subscriber("Sayem");
        Subscriber s3 = new Subscriber("Ibrahim");

        gaming_SK.Subscribe(s1);
        gaming_SK.Subscribe(s2);
        gaming_SK.Subscribe(s3);

        gaming_SK.unSubscribe(s3);

        s1.subscribeChannel(gaming_SK);
        s2.subscribeChannel(gaming_SK);
        s3.subscribeChannel(gaming_SK);

        gaming_SK.upload("COD MW2");

    }
}
