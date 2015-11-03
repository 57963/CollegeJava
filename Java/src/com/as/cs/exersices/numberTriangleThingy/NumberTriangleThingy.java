package com.as.cs.exersices.numberTriangleThingy;

import java.util.Scanner;

public class NumberTriangleThingy {
	static Scanner keyboard = new Scanner(System.in);
	static int input;
	static int count;
	public static void main(String[] args){
		input = keyboard.nextInt();
		for(int i = 1; i<=input; i++){
			for(int u = 0; u<i;u++){
				count++;
				System.out.print(count + " ");
			}
			System.out.println("");
		}
	}
}
