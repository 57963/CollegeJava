package com.as.cs.exercises;

public class Calc {
	private static float num1;
	private static float num2;
	Calc(float num1, float num2){
		Calc.num1 = num1;
		Calc.num2 = num2;
	}
	public static float getNum1() {
		return num1;
	}
	public static void setNum1(float num1) {
		Calc.num1 = num1;
	}
	public static float getNum2() {
		return num2;
	}
	public static void setNum2(float num2) {
		Calc.num2 = num2;
	}
}
