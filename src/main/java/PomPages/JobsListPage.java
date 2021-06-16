package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsListPage {
@FindBy(xpath="//a[text()=' Apply Now ']")
private WebElement applybtn;

public JobsListPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}
public void apply() {
	applybtn.click();
}

}
