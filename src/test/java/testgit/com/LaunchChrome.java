package testgit.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchChrome {

	
	@Test
	public void searchBaidu(){
		System.out.println("准备开始");
		Assert.assertNotEquals(1,2);
		
	}
	@Test
	public void searchBaidu1(){
		System.out.println("准备开始");
		Assert.assertNotEquals(1,2);
		
	}
	@Test
	public void searchBaidu2(){
		System.out.println("准备开始");
		Assert.assertNotEquals(1,2);
		
	}
	@Test
	public void searchBaidu3(){
		System.out.println("准备开始");
		Assert.assertEquals(2,2,"我现在变成true");
		
	}

}
