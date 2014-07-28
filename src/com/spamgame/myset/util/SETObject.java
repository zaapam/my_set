package com.spamgame.myset.util;

public class SETObject {

	private String code;
	private float price;
	private float priceChange;
	private float priceChangePercent;
	
	public SETObject(String code, float price, float priceChange, float priceChangePercent) {
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPriceChange() {
		return priceChange;
	}

	public void setPriceChange(float priceChange) {
		this.priceChange = priceChange;
	}

	public float getPriceChangePercent() {
		return priceChangePercent;
	}

	public void setPriceChangePercent(float priceChangePercent) {
		this.priceChangePercent = priceChangePercent;
	}
}
