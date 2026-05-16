package uz.shop.internet_shop.product;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String brand;
    private String category;
    private Long price;
    private String icon;

    public Product() {}

    public Product(String name, String brand, String category, Long price, String icon) {
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.icon = icon;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getBrand() { return brand; }
    public String getCategory() { return category; }
    public Long getPrice() { return price; }
    public String getIcon() { return icon; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setCategory(String category) { this.category = category; }
    public void setPrice(Long price) { this.price = price; }
    public void setIcon(String icon) { this.icon = icon; }
}