package uz.shop.internet_shop.order;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private Integer quantity;
    private Long totalPrice;
    private LocalDateTime createdAt;

    public Order() {}

    public Order(String productName, Integer quantity, Long totalPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getProductName() { return productName; }
    public Integer getQuantity() { return quantity; }
    public Long getTotalPrice() { return totalPrice; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setId(Long id) { this.id = id; }
    public void setProductName(String productName) { this.productName = productName; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public void setTotalPrice(Long totalPrice) { this.totalPrice = totalPrice; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}