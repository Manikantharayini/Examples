package listofcheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Find_Particular_checkbox_in_lost {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\LiveTech Selenium Software\\Browsers\\chromedriver-win32\\chromedriver.exe");
	    ChromeOptions options=new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    WebDriver  driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
       //select specific checkbox
        //driver.findElement(By.xpath("//input[@value='orange']")).click();
        //select all the check boxes
        
     List<WebElement> checkboxes=   driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	System.out.println("total no of checkboxes : " +checkboxes.size());
	//using forloop to select all checkboxes
	
	/*for(int i=0;i<=checkboxes.size();i++) {
		checkboxes.get(i).click();
	}
	*/
	
	//select multiple checkboxes by choice
	
/*	for(WebElement chbox:checkboxes) {
		String checkboxname=chbox.getAttribute("value");
		if(checkboxname.equals("yellow") || checkboxname.equals("purple")) {
			chbox.click();
		}
	}
	*/
	//select last 2 checkboxes
	int totalcheckboxes=checkboxes.size();
	for(int i=totalcheckboxes-3;i<totalcheckboxes;i++) {
		checkboxes.get(i).click();
	}
	}

}
