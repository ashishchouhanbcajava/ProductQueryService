package com.ProductQueryService.ProductQueryService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ProductQueryService.ProductQueryService.Beans.ProductView;
import com.ProductQueryService.ProductQueryService.Service.ProductViewService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("/products")
@RestController
public class ProductViewController {

	@Autowired
	private ProductViewService productViewService;

	@GetMapping("/getProduct")
	public ResponseEntity<?> getProduct(@RequestParam String id) {

		ProductView one = productViewService.getOne(id);

		return ResponseEntity.ok(one);
	}

//	
	@PostMapping("/saveProductView")
	public ResponseEntity<Boolean> saveProductView(@Valid @RequestBody ProductView productView) {
		// TODO: process POST request
		return ResponseEntity.ok(productViewService.save(productView));
	}
	


}
