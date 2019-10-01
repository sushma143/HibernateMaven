package com.zensar.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Sushma Kumari
 * @creation_date 01 Oct 2019 10:13 AM
 * @version 1.0
 * @modification_date 01 Oct 2019 10:135 AM
 * @copyright All rights are reserver by Zensar.
 * @description It is a persistence class.
 * 				It is a POJO class.
 *	
 */
@Entity
public class Product {
	@Id
	@Column(name="id")
	private int productId;
	private String name;
	private String brand;
	private float price;
	
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	

}
