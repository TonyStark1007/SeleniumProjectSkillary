package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSelePage {
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;

	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//a[text()=' TAKE THIS COURSE ']")
	private WebElement takethiscoursebtn;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement privacy;
	

	public CoreJavaForSelePage(WebDriver driver) {
    PageFactory.initElements(driver, this);
    }
	public void playbtn() {
		playbtn.click();
	}
	public void pausebtn() {
		pausebtn.click();
	}
	public void takeThisCourse() {
		takethiscoursebtn.click();
	}
	public void privacy() {
		privacy.click();
	}
	
}
