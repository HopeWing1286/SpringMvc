package com.testfan.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.fail;

import org.testng.annotations.AfterClass;

public class TestNgTest {
	
  @Test(dependsOnMethods= {"b"})
  public void a() {
	  System.out.println("a");
	  fail("Not yet implemented");
  }
  
  @Test
  public void b() {
	  System.out.println("b");
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
