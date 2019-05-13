package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import javaCode.HelloWorld;

public class HelloWorldTest {

	/**
	 * 测试断言
	 */
	@Test
	public void testEmail() {
		Assert.assertEquals("1724083357@qq.com", new HelloWorld().email());
	}

	/**
	 * 测试异常
	 */
	@Test(expectedExceptions = ArithmeticException.class)
	public void testHelloWorld() {
		new HelloWorld().sayHello();
	}

	/**
	 * 测试忽略
	 */
	@Test(enabled = false) // 与junit 忽略有所不同
	public void testsay() {
		new HelloWorld().say();
	}

	/**
	 * 测试超时
	 */
	@Test(timeOut = 3000)
	public void testTimeOut() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
