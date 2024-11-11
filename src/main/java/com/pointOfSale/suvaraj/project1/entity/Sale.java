package com.pointOfSale.suvaraj.project1.entity;

import java.time.LocalDateTime;
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
@Table(name="tbl_Sale")
public class Sale {
	public Sale(long saleId, List<SaleItem> saleItems, Customer customer, User user, LocalDateTime date,
			double totalAmount, String paymentMethod, String status, List<Payment> payment) {
		super();
		this.saleId = saleId;
		this.saleItems = saleItems;
		this.customer = customer;
		this.user = user;
		this.date = date;
		this.totalAmount = totalAmount;
		this.paymentMethod = paymentMethod;
		this.status = status;
		this.payment = payment;
	}
	public Sale() {
		super();
	}
	public long getSaleId() {
		return saleId;
	}
	public void setSaleId(long saleId) {
		this.saleId = saleId;
	}
	public List<SaleItem> getSaleItems() {
		return saleItems;
	}
	public void setSaleItems(List<SaleItem> saleItems) {
		this.saleItems = saleItems;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Payment> getPayment() {
		return payment;
	}
	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long saleId;
	@OneToMany(mappedBy = "sale",cascade = CascadeType.ALL)
	private List<SaleItem> saleItems;
	@ManyToOne
	@JoinColumn(name="customer_Id")
	@JsonIgnore
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="user_Id")
	@JsonIgnore
	private User user;
	
	private LocalDateTime date;
	private double totalAmount;
	private String paymentMethod;
	private String status;
	@OneToMany(mappedBy = "sale",cascade = CascadeType.ALL)
	private List<Payment> payment;

}
