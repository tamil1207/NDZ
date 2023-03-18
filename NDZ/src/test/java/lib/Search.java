package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	public Search(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement  searchButtonWebElemnt;

	
	//WebElement Se =driver.find(by.id(xx));
public WebElement getSearchButtonWebElemnt() {
	return searchButtonWebElemnt;
}

}
