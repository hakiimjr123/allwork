package com.qa.quickstart.BlackjactTesting;

public class blkmain {

public static void main(String[] args)
	
	{
		System.out.println(blackJack(18,21));
		System.out.println(blackJack(20,18));
		System.out.println(blackJack(20,20));
		System.out.println(blackJack(22,21));
	}

public static int blackJack(int a, int b) {
	int c=0;	
		if ( (21-a) < (21-b) ) { 
		c=a;
		}
		else if(a==b) {
		c=b;
		}
		else if ((21-b) < (21-a)) {
			c=b;
		}
		else {
			
		c=0;
		}
		return c;
	}
}
