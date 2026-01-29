package maven.seleniumproj;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		/*System.out.println(driver.manage().getCookies());
		driver.manage().addCookie(new Cookie("Anil","Deepak"));
		System.out.println(driver.manage().getCookies());
		driver.manage().deleteAllCookies();
		System.out.println(driver.manage().getCookies());*/
		driver.manage().getCookies();
		//System.out.println(cok);
		driver.manage().addCookie(new Cookie("Deepak","Hi"));
		System.out.println(driver.manage().getCookies());
		driver.manage().deleteAllCookies();
		System.out.println(driver.manage().getCookies());
	}

}
