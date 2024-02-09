package com.kn.exceptionalone;

import java.util.Scanner;

public class divideExpectionalHandling {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("calculator application has started");
		System.out.println("enter numerator and denominator=");
		int a=scan.nextInt();
		int b=scan.nextInt();
		double c=0.0;
		try {
			c=a/b;
		}
		catch(ArithmeticException e){
			System.out.println("exception handled successfully");
		}
		System.out.println(c);
		System.out.println("calculator application has terminated succesfully");
		

	}

}
