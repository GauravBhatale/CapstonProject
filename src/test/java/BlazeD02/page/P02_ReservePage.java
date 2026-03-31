package BlazeD02.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BlazeD04.Utility.LiveUtility;

public class P02_ReservePage {

	private WebDriver driver;

	public P02_ReservePage(WebDriver driver)// driver from base class
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// locator
	@FindBy(xpath = "//table//tbody//tr")
	List<WebElement> totalSearchResult;

	@FindBy(xpath = "//table//tbody//tr//td[3]")
	List<WebElement> allAirlines;

	// method
	public int getTotalSearchResult() {
		return totalSearchResult.size();
	}

	public void getAirlineDetails() {
		for (WebElement i : allAirlines) {
			System.out.println(i.getText());
		}
	}

	public void chooseFlight(String name) {
		int rowcount = 0;
		for (WebElement i : allAirlines) {
			rowcount++;

			if (i.getText().contains(name)) {
				System.out.println("Airline found at row: " + rowcount);
				driver.findElement(By.xpath("//table//tr[" + rowcount + "]//td//input")).click();
				break;
			}
			// return next page object
			LiveUtility.getScreenshot(driver);
		}
	}

}