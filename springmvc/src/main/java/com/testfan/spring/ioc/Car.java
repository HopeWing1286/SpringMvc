package com.testfan.spring.ioc;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cartest")
public class Car {
	private String name;
	private double price;
	
	@Resource(name="user")
	private User user2;
	

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		System.out.println(" 我有参数 ");
	}
	
	public Car() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
}
