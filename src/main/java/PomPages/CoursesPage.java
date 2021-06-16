package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursesPage {
	@FindBy(xpath="//a[text()=' Career ']")
	private WebElement careerbtn;
	public CoursesPage(WebDriver driver){
	PageFactory.initElements(driver, this);
		
	}
	public void career() {
		careerbtn.click();
	}
	
}
