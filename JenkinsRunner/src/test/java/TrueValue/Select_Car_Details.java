package TrueValue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import TrueValuePLP.ProductLiSting_Page;

public class Select_Car_Details extends ProductLiSting_Page {

	static WebDriver driver;

	@FindBy(id = "select2-cust_model1-container")
	static WebElement selectModel;

	@FindBy(id = "select2-cust_budget-container")
	static WebElement selectBudget;

	@FindBy(id = "select2-cust_city-container")
	static WebElement selectCity;

	@FindBy(className = "select2-search__field")
	static WebElement selectfiled_City;
	
	@FindBy(id = "buysearchButton")
	static WebElement searchButton;

	
	
	public Select_Car_Details(WebDriver IDriver) {
		 super(IDriver);
		this.driver = IDriver;
	}

	FileInputStream fi;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public void Select_Car_Details_For_Suitable_Checking() throws IOException {
		// give a Path for file
		fi = new FileInputStream("C:\\Users\\hp\\Downloads\\Model Select.xlsx");

		// create a workbook
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheetAt(0);

		int number = sheet.getLastRowNum();
		String[][] storing = new String[number][3];

		for (int i = 1; i <= number; i++) {
			int cellCount = sheet.getRow(i).getLastCellNum();
			for (int j = 0; j < cellCount; j++) {

				String getdata = sheet.getRow(i).getCell(j).getStringCellValue();
				storing[i - 1][j] = getdata;
			}
			Car_details(storing[i - 1][0], storing[i - 1][1], storing[i - 1][2]);
		}

	}

	public static void Car_details(String model, String budget, String city) throws IOException {

		selectModel.click();
		WebElement ele_model = driver.findElement(By.className("select2-search__field"));
		ele_model.sendKeys(model);
		ele_model.sendKeys(Keys.ENTER);

		selectBudget.click();
		WebElement ele_budget = driver.findElement(By.className("select2-search__field"));
		ele_budget.sendKeys(budget);
		ele_budget.sendKeys(Keys.ENTER);

		selectCity.click();
		WebElement ele_city = driver.findElement(By.className("select2-search__field"));
		ele_city.sendKeys(city);
		ele_city.sendKeys(Keys.ENTER);

		//searchButton.click();

		/*
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 * 
		 * ProductLiSting_Page.clickoncity_filed(); String[] Lo =
		 * ProductLiSting_Page.getLocation();
		 */
		
		/*
		 * for(int i=0;i<Lo.length;i++) { selectfiled_City.sendKeys(Lo[i]);
		 * 
		 * break; }
		 */
		
	}

}
