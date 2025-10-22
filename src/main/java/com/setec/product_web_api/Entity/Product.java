package com.setec.product_web_api.Entity;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name="tbl_Product")
@Setter
@Getter
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private double price;
	private int qty;
	public double getAmount() {
		return price * qty;
	}
	@JsonIgnore
	private String imageUrl;
	
	public String getFullImageUrl() {
		return ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString() + imageUrl;
	}
}
