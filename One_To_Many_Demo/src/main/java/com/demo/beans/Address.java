package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name="addr12")

public class Address {
	@Id
	private int aid;
	private String street,city;
	@ManyToOne
	@JoinColumn(name="addr")
	private MyUser Mu;
	public Address() {
		
		
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int aid, String street, String city) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", Mu=" + Mu + "]";
	}
	public MyUser getMu() {
		return Mu;
	}
	public void setMu(MyUser mu) {
		Mu = mu;
	}
	
	
	
	
	

}
