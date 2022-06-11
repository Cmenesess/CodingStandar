// Copyright (C) 2020
// All rights reserved

package labcodingstandards;

import java.util.Scanner;


/**
 * @author Joel Alvarado
 * 
 */
public class Calculator {	
	/**
	* Main function for the calculator
	*@param args
	*/
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");
        
        char operator = reader.nextLine().charAt(0);
        double first;
        double second;
        String input;
        
        while (true) {
        	System.out.print("Enter first number: ");
        	input = reader.nextLine();
        	
            try {
            	first=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }
        
        while (true) {
        	System.out.print("Enter second number: ");
        	input = reader.nextLine();
        	
            try {
            	second=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        Calculator cal=new Calculator();
        String result=cal.operation(First, second, operator);

        System.out.printf(result);
		reader.close();
	}
	
	/**
	* Method to do the operation dependind on the string sent on operator
	*@param first the first number
	*@param second the second number
	*@param operator the type of operator
	*@return the result or error if there is an error
	*/
	private String operation(double first, double second, char operator) {
		double result = 0;
		switch(operator)
        {
            case '1':
                result=first+second;
                break;
            case '2':
                result=first-second;
                break;
            case '3':
                result=first*second;
                break;
            case '4':
                result =first/second;
                break;
            default:
            	return "Error! operator is not correct";
        }
		return "The result is: "+result;
	}
}
