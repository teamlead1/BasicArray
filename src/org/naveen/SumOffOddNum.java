package org.naveen;

public class SumOffOddNum {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i<=100; i++) {
			//odd
			if (i%2==1) {
				count=count+i;
					
			}
			// even
			else if (i%2==0) {
				count=count+i;
			}
		}
System.out.println(count);
	}

}
