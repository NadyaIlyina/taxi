package by.vsu.ilina.taxi.domain;

import org.springframework.data.annotation.Id;

public class Route {

    @Id
    private String id;
    private String from;
    private String to;
    private int length;

    public Route(String id, String from, String to, int length) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
