package com.mvc.manager.service;
import com.mvc.manager.entity.Product;
import com.mvc.manager.pojo.Quote;
import com.mvc.manager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.List;

/**
 * This
 *
 * @author Nuh Emrah Seren
 * @version 1.0
 * @since 9/4/2020
 */



@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository repo;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    public List<Product> listAll() {
        return repo.findAll();
    }

    public void save(Product product) {
        repo.save(product);
    }

    public Product get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }

    public Quote getRandom(){
        RestTemplateBuilder builder = new RestTemplateBuilder();
        builder.build();

        RestTemplate restTemplate = new RestTemplate();
        Quote quote  = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        return quote;
    }
}