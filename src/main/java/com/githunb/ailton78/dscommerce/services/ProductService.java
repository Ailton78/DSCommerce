package com.githunb.ailton78.dscommerce.services;

import com.githunb.ailton78.dscommerce.dto.ProductDTO;
import com.githunb.ailton78.dscommerce.entities.Product;
import com.githunb.ailton78.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
      //Optional<Product> result = repository.findById(id);
        Product product = repository.findById(id).get();
      //  Product product = result.get();
       // ProductDTO dto = new ProductDTO(product);
    return new ProductDTO(product);
    }
}
