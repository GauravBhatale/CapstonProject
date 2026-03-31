package BlazeD03.TestClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BlazeD01.BaseClass.BaseClass;

public class Tc3_PurchasePageTest extends BaseClass {

	@BeforeClass
	public void setUp() {
		// user should select the cit
		hp.selectFromPort("Mexico City");
		hp.selectToPort("New York");
		hp.clickOnFindFlightButton();
		rp.chooseFlight("United Airlines");
	}

	@Test(priority = 3)
	public void FirstName() {
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
}
