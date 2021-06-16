package Scripts;

import org.testng.annotations.Test;

import PomPages.CoursesPage;
import PomPages.JobsListPage;
import PomPages.SkillarayLoginPage;
import genericlib.BaseClass;

public class Career extends BaseClass{
@Test
public void myCourse() throws InterruptedException {
	SkillarayLoginPage s=new SkillarayLoginPage(driver);
	s.course();
	CoursesPage c=new CoursesPage(driver);
	c.career();
	JobsListPage j=new JobsListPage(driver);
	j.apply();
	
	
}
}
