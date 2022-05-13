package com.crm.comcast.organizationTest;

import org.testng.annotations.Test;

public class CreateModDelOrgTest {

	
	@Test(groups="smoke")
	
	public void createOrgTest() {
		
		System.out.println("organization is created");
		String brow = System.getProperty("browser");
		System.out.println(brow);
    	String Ulink=System.getProperty("url");
		System.out.println(Ulink);
		
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