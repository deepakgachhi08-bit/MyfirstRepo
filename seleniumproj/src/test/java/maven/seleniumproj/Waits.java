package maven.seleniumproj;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//Thread.sleep(3000);
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		Wait<WebDriver> wait=new FluentWait<>(driver)
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(1))
			.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[@onclick='jsAlert()']"))));
		System.out.println("This is visible");
		//driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		//Alert myalert=driver.switchTo().alert();
		//myalert.accept();

	}

}
