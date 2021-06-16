package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptPage {
@FindBy(xpath="(//img[@class='thumb lazy'])[10]")
private WebElement javascript;
@FindBy(xpath="//a[text()=' TAKE THIS COURSE ']")
private WebElement takeThisCourse; 


public JavaScriptPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}
public void takeThis() {
	takeThisCourse.click();
}
public void javaScript() {
	javascript.click();
}

}
