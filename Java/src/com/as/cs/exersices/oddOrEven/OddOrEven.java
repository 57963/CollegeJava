package com.as.cs.exersices.oddOrEven;

import java.util.Scanner;

public class OddOrEven {
	static Scanner keyboard = new Scanner(System.in);
	static int input;
	public static void main(String args[]){
		System.out.print("Input Number : ");
		input = keyboard.nextInt();
		System.out.print((input%2 == 0) ? "Even":"Odd");
	}
	
}