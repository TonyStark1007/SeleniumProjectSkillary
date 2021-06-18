package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EassyPage {
@FindBy(id="mytext")
private WebElement nametf;

@FindBy(xpath="//input[@class='subtnn']")
private WebElement mynamebtn;

@FindBy(id="essay")
private WebElement eassypage;

public EassyPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void name(String name) {
	nametf.sendKeys(name);
}
public void myname() {
	mynamebtn.click();
}
public void eassywriting(String eassy) {
	eassypage.sendKeys(eassy);
}


}
