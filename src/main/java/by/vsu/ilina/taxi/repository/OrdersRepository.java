package by.vsu.ilina.taxi.repository;

import by.vsu.ilina.taxi.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "orders", path = "orders")
public interface OrdersRepository extends MongoRepository<Order,String> {

    List<Order> findAllByClient();
    List<Order> findAllByDriver();
    List<Order> findAll();

}
