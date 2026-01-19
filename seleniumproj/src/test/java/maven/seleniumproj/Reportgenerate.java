package maven.seleniumproj;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportgenerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentReports exrep=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("deee.html");
		spark.config().setTheme(Theme.DARK);
		exrep.attachReporter(spark);
		
		ExtentTest test=exrep.createTest("Login page");
		test.pass("Test is pass");
		test.fail("Test is fail");
		exrep.flush();

	}

}
