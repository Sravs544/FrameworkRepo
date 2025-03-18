package ContactModuleTest;

import org.testng.annotations.Test;

public class CreatecontactTest {

	@Test
	
	public void contactTest() {
		
		
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
       System.out.println("execute contact Test");
	}
	
@Test
	
	public void ModifycontactTest() {
		
		System.out.println("execute modify contact Test");
	}

}
