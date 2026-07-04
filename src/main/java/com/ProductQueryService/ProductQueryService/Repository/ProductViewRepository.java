package com.ProductQueryService.ProductQueryService.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ProductQueryService.ProductQueryService.Beans.ProductView;

@Repository
public interface ProductViewRepository extends MongoRepository<ProductView, Long> {

}
