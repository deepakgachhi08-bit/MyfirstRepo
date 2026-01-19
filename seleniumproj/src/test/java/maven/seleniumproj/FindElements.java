package maven.seleniumproj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cowin.gov.in/");
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		/*for(int i=0;i<=links.size();i++)
		{
			WebElement link= links.get(i);
			String linktext= link.getText();
			String href= link.getAttribute("href");
			System.out.println("linktext is =" + linktext + "href is =" + href + "link =" + link);
			
		}*/
		WebElement link= links.get(5);
		System.out.println(link);
		System.out.println(link.getText());
		System.out.println(link.getAttribute("href"));
		
		
		
	}

}
