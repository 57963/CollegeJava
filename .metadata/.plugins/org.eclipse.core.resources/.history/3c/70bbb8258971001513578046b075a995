package com.as.cs.exercises.calc;
import java.util.*;

public class CalcController {
	private static float num1;
	private static float num2;
	public enum Op{
		MULTIPLY, DIVIDE, ADD, SUBTRACT
	}
	private static Op op;
	private static String opString;
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Operation: ");
		opString = keyboard.next();
		
		switch(opString){
		case "multiply": op = Op.MULTIPLY; break;
		case "Multiply": op = Op.MULTIPLY; break;
		case "MULTIPLY": op = Op.MULTIPLY; break;
		case "*": op = Op.MULTIPLY; break;
		case "mult": op = Op.MULTIPLY; break;
		case "add": op = Op.ADD; break;
		case "Add": op = Op.ADD; break;
		case "ADD": op = Op.ADD; break;
		case "+": op = Op.ADD; break;
		case "subtract": op = Op.SUBTRACT; break;
		case "Subtract": op = Op.SUBTRACT; break;
		case "SUBTRACT": op = Op.SUBTRACT; break;
		case "minus": op = Op.SUBTRACT; break;
		case "Minus": op = Op.SUBTRACT; break;
		case "MINUS": op = Op.SUBTRACT; break;
		case "-": op = Op.SUBTRACT; break;
		case "sub": op = Op.SUBTRACT; break;
		case "divide": op = Op.DIVIDE; break;
		case "Divide": op = Op.DIVIDE; break;
		case "DIVIDE": op = Op.DIVIDE; break;
		case "/": op = Op.DIVIDE; break;
		case "div": op = Op.DIVIDE; break;
		}
		
		System.out.print("First Number: ");
		num1 = keyboard.nextFloat();
		System.out.print("Second Number: ");
		num2 = keyboard.nextFloat();
		
		Calc calculator = new Calc(num1, num2, op);
	}
	
	
}
