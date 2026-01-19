package maven.seleniumproj;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstscript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev/");
		//driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		//driver.close();
		//System.out.println(driver.getCurrentUrl());
		//Thread.sleep(3000);
		//System.out.println("pagesource:"+driver.getPageSource());
		//Thread.sleep(3000);
		//System.out.println("pagetitle:"+driver.getTitle());
		//Thread.sleep(3000);
		//driver.close();
		
		Object[] originalTab = driver.getWindowHandles().toArray();
		//Object[] originalTab = driver.getWindowHandles().toArray();
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//driver.switchTo().window(originalTab);
		driver.switchTo().window((String) originalTab[2]);
		Thread.sleep(3000);
		//driver.switchTo().window(originalTab);
		driver.close();
		
	}}


