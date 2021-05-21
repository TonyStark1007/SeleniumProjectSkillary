package Scripts;

import org.testng.annotations.Test;

import PomPages.AddTocart;
import PomPages.DemoSkillarayLogin;
import PomPages.SkillarayLoginpage;
import genericlib.BaseClass;

public class AddToCart extends BaseClass {
	@Test
	public void addProduct() {
		SkillarayLoginpage s=new SkillarayLoginpage(driver);
		s.gearsClick();
		s.skillaraydemoClick();
		utilities.switchTab(driver);
		
		DemoSkillarayLogin d=new DemoSkillarayLogin(driver);
        utilities.mouseHover(driver, d.getCoursebtn());
        d.seleniumTraining();
        
        AddTocart a=new AddTocart(driver);
        utilities.doubleClick(driver, a.getAddbtn());
        a.addToCartbtn();
        
        utilities.alertPopup(driver);
        }
	
    
}
