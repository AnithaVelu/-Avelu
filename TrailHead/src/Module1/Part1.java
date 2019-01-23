package Module1;

import Module1.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.Desktop.Action;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;


public class Part1 
{
	public static XSSFWorkbook excelbook;
    public static XSSFSheet sheet1;
    public static XSSFSheet sheet2;
    public static XSSFRow row1;
    public static XSSFCell col;
    public static XSSFRow row2;
    public static XSSFCell col2;

    public static void main(String[] args) throws IOException, InterruptedException ,Exception
	{
        excelbook=new XSSFWorkbook("C://Users//anitha.velu//Desktop//Selenium//TrailHead//Trial.xlsx");
        sheet1=excelbook.getSheet("Login");
        row1=sheet1.getRow(1);
        col=row1.getCell(1);
        String url =col.getStringCellValue();
        System.out.println(url);
        
                                        
        row1=sheet1.getRow(1);
        col=row1.getCell(1);
        String value=col.getStringCellValue();
        System.out.println(value);
        
        row1=sheet1.getRow(1);
        col=row1.getCell(1);
        String value1=col.getStringCellValue();
        System.out.println(value1);
        
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe " );
        WebDriver driver = new ChromeDriver();
        driver.get(url);
 
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        driver.findElement(By.id("username")).sendKeys(value);
        driver.findElement(By.id("password")).sendKeys(value1);
        driver.findElement(By.id("Login")).click();
        Thread.sleep(3000);

	}
	
	
}



