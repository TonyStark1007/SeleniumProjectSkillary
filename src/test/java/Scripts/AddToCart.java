package Scripts;

import org.testng.annotations.Test;

import PomPages.AddTocartPage;
import PomPages.DemoSkillarayLoginPage;
import PomPages.SkillarayLoginPage;
import genericlib.BaseClass;

public class AddToCart extends BaseClass {
	@Test
	public void addProduct() {
		SkillarayLoginPage s=new SkillarayLoginPage(driver);
		s.gearsClick();
		s.skillaraydemoClick();
		utilities.switchTab(driver);

		DemoSkillarayLoginPage d=new DemoSkillarayLoginPage(driver);
		utilities.mouseHover(driver, d.getCoursebtn());
		d.seleniumTraining();


		AddTocartPage a=new AddTocartPage(driver);
		utilities.doubleClick(driver, a.getAddbtn());
		a.addToCartbtn();

		utilities.alertPopup(driver);
	}


}
