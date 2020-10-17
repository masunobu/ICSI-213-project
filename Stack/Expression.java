package project3;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Display all components of 24-point game. The components are a refresh button, a panel with four labels with card 
 * image icons, a text field for an expression, and a verify button.
 * @author Naganobu Masuda
 * @version 1.0
 */

public class Expression {
	
	/**
	 * the content of this Infix expression
	 */
	private String infix;
	
	public Expression(){
	}
	
	public Expression(String infix){
		this.infix = infix;
	}
	
	/**
	 * converts this Infix expression to an equivalent Postfix expression, 
	 * returns a Postfix expression as a list of tokens
	 */
	public ArrayList<String> infixToPostfix(){
		ArrayList<String> inFix = new ArrayList<String>();
		ArrayList<String> postFix = new ArrayList<String>();
		GenericStack<String> stack = new GenericStack<String>();
		
	    /**
		 * prints Infix expression while ()+-/* are taken as delimiters
		 */
		StringTokenizer tokens = new StringTokenizer(this.infix, "()+-/*", true);
	    while(tokens.hasMoreTokens()){
	    	inFix.add(new String(tokens.nextToken()));
	    }
		System.out.println("Infix Expression is: " + inFix);
		
		for(String ch :inFix){
			if(operator(ch) == 0 && !(ch.equals("(")) && !(ch.equals(")"))){
				postFix.add(ch);
			}else if(ch.equals("(")){
				stack.push(ch);
			}else if(operator(ch) == 1 || operator(ch) == 2 || ch.equals(")")){
				if(stack.isEmpty()){
					stack.push(ch);
				}else{
					if(operator(stack.peek()) >= operator(ch) && !(ch.equals(")"))){
						String str = stack.pop();
						postFix.add(str);
						stack.push(ch);
					}else if(operator(stack.peek()) < operator(ch)){
						stack.push(ch);
					}else if(ch.equals(")")){
						while(!(stack.peek().equals("("))){
							String str = stack.pop();
							postFix.add(str);
						}stack.pop();
					}
				}
			}
		}
		while(!stack.isEmpty() && !(stack.peek().equals("("))){
			String strRest = stack.pop();
			postFix.add(strRest);
		}
	    /**
		 * prints Postfix expression
		 */
		System.out.println("Postfix Expression is: " + postFix);
		return postFix;
    }
	
    /**
	 * returns values for operators to convert Infix expression into Postfix expression and evaluate.
	 */
	public int operator(String item){
		if(item.equals("+") || item.equals("-")){
			return 1;
		}else if(item.equals("*") || item.equals("/")){
			return 2;
		}else{
			return 0;
		}
	}
	
    /**
	 * evaluates the Postfix expression, and returns the result. 
	 */
	public int evaluate(){
		GenericStack<Integer> stack = new GenericStack<Integer>();
		
		ArrayList<String> str = infixToPostfix();
		for(int i = 0; i < str.size(); i++){
			String substr = str.get(i);
			if(operator(substr) == 0){ 
				int num = Integer.parseInt(substr);
				stack.push(num);
			}else{
				int x = stack.pop();
				int y = stack.pop();

				if (substr.equals("+")) {
					stack.push(y + x);
				}
				else if (substr.equals("-")) {
					stack.push(y - x);
				}
				else if (substr.equals("*")) {
					stack.push(y * x);
				}
				else if (substr.equals("/")) {
					stack.push(y / x);
				}
			}
		}
	    /**
		 * prints result being pushed in Postfix expression
		 */
		System.out.println("Result is: " + stack.peek());
		return stack.pop();
	}
}