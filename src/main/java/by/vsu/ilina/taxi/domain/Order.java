package by.vsu.ilina.taxi.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
@Data
public class Order {

        @Id
        private String id;
        private Driver driver;
        private Client client;
        private Auto auto;
        private Route route;
        private String review;
        private double cost;
        private OrderStatus status;
        private String date;

        public Order(String id, Driver driver, Client client, Auto auto, Route route, String review, double cost, OrderStatus status, String date) {
                this.id = id;
                this.driver = driver;
                this.client = client;
                this.auto = auto;
                this.route = route;
                this.review = review;
                this.cost = cost;
                this.status = status;
                this.date = date;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public Driver getDriver() {
                return driver;
        }

        public void setDriver(Driver driver) {
                this.driver = driver;
        }

        public Client getClient() {
                return client;
        }

        public void setClient(Client client) {
                this.client = client;
        }

        public Auto getAuto() {
                return auto;
        }

        public void setAuto(Auto auto) {
                this.auto = auto;
        }

        public Route getRoute() {
                return route;
        }

        public void setRoute(Route route) {
                this.route = route;
        }

        public String getReview() {
                return review;
        }

        public void setReview(String review) {
                this.review = review;
        }

        public double getCost() {
                return cost;
        }

        public void setCost(double cost) {
                this.cost = cost;
        }

        public OrderStatus getStatus() {
                return status;
        }

        public void setStatus(OrderStatus status) {
                this.status = status;
        }

        public String getDate() {
                return date;
        }

        public void setDate(String date) {
                this.date = date;
        }
}
