package TrueValuePLP;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductLiSting_Page {

	@FindBy(id = "select2-mySelect2-container")
	static WebElement Select_InterbalCity;
	
	@FindBy(xpath = "//body/div[4]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]/span[1]/span[1]")
	static WebElement click_on_city;
	

	
	static WebDriver driver;
	
	public ProductLiSting_Page(WebDriver I2Driver)
	{
		this.driver = I2Driver;
	}
	
	 
	public static void clickoncity_filed()
	{
		click_on_city.click();
	}
	
	public static String[] getLocation() throws IOException
	{
		
		String[] a = ReadingFIlrs_forCity.read();
		
		return a;
		
	}
	
}
