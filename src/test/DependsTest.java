package test;

import org.testng.annotations.Test;

public class DependsTest {
  @Test
  public void f() {
	  System.out.println(1/0);
  }
  @Test(dependsOnMethods="f")
  public void m(){
	  System.err.println("233456");
  }
}