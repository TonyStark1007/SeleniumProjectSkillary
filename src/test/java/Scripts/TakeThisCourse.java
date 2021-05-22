package Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.CoreJavaForSelePage;
import PomPages.SkillarayCouresesPage;
import PomPages.SkillarayLoginpage;
import genericlib.BaseClass;

public class TakeThisCourse extends BaseClass {
@Test
public void takeThisCourse() throws FileNotFoundException, IOException, InterruptedException {
	SkillarayLoginpage s=new SkillarayLoginpage(driver);
	s.searchtf(p.getData("search"));
	s.searchbtn();
	SkillarayCouresesPage c=new SkillarayCouresesPage(driver);
	c.coreJavaForSelenium();
	
	c.coreJavaForSelenium();

	
	CoreJavaForSelePage core=new CoreJavaForSelePage(driver);
	core.privacy();
	utilities.switchFrame(driver);
	
	core.playbtn();
	Thread.sleep(3000);
	core.pausebtn();
	utilities.switchBack(driver);
	core.takeThisCourse();
	
}
}
