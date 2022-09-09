package model;
/**
 * @author Leonardo Saraiva - lsaraivafilho@dmacc.edu
 * CIS175 - Fall 2021
 * Sep 8, 2022
 */

public class Tax {
	
	private String product;
	private double price;
	private double taxValue;
	
	public Tax(){		
	}
	public Tax(String product) {
		this.product = product;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTaxValue() {
		return taxValue;
	}
	public void setTaxValue(double taxValue) {
		this.taxValue = taxValue;
	}
}
