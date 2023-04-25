package com.greatlearning.model;

import java.util.Stack;

public class Expression {

	static Stack<Character> stack= new Stack<>();
	
	public static boolean checkExpression(String input) {
		Stack<Character> stack= new Stack<>();
		for( char k: input.toCharArray()) {
			if(k== '{' || k=='[' || k=='(') {
				stack.push(k);
				continue;
			}
			if(stack.isEmpty()) {
				return false;
			}
			
			char z;
			switch(k) {
			
			               case '}':       z= stack.pop();
			                               if(z=='[' || z=='(') 
			                            	   return false;
			                               break;
			                               
			               case ']':       z= stack.pop();
                                           if(z=='{' || z=='(') 
                        	                   return false;
                                           break;
                                           
			               case ')':       z= stack.pop();
                                           if(z=='[' || z=='{') 
                        	                   return false;
                                           break;
			}
			
		}
		return(stack.isEmpty());
	}
}
