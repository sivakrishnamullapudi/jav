package com.cg.pizzaorder.bean;

public class PizzaOrder {
	private int orderId;
	private int customerId;
	private double totalPrice;
	private String pizzatopping;

	public PizzaOrder(String pizzatopping,int price) {
		this.pizzatopping = pizzatopping;
		this.totalPrice=price;
	}

	public PizzaOrder(String string) {
	this.pizzatopping=string;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "PizzaOrder :orderId=" + orderId + " totalPrice=" + totalPrice
				+ " pizzatopping=" + pizzatopping + "]";
	}

}
