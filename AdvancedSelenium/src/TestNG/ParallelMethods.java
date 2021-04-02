package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

    public class ParallelMethods {

			@Test
			public void runChrome1()
			{
				
				new ChromeDriver();
			}
			
			@Test
			public void runChrome2()
			{
				new ChromeDriver();
			}
			
			@Test
			public void runChrome3()
			{
		
				new ChromeDriver();
			}
		}
	


