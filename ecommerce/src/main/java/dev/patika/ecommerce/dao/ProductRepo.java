package dev.patika.ecommerce.dao;

import dev.patika.ecommerce.entities.Category;
import dev.patika.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
