package com.as.cs.exersices.isPrime;

import java.util.Scanner;

public class IsPrime {
	static Scanner keyboard = new Scanner(System.in);
	static float input;
	static boolean prime = true;
	public static void main(String[] args) {
		System.out.print("Input Number : ");
		input = keyboard.nextInt();
		for(float i = 2;i<input-1;i++){
			if((int)input/i == input/i){
				prime = false;
				System.out.println("error"+input/i);
			}
			System.out.println(input/i);
		}
		System.out.print(prime);
	}
}
