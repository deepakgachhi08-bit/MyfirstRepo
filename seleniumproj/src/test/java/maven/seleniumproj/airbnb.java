package maven.seleniumproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class airbnb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airbnb.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div/div/div[1]/div[3]/div[1]/div/div/header/form/div[1]/div/div[2]/div[3]/button/div")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div/div/div/div[2]/header/div/div/div/div/nav/div[2]/div/button/span")).click();
		//Start your search
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Log in or sign up']")).click();

	}

}
