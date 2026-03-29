package BlazeD02.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_ConfirmationPage {

	public WebDriver driver;
	
   public P04_ConfirmationPage(WebDriver driver) {
	   
	   this.driver =driver;
	   PageFactory.initElements(driver,this);
   }
	
   //Locators 
   @FindBy(xpath="/html/body/div[2]/div/h1")
   WebElement conformationText;
   
   //methods
   public String conformation() {
	   return conformationText.getText();
   }
}
