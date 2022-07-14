package com.flipkart;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Mobiles {
	
	static long start;
	
	@BeforeClass
	public static void browserLaunch() {
	System.out.println("browserLaunch");	
		
	}
	
	@AfterClass
	public static void browserQuit() {
		System.out.println("browserQuit");
		
		
	}
	
	@Before
	public void startingTime(){		
		System.out.println("Before");
	 start =	System.currentTimeMillis();
	}
	
//	@After
	public void endTime(){
	long end = System.currentTimeMillis();
	System.out.println("Time taken is :"+(end-start));	
}	
	@Test
	public void methodA() {
		System.out.println("methodA");
		}
	
	@Test
	public void methodB() {
		System.out.println("methodB");
		}
	@Ignore
	@Test
	public void methodC() {
		System.out.println("methodC");
		}
	
	@Test
	public void methodD() {
		System.out.println("methodD");
		}
	
	@Test
	public void methodE() {
		System.out.println("methodE");
		}

}
