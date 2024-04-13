package app;

public class Main {
    public static void main(String[] args) {
        Experiment experiment = new Experiment();

        Observer subscriber1 = new Subscriber("subscriber1");
        Observer subscriber2 = new Subscriber("subscriber2");

        experiment.addObserver(subscriber1);
        experiment.addObserver(subscriber2);

        experiment.changeTemperature(10);
        experiment.changeTemperature(0);
        experiment.changeTemperature(35);
        experiment.changeTemperature(50);
        experiment.changeTemperature(79);
        experiment.changeTemperature(-30);
        experiment.changeTemperature(85);
        experiment.changeTemperature(100);
        experiment.changeTemperature(-15);
        experiment.changeTemperature(200);
        experiment.changeTemperature(0);
    }
}
