package com.setec.product_web_api.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.setec.product_web_api.Entity.Product;

public interface ProductRepos extends JpaRepository<Product, Integer>{

	List<Product> findByName(String name);

}
