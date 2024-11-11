package com.pointOfSale.suvaraj.project1.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="tbl_product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pId;
	private String name;
	private String description;
	private double price;
	private int quantity;
	public Product(long pId, String name, String description, double price, int quantity, Category category, String sku,
			String barcode, List<Inventory> inventory, Supplier supplier, List<SaleItem> saleItem) {
		super();
		this.pId = pId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.sku = sku;
		this.barcode = barcode;
		this.inventory = inventory;
		this.supplier = supplier;
		this.saleItem = saleItem;
	}
	public Product() {
		super();
	}
	public long getpId() {
		return pId;
	}
	public void setpId(long pId) {
		this.pId = pId;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public List<Inventory> getInventory() {
		return inventory;
	}
	public void setInventory(List<Inventory> inventory) {
		this.inventory = inventory;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public List<SaleItem> getSaleItem() {
		return saleItem;
	}
	public void setSaleItem(List<SaleItem> saleItem) {
		this.saleItem = saleItem;
	}
	@ManyToOne
	@JoinColumn(name="category_Id")
	@JsonIgnore
	private Category category;
	
	private String sku;
	private String barcode;
	
	@OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
	private List<Inventory> inventory;
	@ManyToOne
	@JoinColumn(name="supplier_id")
	@JsonIgnore
	private Supplier supplier;
	@OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
	private List<SaleItem> saleItem;
	
}
