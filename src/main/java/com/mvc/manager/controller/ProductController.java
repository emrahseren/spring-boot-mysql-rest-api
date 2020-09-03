package com.mvc.manager.controller;

import com.mvc.manager.entity.Product;
import com.mvc.manager.pojo.Quote;
import com.mvc.manager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * This
 *
 * @author Nuh Emrah Seren
 * @version 1.0
 * @since 9/4/2020
 */

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> list() {
        return service.listAll();
    }

    @GetMapping("/random")
    public Quote getRandom() {
        return service.getRandom();
    }
}