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
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uId;
	private String userName;
	private String password;
	private String role;
	private String email;
	private String phone;
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<Sale> sales;
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	public List<Sale> getSales() {
		return sales;
	}
	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}
	public User() {
		super();
	}
	public User(long uId, String userName, String password, String role, String email, String phone, List<Sale> sales) {
		super();
		this.uId = uId;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.email = email;
		this.phone = phone;
		this.sales = sales;
	}

}
