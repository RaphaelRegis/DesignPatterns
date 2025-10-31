import observers.Observer;
import observers.Subscriber;
import subjects.Channel;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();

        Observer user1 = new Subscriber("Pedro");
        Observer user2 = new Subscriber("Roberto");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.notifySubscribers("Novo vídeo publicado!");
    }
}