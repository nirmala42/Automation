package TestNG;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class GroupingExecution {

		@Test(groups = "smokeGrp")
		public void createCust()
		{
			Reporter.log("Smoke1",true);
		}
		
		@Test(groups = "FTgrp")
		public void validCustNameTB()
		{
			Reporter.log("FT1",true);
		}
		
		
		@Test(groups = "ITgrp")
		public void verifyCustInList1()
		{
			Reporter.log("IT1",true);
		}
		
		@Test(groups = "FTgrp")
		public void InvalidCustNameTB()
		{
			Reporter.log("FT2",true);
		}
		
		
		@Test(groups = "ITgrp")
		public void verifyCustInList2()
		{
			Reporter.log("IT2",true);
		}
		
		@Test(groups = "smokeGrp")
		public void createProj()
		{
			Reporter.log("Smoke2",true);
		}
		
		@Test(groups = "smokeGrp")
		public void createTask()
		{
			Reporter.log("Smoke3",true);
		}
		
		
		
		
	}

