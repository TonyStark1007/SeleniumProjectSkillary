package Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.ContactUsPage;
import PomPages.DemoSkillarayLoginPage;
import PomPages.SkillarayLoginPage;
import genericlib.BaseClass;

public class ContactUs extends BaseClass {
	@Test
	public void contactUspage() throws FileNotFoundException, IOException {
		SkillarayLoginPage s=new SkillarayLoginPage(driver);
        s.gearsClick();
        s.skillaraydemoClick();
        utilities.switchTab(driver);
		DemoSkillarayLoginPage d=new DemoSkillarayLoginPage(driver);
		d.contactUsbtn();

		ContactUsPage c=new ContactUsPage(driver);
		c.fullNameTf(p.getData("name"));

		c.emailTf(p.getData("email"));

		c.subjectTf(p.getData("subject"));
		c.messageTf(p.getData("msg"));
		c.sendusbtn();
	}
}
