package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage extends BasePage{
	
WebDriver driver;

	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOAR_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement LIST_CUSTOMER_ELEMENT;
	
	
	public void verifyDashboardPage() {
		Assert.assertEquals(DASHBOAR_HEADER_ELEMENT.getText(), "Dashboard", "Wrong Page!!!");
	}
	
	public void clickCustomerButton() {
		CUSTOMER_ELEMENT.click();
	}
	
	public void clickAddCustomerButton() {
		ADD_CUSTOMER_ELEMENT.click();
		
	}
	
	public void clickListCustomerButton() {
		
		LIST_CUSTOMER_ELEMENT.click();
	}

}
