package com.ProductQueryService.ProductQueryService.Beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Document
public class ProductView {

	@Id
	private Long id;
	private String name;
	private String description;
	private BigDecimal price; // 129999.00
	private BigDecimal discount; // 10% or fixed

	private Integer stockQuantity;

	private String brand;

	private String status;

	private List<ProductImage> images = new ArrayList<>();

}
