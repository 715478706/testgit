package testgit.com;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngTest {

	
	@BeforeClass
	public void searchBaidu1(){
		System.out.println("@BeforeClass开始");
		Assert.assertNotEquals(1,2);
		
	}
	@BeforeSuite
	public void searchBaidu(){
		System.out.println("@BeforeSuite开始");
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
	@Test
	public void searchBaidu4(){
		System.out.println("准备开始");
		Assert.assertEquals(2,2,"我现在变成true");
		
	}
}
