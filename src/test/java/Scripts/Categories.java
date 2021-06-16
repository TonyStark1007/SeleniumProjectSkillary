package Scripts;

import org.testng.annotations.Test;

import PomPages.JavaScriptPage;
import PomPages.SkillarayLoginPage;
import genericlib.BaseClass;

public class Categories extends BaseClass {

	@Test
	public void categories() throws InterruptedException {
		SkillarayLoginPage s=new SkillarayLoginPage(driver);
		s.categories();
		Thread.sleep(5000);
		s.development();
		JavaScriptPage j=new JavaScriptPage(driver);
		j.javaScript();
		Thread.sleep(5000);
		j.takeThis();
	}

}
