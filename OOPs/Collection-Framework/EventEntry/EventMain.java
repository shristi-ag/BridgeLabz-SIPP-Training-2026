package EventEntry;

public class EventMain {

    public static void main(String[] args) {

        EventManager e = new EventManager();

        e.register("a@gmail.com");
        e.register("b@gmail.com");
        e.register("a@gmail.com");

        e.display();
    }
}