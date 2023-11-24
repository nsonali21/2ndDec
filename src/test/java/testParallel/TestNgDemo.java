package testParallel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo {
/*	@Test
	public void login() {
		System.out.println("login");
	}
*/
	@Test
	public void dash() {
		System.out.println("dash");
	}
	
	@Test
	public void user() {
		System.out.println("user");
	}
	
	@Test//not ready for execution
	public void add_user() {
		System.out.println("user");
	}
}
