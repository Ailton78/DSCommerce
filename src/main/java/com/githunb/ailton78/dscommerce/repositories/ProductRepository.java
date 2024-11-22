package com.githunb.ailton78.dscommerce.repositories;

import com.githunb.ailton78.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
