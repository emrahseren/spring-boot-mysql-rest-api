package com.mvc.manager.repository;

import com.mvc.manager.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * This
 *
 * @author Nuh Emrah Seren
 * @version 1.0
 * @since 9/4/2020
 */
@EnableJpaRepositories
public interface ProductRepository extends JpaRepository<Product, Integer> {

}