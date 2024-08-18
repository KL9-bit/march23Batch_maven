package coverFoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {

	public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Reporter.log("taking screenshot",true);
		String TimeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		File dest = new File(System.getProperty("user.dir")+"\\screenShots\\"+ fileName+TimeStamp +".png");
		FileHandler.copy(src, dest);
		Reporter.log("saving file at loction"+dest,true);
		}
	
	public static String ReadDataFromExcel(String filepath, String sheetName, int rowNum, int CellNum) throws EncryptedDocumentException, IOException
	{
        FileInputStream myfile = new FileInputStream(filepath);
        Reporter.log("reading data from excel",true);
        String value = WorkbookFactory.create(myfile).getSheet(sheetName).getRow(rowNum).getCell(CellNum).getStringCellValue();
         return value;		
		
	}
	public static String readDataFromPropertiesFile(String key) throws IOException
	{
		FileInputStream myFile= new FileInputStream(System.getProperty("user.dir")+"\\fbTest.properties");
	    Properties prop = new Properties();
	    prop.load(myFile);
	    Reporter.log("reading data from property file" +key,true);
	    String value = prop.getProperty(key);
		return value;
	
	}	
}
