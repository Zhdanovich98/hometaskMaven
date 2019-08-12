package com.zhdanovich;

import java.util.ArrayList;

import com.zhdanovich.exception.SizeArrayOnlyThree;

public class Main {

	//list for work with arguments
	ArrayList<String> valueList = new ArrayList<String>(); 
	
	//operation result calculation method

	public double resultOperation() {	
		try {
			double a = Double.parseDouble(valueList.get(0));
		String operation = valueList.get(1);
		double b =  Double.parseDouble(valueList.get(2));
		double c;
		
			switch (operation) {
			case "+": 
				c=a+b;
				return c;
			case "-": 
				c= a-b;
				return c;
			case "/": 
				c= a/b;
				return c;
			
				default:
					System.out.println("fail");
					return 0;
			}
		} 
		 
	catch(ArithmeticException ex) {
			ex.printStackTrace();
			return 0;
		}

	}
	
	public static void main(String args[]) throws SizeArrayOnlyThree{

		Main main = new Main();	
		try {
		for(int i = 0; i< args.length; i++) {
			if(main.valueList.size()>2) throw new SizeArrayOnlyThree("max three arguments!");
			main.valueList.add(args[i]);		
		}		

	System.out.println("a: " + main.valueList.get(0) );
	System.out.println("operation: " + main.valueList.get(1) );
	System.out.println("b: " + main.valueList.get(2) );
	System.out.println("result: " + main.resultOperation());
		}
	catch(ArrayIndexOutOfBoundsException ex) {
		ex.printStackTrace();
	} 
}
}
