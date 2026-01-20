package maven.seleniumproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_name_locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("hello@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("password");
		
		//absolute xpath
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		//relative xpath
	     driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}

// relativexpath syntax //tagname[@attribute="value"]
//relative xpath //input[@value="Log in"] or cant find 