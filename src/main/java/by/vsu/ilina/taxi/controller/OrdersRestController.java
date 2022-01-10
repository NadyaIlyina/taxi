package by.vsu.ilina.taxi.controller;

import by.vsu.ilina.taxi.domain.Order;
import by.vsu.ilina.taxi.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersRestController {

    @Autowired
    private OrdersRepository ordersRepository;

    @GetMapping
    public List<Order> findAllOrders() {
        return ordersRepository.findAll();
    }

}
