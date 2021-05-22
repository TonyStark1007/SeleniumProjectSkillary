package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillarayLoginpage {
  @FindBy(xpath="//a[text()=' GEARS ']")
  private WebElement gearsbtn;
  
@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
  private WebElement skillaraydemobtn;

@FindBy(name="q")
private WebElement searchtf;

@FindBy(xpath="//input[@type='submit']")
private WebElement searchbtn;

@FindBy(xpath="//a[text()='Contact Us']")
private WebElement contactusbtn;


  public SkillarayLoginpage(WebDriver driver) {
	  PageFactory.initElements(driver,this);
  }
  public void searchtf(String name) {
	  searchtf.sendKeys(name);	  
  }
  public void searchbtn() {
	  searchbtn.click();	  
  }
  
  public void gearsClick() {
	  gearsbtn.click();
	  
  }
  public void skillaraydemoClick() {
	  skillaraydemobtn.click();  
  }
	public void contactUsbtn() {
		contactusbtn.click();
	}
}
