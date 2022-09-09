package test;
import static org.junit.Assert.assertFalse;
/**
 * @author Leonardo Saraiva - lsaraivafilho@dmacc.edu
 * CIS175 - Fall 2021
 * Sep 8, 2022
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import model.*;

public class TestTaxCalcLogicSecond {	

	TaxCalcLogic taxCL = new TaxCalcLogic();
	Tax tax = new Tax("Cell Phone Support");
	
	@BeforeEach
	public void setUp() throws Exception {
	}
	@Test
	public void testTaxPositive() {
		tax.setPrice(1500);
		double calcTax = taxCL.calculateTax(tax);
		assertEquals(calcTax, 1605);		
	}
	@Test
	public void testTaxNegative() {
		tax.setPrice(1500);
		double calcTax = taxCL.calculateTax(tax);
		assertNotEquals(calcTax, 1606);		
	}
	@Test
	public void testNameProduct() {
		tax.setProduct("Cell Phone");
		String product = tax.getProduct();
		assertEquals(product, "Cell Phone");
	}
	
}