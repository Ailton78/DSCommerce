package com.githunb.ailton78.dscommerce.services;

import com.githunb.ailton78.dscommerce.dto.ProductDTO;
import com.githunb.ailton78.dscommerce.entities.Product;
import com.githunb.ailton78.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Product product = repository.findById(id).get();
    return new ProductDTO(product);
    }
    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable){
       Page<Product> result= repository.findAll(pageable);
        return result.map(x -> new ProductDTO(x));
    }


}