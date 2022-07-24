package com.jspider.productproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jspider.productproject.dto.ProductDTO;

@Repository
public interface ProductDAO extends CrudRepository<ProductDTO, String> {
	
	public ProductDTO findByPname(String pname);

}
