package exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import exercise.model.Product;

import org.springframework.data.domain.Sort;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // BEGIN
    // Find all products cheaper than the provided price and sort them
    List<Product> findByPriceLessThan(Double price, Sort sort);

    // Find all products which are more expensive than the provided price and sort them
    List<Product> findByPriceGreaterThan(Double price, Sort sort);

    // Find all products in a specific price range and sort them
    List<Product> findByPriceBetween(Double minPrice, Double maxPrice, Sort sort);

    // Find all products with a specific price and sort them
    List<Product> findByPrice(Double price, Sort sort);
    // END
}
