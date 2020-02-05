package cucumberStepsDefination;


import googleAutomationTest.Generic;

public class TestClass {
	Generic genericInstance;

	//@Test
	public void test() {
		genericInstance = Generic.getInstance();
		genericInstance.browser();
		genericInstance.getGooglePage().maximizeWindow();
		genericInstance.getGooglePage().url();
		System.out.println(genericInstance.getGooglePage().getTextAbout());
		genericInstance.close();
}
	
	

}
