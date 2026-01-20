package maven.seleniumproj;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.cowin.gov.in/");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		for (int i=0;i<=link.size();i++)
		{
		WebElement tag=link.get(i);
		System.out.println(tag.getAttribute("href"));
		System.out.println(tag.getText());
		System.out.println(tag);
		}
		
		
		
		
		
		
	}

}
