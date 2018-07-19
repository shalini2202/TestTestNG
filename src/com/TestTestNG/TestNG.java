package com.TestTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeTest
	public void a() {	
		System.out.println("before test");
	}
	
	@Test
	public void b() {	
		System.out.println("test");
	}
	
	@AfterTest
	public void c() {	
		System.out.println("after test");
	}
}
