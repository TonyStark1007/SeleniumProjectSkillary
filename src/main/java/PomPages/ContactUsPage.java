package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
   @FindBy(name="name")
   private WebElement fullnametf;
   
   @FindBy(name="sender")
   private WebElement emailtf;
   
   @FindBy(name="subject")
   private WebElement subjecttf;
   
   @FindBy(name="message")
   private WebElement messagetf;
   
   @FindBy(xpath="//button[text()='Send us mail']")
   private WebElement sendusbtn;
   
  public ContactUsPage(WebDriver driver){
	   PageFactory.initElements(driver, this);
   }
  
  public void fullNameTf(String name) {
	  fullnametf.sendKeys(name);
  }
  public void emailTf(String email) {
	  emailtf.sendKeys(email);
  }
   public void subjectTf(String sub) {
	   subjecttf.sendKeys(sub);
   }
   public void messageTf(String msg) {
	   messagetf.sendKeys(msg);
   }
   public void sendusbtn() {
	   sendusbtn.click();
    }
   
}
