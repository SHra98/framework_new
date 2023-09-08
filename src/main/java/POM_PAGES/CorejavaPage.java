package POM_PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaPage {
	//declaration
	//address of core java for selenium
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
    private WebElement selenium;
	
	//initialization
	public CorejavaPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void seleniumtrainting() {
		selenium.click();
	}
	
}
