package POM_PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	//address of play icon
	//@FindBy(xpath="//div[@class='play-icon']")
	//private WebElement playbtn;
	
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playbtn;
	//address of pause icon
	//@FindBy(xpath="//div[@class='pause-icon']")
	//private WebElement pausebtn;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pausebtn;
	//address of whishlist
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	//Initilization
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void playbutton() {
		playbtn.click();
	}
	
	public void pausebutton() {
		pausebtn.click();
	}
	
	public void addtowishlistbtn() {
		addtowishlist.click();
	}
	
	

}
