package tp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	public Actions act;
	
	public void dropDown(WebElement ele, String text) {
	Select s=new Select(ele);
	s.selectByVisibleText(text);
	}
	public void mouseHover(WebDriver driver, WebElement ele) {
	      act.moveToElement(ele).perform();
	}
	public void doubleClick(WebDriver driver, WebElement ele) {
		 act=new Actions(driver);
         act.doubleClick(ele).perform();
	}
	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	

}
