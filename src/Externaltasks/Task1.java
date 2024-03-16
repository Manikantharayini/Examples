package Externaltasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\LiveTech Selenium Software\\Browsers\\chromedriver-win32\\chromedriver.exe");
	    ChromeOptions options=new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    WebDriver  driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.ironspider.ca/forms/presentation.htm");
        driver.findElement(By.id("name_id")).sendKeys("manikantha");
        driver.findElement(By.id("email_id")).sendKeys("r.manikantha123@gmail.com");
        driver.findElement(By.id("comments_id")).sendKeys("i do have 4 years of software testing experience in both manual and automaton testing");
	
        
    List<WebElement>checkboxes=    driver.findElements(By.xpath("//input[@type='checkbox']"));
   System.out.println("total no of checkboxes is : " +checkboxes.size());
    
    for(WebElement chbox:checkboxes) {
    	String checkboxname=chbox.getAttribute("value");
    	if(checkboxname.equals("sausage") ||checkboxname.equals("pizza")) {
    		chbox.click();
    	}
    }
    
	driver.findElement(By.xpath("//input[@value='heavy']")).click();
	driver.findElement(By.xpath("//option[@value='donut']")).click();
	driver.findElement(By.xpath("//option[@value='honey']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	
	System.out.println("Employee only message is displayed sucessfully");
	}

}
