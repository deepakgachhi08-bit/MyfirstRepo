package maven.seleniumproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabswtich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://demowebshop.tricentis.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.gmail.com/");
		
		Object[] originalurl = driver.getWindowHandles().toArray();
		driver.switchTo().window((String) originalurl[1]);
		driver.close();
		
	}

}
