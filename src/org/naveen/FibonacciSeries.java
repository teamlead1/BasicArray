package org.naveen;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <=10; i++) {
			int c=a+b;
			System.out.println(c);
			//swaping the number for iteration
			a=b;
			b=c;
		}
	}

}
