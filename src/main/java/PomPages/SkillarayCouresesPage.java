package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillarayCouresesPage {
	
@FindBy(xpath="//img[@title='Core Java for Selenium']")
private WebElement corejavaforselenium;


 public SkillarayCouresesPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 public void coreJavaForSelenium() {
	 corejavaforselenium.click();
 }


}
