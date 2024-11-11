package com.pointOfSale.suvaraj.project1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_inventory")
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long inId;
	@ManyToOne
	@JoinColumn(name="product_Id")
	@JsonIgnore
	private Product product;
	
	public long getInId() {
		return inId;
	}
	public Inventory(long inId, Product product, int quantityInStock, int reorderLevel) {
		super();
		this.inId = inId;
		this.product = product;
		this.quantityInStock = quantityInStock;
		this.reorderLevel = reorderLevel;
	}
	public Inventory() {
		super();
	}
	public void setInId(long inId) {
		this.inId = inId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public int getReorderLevel() {
		return reorderLevel;
	}
	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}
	private int quantityInStock;
	private int reorderLevel;

}
