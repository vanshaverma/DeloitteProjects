package com.deloitte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double num1=0, num2=0, result=0;
		char c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		try {
		num1 = scan.nextDouble();
		}catch(InputMismatchException e){
			System.out.println("NumberFormatException: 1st Number - Please enter numeric only");
			return;
		}
		
		System.out.println("Enter 2nd number:");
		try{
			num2 = scan.nextDouble();
		}catch(InputMismatchException e){
			System.out.println("NumberFormatException: 2nd Number - Please enter numeric only");
			return;
		}
		
		System.out.println("Choose operation(+,-,/,*,&,=):");
		c = scan.next().charAt(0);
		
		switch(c)
		{
		case '+': 
			result = num1+num2;
			System.out.println(num1+ " + " + num2 + " = " + result);break;
			
		case '-':
			result = num1-num2;
			System.out.println(num1+ " - " + num2 + " = " + result);break;
			
		case '/':{ 
			if(num2==0) throw new ArithmeticException("Cannot divide by Zero");
			else {
			result = num1/num2;
			System.out.println(num1+ " / " + num2 + " = " + result);}break;
		}
			
		case '*':
			result = num1*num2;
			System.out.println(num1+ " * " + num2 + " = " + result);break;
			
		case '&':
			result = (int)num1&(int)num2;
			System.out.println(num1+ " & " + num2 + " = " + result);break;
				
		case '=':
			if(num1==num2)
				System.out.println(num1+ " == " + num2);
			else if(num1> num2)
				System.out.println(num1+ " > " + num2);
			else
				System.out.println(num1+ " < " + num2);break;
		default:
			System.out.println("Invalid Operator: Please select a valid operator");break;
			}
		
	}
}
