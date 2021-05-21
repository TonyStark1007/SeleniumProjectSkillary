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
  
  public SkillarayLoginpage(WebDriver driver) {
	  PageFactory.initElements(driver,this);
  }
  public void gearsClick() {
	  gearsbtn.click();
	  
  }
  public void skillaraydemoClick() {
	  skillaraydemobtn.click();
	  
  }
}
