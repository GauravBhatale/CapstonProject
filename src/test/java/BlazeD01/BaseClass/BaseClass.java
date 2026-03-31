package BlazeD01.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import BlazeD02.page.P01_HomePage;
import BlazeD02.page.P02_ReservePage;
import BlazeD02.page.P03_PurchasePage;
import BlazeD02.page.P04_ConfirmationPage;

public class BaseClass {

	// project configuration class

	public WebDriver driver;
	public P01_HomePage hp;
	public P02_ReservePage rp;
	public P03_PurchasePage pp;
	public P04_ConfirmationPage cp;

	@BeforeClass
	public void SetUp() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");

		hp = new P01_HomePage(driver);
		rp = new P02_ReservePage(driver);
		pp = new P03_PurchasePage(driver);
		cp = new P04_ConfirmationPage(driver);
	}

	@AfterClass
	public void tearDown() {
		// close
		driver.quit();
	}
}
