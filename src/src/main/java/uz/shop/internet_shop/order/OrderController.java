package uz.shop.internet_shop.order;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    private final OrderRepository repository;

    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Order> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Order create(@RequestBody Map<String, Object> body) {
        List<Map<String, Object>> items = (List<Map<String, Object>>) body.get("items");
        Order lastOrder = null;
        for (Map<String, Object> item : items) {
            String productName = (String) item.get("productName");
            Integer quantity = (Integer) item.get("quantity");
            Long price = Long.valueOf(item.get("price").toString());
            Order order = new Order(productName, quantity, price * quantity);
            lastOrder = repository.save(order);
        }
        return lastOrder;
    }
}
