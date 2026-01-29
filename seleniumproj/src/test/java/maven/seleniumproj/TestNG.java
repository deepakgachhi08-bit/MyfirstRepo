package maven.seleniumproj;

import org.testng.annotations.Test;

public class TestNG {
	
	@Test(priority=4)
	void testcase() {
		System.out.println("First Test case");
	}
	
	@Test(groups="Test")
	void testcase1()
	{
		System.out.println("second Test case");
	}

	@Test(priority=2)
	void testcase2()
	{
		System.out.println("3rd Test case");
	}
	
	@Test(invocationCount=5)
	void testcase3()
	{
		System.out.println("4th Test case");
	}
}
