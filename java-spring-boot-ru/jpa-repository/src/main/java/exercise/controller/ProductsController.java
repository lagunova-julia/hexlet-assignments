package exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.domain.Sort;

import java.util.List;

import exercise.model.Product;
import exercise.repository.ProductRepository;
import exercise.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductRepository productRepository;

    // BEGIN
    @GetMapping(path = "")
    public List<Product> index(@RequestParam(required = false) Double min,
                               @RequestParam(required = false) Double max) {
        if (min != null && max != null) {
            return productRepository.findByPriceBetween(min, max,
                    Sort.by(Sort.Order.asc("price")));
        } else if (max != null) {
            return productRepository.findByPriceLessThan(max, Sort.by(Sort.Order.asc("price")));
        } else if (min != null) {
            return productRepository.findByPriceGreaterThan(min, Sort.by(Sort.Order.asc("price")));
        } else {
            return productRepository.findAll(Sort.by(Sort.Order.asc("price")));
        }
    }
    // END

    @GetMapping(path = "/{id}")
    public Product show(@PathVariable long id) {

        var product =  productRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Product with id " + id + " not found"));

        return product;
    }
}
