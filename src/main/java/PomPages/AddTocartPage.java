package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTocartPage {
@FindBy(id="add")
private WebElement addbtn;

@FindBy(xpath="//button[text()=\" Add to Cart\"]")
private WebElement addtocartbtn;

 public AddTocartPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

 public void addToCartbtn() {
	 addtocartbtn.click();
 }
 
public WebElement getAddbtn() {
	return addbtn;
}
 
}
