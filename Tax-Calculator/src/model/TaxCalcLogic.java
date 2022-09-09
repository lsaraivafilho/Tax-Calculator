package model;
/**
 * @author Leonardo Saraiva - lsaraivafilho@dmacc.edu
 * CIS175 - Fall 2021
 * Sep 8, 2022
 */

public class TaxCalcLogic {

	public double calculateTax(Tax tax) {
		double taxPercentage = 0.07;
		double taxValue = tax.getPrice()* taxPercentage;
		double pricePlusTaxes = taxValue + tax.getPrice();	
		return pricePlusTaxes;
	}
	
}
