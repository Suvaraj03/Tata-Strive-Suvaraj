package com.pointOfSale.suvaraj.project1.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long payId;
	@ManyToOne
	@JoinColumn(name="sale_Id")
	@JsonIgnore
	private Sale sale;
	
	private double amount;
	private String paymentMethod;
	private String transactionId;
	private  String status;
	private LocalDateTime date;
	
	public Long getPayId() {
		return payId;
	}
	public void setPayId(Long payId) {
		this.payId = payId;
	}
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public Payment() {
		super();
	}
	public Payment(Long payId, Sale sale, double amount, String paymentMethod, String transactionId, String status,
			LocalDateTime date) {
		super();
		this.payId = payId;
		this.sale = sale;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.transactionId = transactionId;
		this.status = status;
		this.date = date;
	}
	
	
}
