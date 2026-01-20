package maven.seleniumproj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert myalert=driver.switchTo().alert();
		myalert.accept();
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert myalert1=driver.switchTo().alert();
		myalert1.dismiss();
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert myalert2=driver.switchTo().alert();
		//System.out.println("hi");
		Thread.sleep(3000);
		myalert2.sendKeys("hello");
		myalert2.accept();
		
		
	}

}
