package com.jspider.productproject.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProductDTO {
	
	@Id
	private String pname;
	private String ptype;
	private String pcategory;
	private String pprice;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getPcategory() {
		return pcategory;
	}
	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}
	public String getPprice() {
		return pprice;
	}
	public void setPprice(String pprice) {
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "ProductDTO [pname=" + pname + ", ptype=" + ptype + ", pcategory=" + pcategory + ", pprice=" + pprice
				+ "]";
	}
	
	
	

}
