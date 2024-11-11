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
@Table(name="tbl_customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long custId;
	private String name;
	private String email;
	private String phone;
	private String address;
	public Customer(long custId, String name, String email, String phone, String address, int loyalityPoints,
			List<Sale> sales) {
		super();
		this.custId = custId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.loyalityPoints = loyalityPoints;
		this.sales = sales;
	}
	public Customer() {
		super();
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLoyalityPoints() {
		return loyalityPoints;
	}
	public void setLoyalityPoints(int loyalityPoints) {
		this.loyalityPoints = loyalityPoints;
	}
	public List<Sale> getSales() {
		return sales;
	}
	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}
	private int loyalityPoints;
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	private List<Sale> sales;
}
