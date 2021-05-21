package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillarayLogin {

	@FindBy(id="course")
	private WebElement coursebtn;


	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement Seleniumtrainingbtn;

	public DemoSkillarayLogin(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void seleniumTraining() {
		Seleniumtrainingbtn.click();
	}
	public WebElement getCoursebtn() {
		return coursebtn;
	}

}
