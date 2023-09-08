package GENERIC_LIBRARY;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	//handling dropdown
	public void dropDown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	//handling mouse over
	public void mouseover(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//handling double click
	public void doubleclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	//handling drag and drop
	public void dragdrop(WebDriver driver,WebElement src,WebElement target)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src, target);
	}
	//shifting control from normal web page to frame
	public void switchframe(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	//shifting control from frame to normal page
	public void switchbackframe(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	//handling alert pop up
	public void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	//handling child browser pop up
	public void switchingtabs(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
	}
	//handling scroll bar
	public void scrollbar(WebDriver driver,int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
}


