package org.naveen;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBond {
	public static void main(String[] args) {
		List<Integer> ex = new ArrayList<Integer>();
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(50);
		System.out.println(ex.get(2));
		System.out.println(ex.get(20));
	}

}
