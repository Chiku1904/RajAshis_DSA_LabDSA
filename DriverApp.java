package com.greatlearning.driver_app;

import java.util.Scanner;
import com.greatlearning.model.Expression;

public class DriverApp {

	public static void main(String[] args) {
		Expression exp= new Expression();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Expression: ");
		String input= sc.next();
		if(exp.checkExpression(input)) {
			System.out.println("The entered string has Balanced Brackets(It's Valid Expression)");
		}
		else {
			System.out.println("The entered string has Unbalanced Brackets(It's an Invalid Expression)");	
		}
	}
}
