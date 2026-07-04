package com.ProductQueryService.ProductQueryService.Service;

import java.util.List;

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

//	public Optional<ProductView> getOne(Long id) {
//		return productViewRepository.findById(id).orElseThrow(u->u.productQueryServiceApplication);
//	}
}
