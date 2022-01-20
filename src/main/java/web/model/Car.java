package web.model;

public class Car {
    private String model;
    private String color;
    private String owner;

    public Car() {
    }

    public Car(String model, String color, String owner) {
        this.model = model;
        this.color = color;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
