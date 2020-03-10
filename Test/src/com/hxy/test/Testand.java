package com.hxy.test;

public class Testand {
	public static void main(String[] args) {
		int a = 1;
		
		if(a == 2 &&a++ == 1) {
			System.out.println("&&"+a);
			
			
		}
		if(a == 2 &a++ == 1) {
			System.out.println("&"+a);
		}
		System.out.println(a);
	}
}
