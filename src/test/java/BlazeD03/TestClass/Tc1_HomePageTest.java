package BlazeD03.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import BlazeD01.BaseClass.BaseClass;

public class Tc1_HomePageTest extends BaseClass {
	@Test(priority = 1)
	public void verifyUrl() {
		String actUrl = hp.getAppUrl();
		Assert.assertTrue(actUrl.contains("blaze"));
		System.out.println("Url match: " + actUrl);
	}

	@Test(priority = 2)
	public void verifyTitle() {
		String actTitle = hp.getAppTitle();
		Assert.assertTrue(actTitle.contains("Blaze"));
		System.out.println("Title match" + actTitle);
	}

	@Test(priority = 3)
	public void validateFindFlight() {
		hp.selectFromPort("Mexico City");
		hp.selectToPort("New York");
		hp.clickOnFindFlightButton();
	}

}
