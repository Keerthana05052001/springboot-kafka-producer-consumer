package com.order.kafka.module;

public class Order {

	private int orderID;
	private String CustomerName;
	private String productName;
	private double price;
	private String address;
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", CustomerName=" + CustomerName + ", productName=" + productName
				+ ", price=" + price + ", address=" + address + "]";
	}
	
	
}
