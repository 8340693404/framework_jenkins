package pac2;

import org.testng.annotations.Test;

public class orgTest {
	@Test
	public void createorgTest()
	{
		System.out.println("execute ");
	}
	@Test
	public void modifyorgTest()
	{
		System.out.println("modify ");
	}
	@Test
	public void byeorgTest()
	{
		System.out.println("byee ");
	}
	@Test
	public void hiiorgTest()
	{
		System.out.println("hello");
	}
	@Test
	public void addorgTest()
	{
		String BROWSER =System.getProperty("browser");
		String URL =System.getProperty("url");
		String USERNAME =System.getProperty("username");
		String PASSWORD =System.getProperty("password");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	
	
	
	
	

}
