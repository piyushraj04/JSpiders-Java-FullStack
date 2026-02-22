package org.jsp.springcore.Test01;

import java.util.Map;

public class Order {
	private int orderId;
	private double totalAmount;
	private String date;
	Map <Integer,String> orderDetails;
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Map<Integer, String> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Map<Integer, String> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", totalAmount=" + totalAmount + ", date=" + date + ", orderDetails="
				+ orderDetails + "]";
	}
	
	
	

}
