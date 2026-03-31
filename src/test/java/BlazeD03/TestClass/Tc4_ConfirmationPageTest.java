package BlazeD03.TestClass;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BlazeD01.BaseClass.BaseClass;

public class Tc4_ConfirmationPageTest extends BaseClass {
	@BeforeClass
	public void setUp() {
		// user should select the cit
		hp.selectFromPort("Mexico City");
		hp.selectToPort("New York");
		hp.clickOnFindFlightButton();
		rp.chooseFlight("United Airlines");
		pp.inputName("Gaurav");
		pp.adress("Gargoti");
		pp.city("Kolhapur");
		pp.State("Kolhapur");
		pp.zipCode("221113");
		pp.Selectcardtype("Visa");
		pp.cardNmuber("111213");
		pp.creditCardMonth("5");
		pp.creditCardYear("2019");
		pp.nameOnCard("gaurav");
		pp.rememberMe();
		pp.submitButton();
	}

	@Test(priority = 4)
	public void conformationtext() {

		String cText = cp.conformation();
		Assert.assertTrue(cText.contains("Thank you for your purchase today!"));
		System.out.println("Conformation Text :" + cText);
	}
}
