package org.naveen;

public class CountOfOddNumb {

	public static void main(String[] args) {
		
		int count = 0 ;
		
		for (int i = 0; i < 50; i++) {
			//odd number 
			//if (i%2==1)
			//even number
			if(i%2==0){
				count=count+1;
			}
	
		}
		System.out.println(count);
	}

}
