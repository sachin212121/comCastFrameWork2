package com.crm.comcast.organizationTest;

import org.testng.annotations.Test;

public class CreateModDelOrgTest {

	
	@Test(groups="smoke")
	
	public void createOrgTest() {
		
		System.out.println("organization is created");
		String brow = System.getProperty("browser");
		String URL=System.getProperty("url");
		System.out.println(brow);
		System.out.println(URL);
		
	}

    @Test (groups="regression")
    public void modifyOrgTest() {
	
	System.out.println("organization is modified");
    }
     
    @Test(groups="regression")
    public void delOrgTest() {
    	
    	System.out.println("organization is deleted");
    }
    
}