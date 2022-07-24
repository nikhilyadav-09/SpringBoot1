package com.jspider.productproject.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jspider.productproject.dto.ProductDTO;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4258578906128347956L;
	private boolean errror;
	private String msg;
	private ProductDTO data;
	private Iterable<ProductDTO> list;
	
	public boolean isErrror() {
		return errror;
	}
	public void setErrror(boolean errror) {
		this.errror = errror;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public ProductDTO getData() {
		return data;
	}
	public void setData(ProductDTO data) {
		this.data = data;
	}
	public Iterable<ProductDTO> getList() {
		return list;
	}
	public void setList(Iterable<ProductDTO> list) {
		this.list = list;
	}
	
	
	
	
	
	public Response(boolean errror, String msg) {
		super();
		this.errror = errror;
		this.msg = msg;
	}
	
	
	public Response(boolean errror, String msg, Iterable<ProductDTO> list) {
		super();
		this.errror = errror;
		this.msg = msg;
		this.list = list;
	}
	public Response(boolean errror, String msg, ProductDTO data) {
		super();
		this.errror = errror;
		this.msg = msg;
		this.data = data;
	}
	
	
	
	
	
	

}
