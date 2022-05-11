package com.crm.comcast.campaignTest;

import org.testng.annotations.Test;

public class CreateModDelCampTest {
	
	@Test(groups="smoke")
	
	public void createCampTest() {
		
		System.out.println("campaign is created");
		
	}

    @Test (groups="regression")
    public void modifyCampTest() {
	
	System.out.println("campaign is modified");
    }
     
    @Test(groups="integration")
    public void delCampTest() {
    	
    	System.out.println("campaign is deleted");
    }
    
}


