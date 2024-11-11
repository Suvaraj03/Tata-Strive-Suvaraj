package com.pointOfSale.suvaraj.project1.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_category")
public class Category {
	public Category(long cId, String name, String description, List<Product> products) {
		super();
		this.cId = cId;
		this.name = name;
		this.description = description;
		this.products = products;
	}
	public Category() {
		super();
	}
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cId;
	private String name;
	private String description;
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
	private List<Product> products;

}