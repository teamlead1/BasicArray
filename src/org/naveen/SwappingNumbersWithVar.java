package org.naveen;

import java.util.Scanner;

public class SwappingNumbersWithVar {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sw = new Scanner(System.in);
		System.out.println("the numbers are");
a=sw.nextInt();
b=sw.nextInt();
c=a;
a=b;
b=c;

System.out.println("swappingNumbersAre:");
System.out.println(a);
System.out.println(b);

	}

}
