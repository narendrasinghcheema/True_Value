package Runner;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TrueValue.Select_Car_Details;
import Browser.Select_Browser;

public class TrueValue_Runner {

	WebDriver driver;
	Select_Car_Details obj1;
	
	@BeforeTest
	public void Open()
	{
		driver = Select_Browser.select("Firefox", "https://www.marutisuzukitruevalue.com");
	}
	
	@Test
	public void Home_Page() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		obj1 = PageFactory.initElements(driver, Select_Car_Details.class);
		obj1.Select_Car_Details_For_Suitable_Checking();
	}
}
