package TestScripts;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;
import GENERIC_LIBRARY.BaseClass;
import POM_PAGES.SkillraryDemoLoginPage;
import POM_PAGES.SkillraryLoginPage;
import POM_PAGES.TestingPage;


public class Testcase2 extends BaseClass {

	@Test
	public void tc2() throws Throwable
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilities.switchingtabs(driver);
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilities.dropDown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
		TestingPage tp = new TestingPage(driver);
		Thread.sleep(3000);
		utilities.dragdrop(driver,tp.getSeleniumtraining(),tp.getCarttab());
		Thread.sleep(3000);
		Point locations = tp.getFacebook().getLocation();
		int x=locations.getX();
		int y=locations.getY();
		utilities.scrollbar(driver, x, y);
		tp.facebookicon();
		Thread.sleep(5000);
		
	}

}
