package cn.tjuscs.st;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.TestResult;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestBill {
	private int x;
	private boolean y;
	private Bill bill = null;
	
	public TestBill(int x, boolean y){
		this.x = x;
		this.y = y;
		
	}
	
	@Parameters
	public static Collection getData(){
		return Arrays.asList(new Object[][]{
						  {1,true},
						  {3,true},
						  {5,true},
						  {7,true},
						  {8,true},
						  {11,true},
						  {14,false},
						  {21,true},
						  {30,true},
						  {53,true},
						  {100,false}});
		
	}
	
	@Before
	public void setUp(){
		bill = new Bill();
	}

	@Test
	public void testBill() {
		
		assertEquals(this.y,bill.cash(x));

	}
	
	@AfterClass
	public static void testResult(){
		
		System.out.println();
	}
	

}
