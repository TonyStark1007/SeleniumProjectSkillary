package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillarayLoginPage {

	@FindBy(id="course")
	private WebElement coursebtn;


	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement Seleniumtrainingbtn;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactusbtn;

	public DemoSkillarayLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void seleniumTraining() {
		Seleniumtrainingbtn.click();
	}
	public WebElement getCoursebtn() {
		return coursebtn;
	}
	public void contactUsbtn() {
		contactusbtn.click();
	}

}
