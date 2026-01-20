package maven.seleniumproj;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cowin.gov.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='yellowloginbtn accessibility-plugin-ac']")).click();
		Set<String> windowhandels=driver.getWindowHandles();
		Iterator<String> iterator=windowhandels.iterator();
		String Orgwin=iterator.next();
		String Nxtwin=iterator.next();
		driver.switchTo().window(Nxtwin);
		driver.findElement(By.xpath("//input[@data-placeholder='Enter your mobile number']")).sendKeys("1234");
		
		
	}

}
