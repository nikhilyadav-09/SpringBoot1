package com.jspider.productproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.productproject.dto.ProductDTO;
import com.jspider.productproject.response.Response;

@RestController
public class Controller {
	@Autowired
	private com.jspider.productproject.service.Service service;
	
	@PostMapping("addProduct")
	ResponseEntity<Response> addProduct(@RequestBody ProductDTO pro ){
			ProductDTO dto=service.addProduct(pro);
			if(dto!=null) {
				return new ResponseEntity<Response>(new Response(false, "Product Inserted", dto),HttpStatus.ACCEPTED);
			}
			
			return new ResponseEntity<Response>(new Response(true, "Product not Inserted"),HttpStatus.BAD_REQUEST);
			
	}
	
	@GetMapping("findByProductName{pname}")
	ResponseEntity<Response> findByProductName(@RequestBody ProductDTO dto ){
		ProductDTO dto1= service.findByProductName(dto.getPname());
		if(dto1!=null) {
			return new ResponseEntity<Response>(new Response(false, "Product Found", dto1),HttpStatus.OK);
		}
		
		return new ResponseEntity<Response>(new Response(true, "Product not Found"),HttpStatus.BAD_REQUEST);
		
}
	@PutMapping("updateProduct")
	ResponseEntity<Response> updateProduct(@RequestBody ProductDTO dto ){
		ProductDTO dto1=service.updateProduct(dto);
		
		if(dto1!=null) {
			return new ResponseEntity<Response>(new Response(false, "Product Updated", dto1),HttpStatus.OK);
		}
		
		return new ResponseEntity<Response>(new Response(true, "Product not Updated"),HttpStatus.BAD_REQUEST);
		
	}
	
	@DeleteMapping("deleteProduct")
	ResponseEntity<Response> deleteProduct(@RequestBody ProductDTO dto ){
		service.deleteProduct(dto);
		
		
			return new ResponseEntity<Response>(new Response(false, "Product  Deleted"),HttpStatus.OK);
		
			
	}
	
	
	
	

}
