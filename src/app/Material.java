package app;

public class Material {
    private String id;
    private int temperature;
    private int weight;

    private String сolor;

    public Material() {
        this.id = "#123456";
        this.temperature = 0;
        this.weight = 1;
        this.сolor = Color.WHITE.name;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setСolor(String сolor) {
        this.сolor = сolor;
    }

    public String getId() {
        return id;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getWeight() {
        return weight;
    }

    public String getСolor() {
        return сolor;
    }

    @Override
    public String toString() {
        return "material='" + id + '\'' +
                ", temperature=" + temperature +
                ", weight=" + weight +
                ", сolor='" + сolor + '\'' +
                '}';
    }
}
