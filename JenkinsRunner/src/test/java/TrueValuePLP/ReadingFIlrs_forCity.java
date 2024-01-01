package TrueValuePLP;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFIlrs_forCity {

	public static String[] read() throws IOException
	{
		String[] s = new String[4];
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\Downloads\\City select.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int number = sheet.getLastRowNum();
		for(int i=1;i<=number;i++)
		{
			String data = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data = "+data);
			
			s[i-1] = data;
		}
		System.out.println("s = "+s.length);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("s = "+s[i]);
		}
		return s;
		
	}
}
