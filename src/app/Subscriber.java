package app;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(Material material) {
        System.out.println("Dear " + name + "\n" + material + "\n*****************\n");
    }
}
