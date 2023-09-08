package TestScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import GENERIC_LIBRARY.WebDriverUtilities;
import POM_PAGES.AddtoCartPage;
import POM_PAGES.SkillraryDemoLoginPage;
import POM_PAGES.SkillraryLoginPage;
import GENERIC_LIBRARY.BaseClass;

public class Testcase1 extends BaseClass{
	
	@Test
	public void tc1()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilities.switchingtabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilities.mouseover(driver,sd.getCoursetab());
		sd.seleniumtrainingtab();
		AddtoCartPage d=new AddtoCartPage(driver);
		utilities.doubleclick(driver, d.getAddbtn());
		d.carttocartbtn();
		utilities.alertpopup(driver);
		
	}



}
