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
@Table(name="tbl_saleItem")
public class SaleItem {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private long Id;
	@ManyToOne
	@JoinColumn(name="Product_id")
	@JsonIgnore
	private Product product;
	@ManyToOne
	@JoinColumn(name="sale_Id")
	@JsonIgnore
	private Sale sale;
	public SaleItem(long Id, Product product, Sale sale, int quantity, double price) {
		super();
		this.Id = Id;
		this.product = product;
		this.sale = sale;
		this.quantity = quantity;
		this.price = price;
	}
	public SaleItem() {
		super();
	}
	public long getSaleId() {
		return Id;
	}
	public void setSaleId(long saleId) {
		this.Id = saleId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private int quantity;
	private double price;

}
