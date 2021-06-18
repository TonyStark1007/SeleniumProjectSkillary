package Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.EassyPage;
import PomPages.SkillarayLoginPage;
import genericlib.BaseClass;

public class EassyEditor extends BaseClass {
@Test
public void editor() throws FileNotFoundException, IOException, InterruptedException {
	SkillarayLoginPage s=new SkillarayLoginPage(driver);
	s.gearsClick();
	s.eassy();
	EassyPage e=new EassyPage(driver);
	utilities.switchTab(driver);
	e.name(p.getData("name"));
	e.myname();
	Thread.sleep(5000);
	e.eassywriting(p.getData("eassy"));
	Thread.sleep(5000);

}
}
