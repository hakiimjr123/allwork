package com.qa.quickstart.BlackjactTesting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BlackJackTests {
	@Parameters
	public static Collection<Object[]>data(){
		return Arrays.asList(new Object[][] {{18,21,21},{20,18,20},{20,20,20},{11,12,12}});
	
	}

	private int input;
	private int input2;
	private int expected;
	
	
	
	public BlackJackTests(int input, int input2, int expected) {
		this.input = input;
		this.input2 = input2;
		this.expected = expected;
		
		
	}
	
	
	@Test
	public void test() {
		assertEquals(expected, blkmain.blackJack(input, input2));
	}
}
	
	
	
	
	
	
	//@Test
	//public void test() {
		
		
		
		
		
		
		
		
		
		
		
	//assertEquals(21, blkmain.blackJack(18, 21));
	//assertEquals(20, blkmain.blackJack(20, 18));
	//assertEquals(20, blkmain.blackJack(20, 20));
	
