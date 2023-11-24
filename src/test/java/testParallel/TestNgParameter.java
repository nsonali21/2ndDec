package testParallel;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameter {
	
	@Parameters({"Url","Name"})
	@Test
	public void login(String url,String name) {
		if(url.contains("https://www.amazon.in/")) {
			System.out.println(url);
			System.out.println(name);
		}
		if(url.contains("https://www.redbus.in/")) {
			System.out.println("redbus");
			System.out.println(url);
			System.out.println(name);
		}
		System.out.println("login");
	}

	/*
	 * @Test public void dash() { System.out.println("dash"); }
	 * 
	 * @Test public void user() { System.out.println("user"); }
	 * 
	 * @Test//not ready for execution public void add_user() {
	 * System.out.println("user"); }
	 */
}
