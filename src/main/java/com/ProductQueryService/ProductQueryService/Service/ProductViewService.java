package com.ProductQueryService.ProductQueryService.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProductQueryService.ProductQueryService.Beans.ProductView;
import com.ProductQueryService.ProductQueryService.Repository.ProductViewRepository;

@Service
public class ProductViewService {

	@Autowired
	private ProductViewRepository productViewRepository;

	public List<ProductView> getAll() {
		return productViewRepository.findAll();
	}

	public ProductView getOne(String id) {
		return productViewRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with id : " + id));
	}

	public boolean save(ProductView productView) {
		return productViewRepository.save(productView) != null;
	}
}
