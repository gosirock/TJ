package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		for(int n1 = 2; n1 <= 9; n1 += 1) {
			System.out.println(n1 + "단!");
			for(int n2 = 1; n2 <= 9; n2++) {
				System.out.println(n1 + "x" + n2 + "=" + (n1 * n2));
				
			}
			System.out.println();
		}
		
	}

}
