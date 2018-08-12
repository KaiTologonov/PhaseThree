package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Driver;

public class MapPage {

	public MapPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(partialLinkText = "google")
	public WebElement google;
	
	@FindBy(partialLinkText = "apple")
	public WebElement apple;
	
	@FindBy(partialLinkText = "microsoft")
	public WebElement microsoft;
	
	@FindBy(partialLinkText = "bay_area")
	public WebElement bayArea;
	
	@FindBy(partialLinkText = "amazon")
	public WebElement amazon;
	
	@FindBy(partialLinkText = "tesla")
	public WebElement tesla;
	
	@FindBy(partialLinkText = "facebook")
	public WebElement facebook;
	
	@FindBy(partialLinkText = "hunt")
	public WebElement hunt;
	
	@FindBy(partialLinkText = "my")
	public WebElement my;
	
	@FindBy(partialLinkText = "schedule")
	public WebElement schedule;
	
	@FindBy(id = "date")
	public WebElement date;
	
	@FindBy(id = "timelineStart")
	public Select timelineStart ;
	
	@FindBy(partialLinkText = "timelineFinish")
	public Select timelineFinish;
	
	@FindBy(xpath = "//span[@class='icon']")
	public WebElement searchButton;
	
	@FindBy(partialLinkText = "self")
	public WebElement self;
	
	@FindBy(partialLinkText = "team")
	public WebElement team;
	
	@FindBy(partialLinkText = "sign out")
	public WebElement signout;
	
	@FindBy(partialLinkText = "map")
	public WebElement map;
	
	@FindBy(xpath = "(//form/button)[1]")
	public WebElement googleBook;
	
	@FindBy(xpath = "(//form/button)[2]")
	public WebElement appleBook;
	
	@FindBy(xpath = "(//form/button)[3]")
	public WebElement microsoftBook;
	
	@FindBy(xpath = "(//form/button)[4]")
	public WebElement bayAreaBook;
	
	@FindBy(xpath = "(//form/button)[5]")
	public WebElement amazonBook;
	
	@FindBy(xpath = "(//form/button)[6]")
	public WebElement teslaBook;
	
	@FindBy(xpath = "(//form/button)[7]")
	public WebElement facebookBook;
	
	@FindBy(partialLinkText = "confirm")
	public WebElement bookingConfirmationButton;
	
	@FindBy(xpath = "//label[@class='checkbox']")
	public WebElement checkbox;
	
	
	
	
	
	
	
	
	
	
	
}
