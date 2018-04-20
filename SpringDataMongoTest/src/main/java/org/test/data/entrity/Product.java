package org.test.data.entrity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	
	@Id
	private String id;
	
	private String name;
	private String price;
	private Double tax;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String name, String price, Double tax) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.price=price;
		this.setTax(tax);
	}

	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}

	
}
