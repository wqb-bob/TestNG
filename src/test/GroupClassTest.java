package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(groups = "database")
public class GroupClassTest {
	@Test
	@Parameters({ "dbconfig"})
	public void runSelenium1(String dbconfig) {
		System.out.println(dbconfig);
	}

	@Test(invocationCount=5)
	public void testConnectOracle() {
		System.out.println("runSelenium()2");
	}
}
