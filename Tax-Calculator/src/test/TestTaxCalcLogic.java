package test;
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

public class TestTaxCalcLogic {	

	TaxCalcLogic taxCL = new TaxCalcLogic();
	Tax tax = new Tax("Cell Phone Support");
	
	@BeforeEach
	public void setUp() throws Exception {
	}
	@Test
	public void testTaxPositive() {
		tax.setPrice(20);
		double calcTax = taxCL.calculateTax(tax);
		assertEquals(calcTax, 21.4);		
	}
	@Test
	public void testTaxNegative() {
		tax.setPrice(20);
		double calcTax = taxCL.calculateTax(tax);
		assertNotSame(calcTax, 21.4);		
	}
	@Test
	public void testNameProduct() {
		tax.setProduct("Cell Phone Support");
		String product = tax.getProduct();
		assertEquals(product, "Cell Phone Support");
	}
	
}

