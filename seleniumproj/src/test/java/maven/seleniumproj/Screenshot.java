package maven.seleniumproj;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cowin.gov.in/");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File("C:\\Users\\GachhiDe\\eclipse-workspace\\seleniumproj\\newfolder\\dd.jpg");
		sourcefile.renameTo(targetfile);
		driver.quit();
		

	}

}
