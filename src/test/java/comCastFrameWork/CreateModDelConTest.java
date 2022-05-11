package comCastFrameWork;

import org.testng.annotations.Test;

public class CreateModDelConTest {

    @Test(groups="smoke")
	
	public void createConTest() {
		
		System.out.println("contact is created");
		String brow = System.getProperty("browser");
		System.out.println(brow);
		
	}

    @Test (groups="regression")
    public void modifyConTest() {
	
	System.out.println("contact is modified");
    }
     
    @Test(groups="regression")
    public void delConTest() {
    	
    	System.out.println("contact is deleted");
    }
    


}


