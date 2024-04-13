package app;

import java.util.ArrayList;
import java.util.List;

public class Experiment implements Observed {
    Material material = new Material();
    List<Observer> subscribers = new ArrayList<>();

    public void changeTemperature(int temperature) {
        int presentMaterialTemperature = (material.getTemperature() < 0) ? 0 : material.getTemperature();
        ;
        if (temperature < 0) {
            material.setTemperature(temperature);
            material.setWeight(1);
            material.setСolor(Color.WHITE.name);
        } else if (temperature >= 0 && temperature <= 20) {
            material.setTemperature(temperature);
            int newWeight = (temperature - presentMaterialTemperature) * 2;
            material.setWeight(material.getWeight() + newWeight);
            material.setСolor(Color.WHITE.name);
        } else if (temperature >= 21 && temperature <= 40) {
            material.setTemperature(temperature);
            int newWeight = (temperature - presentMaterialTemperature) * 2;
            material.setWeight(material.getWeight() + newWeight);
            material.setСolor(Color.BLUE.name);
        } else if (temperature >= 41 && temperature <= 60) {
            material.setTemperature(temperature);
            int newWeight = (temperature - presentMaterialTemperature) * 2;
            material.setWeight(material.getWeight() + newWeight);
            material.setСolor(Color.RED.name);
        } else if (temperature >= 61 && temperature <= 80) {
            material.setTemperature(temperature);
            int newWeight = (temperature - presentMaterialTemperature) * 2;
            material.setWeight(material.getWeight() + newWeight);
            material.setСolor(Color.GRAY.name);
        } else if (temperature >= 81) {
            material.setTemperature(temperature);
            int newWeight = (temperature - presentMaterialTemperature) * 2;
            material.setWeight(material.getWeight() + newWeight);
            material.setСolor(Color.BLACK.name);
        }
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.material);
        }
    }
}
