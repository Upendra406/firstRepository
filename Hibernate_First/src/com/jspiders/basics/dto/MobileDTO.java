 package com.jspiders.basics.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "mobile")

public class MobileDTO implements Serializable {
	
	
	@Id
	@GenericGenerator(name = "hibernate" , strategy = "increment")
	@GeneratedValue(generator = "hibernate")
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "memory")
	private String memory;
	
	@Column(name = "price")
	private Double price;
	
	
	public MobileDTO() {
		// TODO Auto-generated constructor stub
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMemory() {
		return memory;
	}


	public void setMemory(String memory) {
		this.memory = memory;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "MobileDTO [brand=" + brand + ", model=" + model + ", color=" + color + ", memory=" + memory + ", price="
				+ price + "]";
	}
	
	
	
	
	

}
