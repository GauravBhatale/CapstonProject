package BlazeD02.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P03_PurchasePage {

	private WebDriver driver;

	public P03_PurchasePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(name = "inputName")
	private WebElement inputName;

	@FindBy(xpath = "//input[@id='address']")
	private WebElement address;

	@FindBy(css = "input[id='city']")
	private WebElement city;

	@FindBy(css = "input[id='state']")
	private WebElement state;

	@FindBy(name = "zipCode")
	private WebElement zipCode;

	@FindBy(xpath = "//select[@class='form-inline']")
	private WebElement cardType;

	@FindBy(xpath = "//input[@id='creditCardNumber']")
	private WebElement cardNumber;

	@FindBy(name = "creditCardMonth")
	private WebElement creditCardMonth;

	@FindBy(name = "creditCardYear")
	WebElement creditCardYear;

	@FindBy(name = "nameOnCard")
	WebElement nameOnCard;

	@FindBy(name = "rememberMe")
	WebElement checkBox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitButton;

	// methods
	public void inputName(String fn) {
		inputName.sendKeys(fn);
	}

	public void adress(String add) {
		address.sendKeys(add);
	}

	public void city(String ct) {

		city.sendKeys(ct);
	}

	public void State(String st) {
		state.sendKeys(st);
	}

	public void zipCode(String code) {
		zipCode.sendKeys(code);
	}

	public void Selectcardtype(String card) {

		Select sc = new Select(cardType);
		sc.selectByVisibleText(card);
		List<WebElement> allOptions = sc.getOptions();
		System.out.println("Card Options :" + allOptions);
		for (WebElement i : allOptions) {

			if (i.getText().contains(card))
				;
			{
			}
		}
	}

	public void cardNmuber(String num) {
		cardNumber.sendKeys(num);
	}

	public void creditCardMonth(String month) {
		creditCardMonth.sendKeys(month);
	}

	public void creditCardYear(String year) {
		creditCardYear.sendKeys(year);
	}

	public void nameOnCard(String name ) {
		nameOnCard.sendKeys(name);
	}
	public void rememberMe() {
		checkBox.click();
	}
	public void submitButton() {
		submitButton.click();
	}

}
