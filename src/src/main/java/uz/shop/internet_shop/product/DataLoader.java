package uz.shop.internet_shop.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductRepository repository;

    public DataLoader(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        if (repository.count() == 0) {
            repository.save(new Product("Futbol to'pi", "Adidas", "futbol", 85000L, "⚽"));
            repository.save(new Product("Futbol botinikasi", "Nike", "futbol", 320000L, "👟"));
            repository.save(new Product("Futbol formasi", "Puma", "futbol", 150000L, "👕"));
            repository.save(new Product("Basketbol to'pi", "Spalding", "basketbol", 120000L, "🏀"));
            repository.save(new Product("Basketbol krossovkasi", "Jordan", "basketbol", 450000L, "👟"));
            repository.save(new Product("Tennis raketi", "Wilson", "tennis", 280000L, "🎾"));
            repository.save(new Product("Tennis to'pi (3ta)", "Head", "tennis", 35000L, "🎾"));
            repository.save(new Product("Ganteli 2kg", "TB Sport", "fitnes", 65000L, "🏋"));
            repository.save(new Product("Yoga matasi", "TB Sport", "fitnes", 95000L, "🧘"));
            repository.save(new Product("Yugurish poyabzali", "Asics", "yugurish", 380000L, "👟"));
            repository.save(new Product("Sport shimcha", "Nike", "yugurish", 110000L, "🩳"));
            repository.save(new Product("Suv idishi", "TB Sport", "fitnes", 45000L, "🧴"));
        }
    }
}