package by.vsu.ilina.taxi.domain;

import org.springframework.data.annotation.Id;

public class Auto {

    @Id
    private String id;
    private int number;
    private String color;
    private String model;
    private String type;

    public Auto(String id, int number, String color, String model, String type) {
        this.id = id;
        this.number = number;
        this.color = color;
        this.model = model;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
