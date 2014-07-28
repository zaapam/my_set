package com.spamgame.myset.util;

public class SETObject {

	private String code;
	private double price;
	private double priceChange;
	private double priceChangePercent;
	
	public SETObject(String code, double price, double priceChange, double priceChangePercent) {
		this.code = code;
		this.price = price;
		this.priceChange = priceChange;
		this.priceChangePercent = priceChangePercent;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public double getPriceChange() {
		return priceChange;
	}

	public void setPriceChange(float priceChange) {
		this.priceChange = priceChange;
	}

	public double getPriceChangePercent() {
		return priceChangePercent;
	}

	public void setPriceChangePercent(float priceChangePercent) {
		this.priceChangePercent = priceChangePercent;
	}
}
