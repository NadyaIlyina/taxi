package by.vsu.ilina.taxi.domain;

import org.springframework.data.annotation.Id;

public class Driver {

    @Id
    private String id;
    private String name;
    private String phone;
    private String dl;

    public Driver(String id, String name, String phone, String dl) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.dl = dl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDl() {
        return dl;
    }

    public void setDl(String dl) {
        this.dl = dl;
    }
}
