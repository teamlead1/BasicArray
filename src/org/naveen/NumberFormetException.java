package org.naveen;

public class NumberFormetException {

	public static void main(String[] args) {
		
		String s = "1234";
		System.out.println(s+5);
		int i= Integer.parseInt(s);
		System.out.println(i+5);
		String s1="123abc456";
		System.out.println(s1+9);
		int j= Integer.parseInt(s1);
		System.out.println(j+5);
		

	}

}
