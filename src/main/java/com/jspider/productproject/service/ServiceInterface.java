package com.jspider.productproject.service;

import com.jspider.productproject.dto.ProductDTO;

public interface ServiceInterface {

	ProductDTO addProduct(ProductDTO dto);
	
	ProductDTO findByProductName(String pname);
	
	ProductDTO updateProduct(ProductDTO dto);
	
	void deleteProduct(ProductDTO dto);
	

	
	
}
