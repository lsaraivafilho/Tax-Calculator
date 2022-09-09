/**
 * @author Leonardo Saraiva - lsaraivafilho@dmacc.edu
 * CIS175 - Fall 2021
 * Sep 8, 2022
 */
package test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerTaxCalc {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestTaxCalcLogic.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
		Result resultSecond = JUnitCore.runClasses(TestTaxCalcLogicSecond.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
}
}
	

