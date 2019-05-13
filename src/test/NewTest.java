package test;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeGroups("database")
	public void setupDB() {
		System.out.println("setupDB()");
	}

	@AfterGroups("database")
	public void cleanDB() {
		System.out.println("cleanDB()");
	}

	@Test(groups = "selenium-test")
	public void runSelenium() {
		System.out.println("runSelenium()");
	}

	@Test(groups = "selenium-test")
	public void runSelenium1() {
		System.out.println("runSelenium()1");
	}

	@Test(groups = "database") //同组根据方法面来执行！！！
	public void testConnectOracle() {
		System.out.println("runSelenium()2");
	}

	@Test(groups = {"database","selenium-test"})
	public void testConnectMsSQL() {
		System.out.println("testConnectMsSQL");
	}

	/**
	 *  依赖关系   有一个有问题 就不支持
	 */
	@Test(dependsOnGroups = {"database", "selenium-test" })
	public void runFinal() {
		System.out.println("runFinal");
	}
}
