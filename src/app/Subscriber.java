package app;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(Material material) {
        System.out.println("Dear " + name + "\n" + material + "\n*****************\n");
    }
}
