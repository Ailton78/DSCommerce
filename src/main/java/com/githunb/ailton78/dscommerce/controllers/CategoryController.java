package com.githunb.ailton78.dscommerce.controllers;

import com.githunb.ailton78.dscommerce.dto.CategoryDTO;
import com.githunb.ailton78.dscommerce.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<CategoryDTO>>findAll() {
        List<CategoryDTO> list = service.findAll();
        return ResponseEntity.ok(list) ;
    }

}
