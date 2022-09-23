package calculator;


import java.util.Scanner;

import calculator.operations.AddOperation;
import calculator.operations.DivideOperation;
import calculator.operations.MultOperation;
import calculator.operations.SubtractOperation;

public class InteractiveCalculator {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Give me an operation: ");
		String operation= scanner.nextLine();
		System.out.println("Give me number A please:");
		
		int numberA= scanner.nextInt();
		System.out.println("Give me number B please: ");
		int numberB = scanner.nextInt();
		int result;
		if(operation.equals("add")) {
			AddOperation add= new  AddOperation();
			add.setA(numberA);
			add.setB(numberB);
			result=add.getResult();
			
		}else if(operation.equals("subtract")) {
			SubtractOperation subtract= new  SubtractOperation();
			subtract.setA(numberA);
			subtract.setB(numberB);
			result=subtract.getResult();
			
		}else if(operation.equals("multiply")) {
			MultOperation multiply= new  MultOperation();
			multiply.setA(numberA);
			multiply.setB(numberB);
			result=multiply.getResult();
			
		}else if(operation.equals("divide")) {
			DivideOperation divide= new  DivideOperation();
			divide.setA(numberA);
			divide.setB(numberB);
			result=divide.getResult();
			
		}else {
			System.out.println("Invalid operation");
			result=0;
		}
		System.out.println("the answer is: "+ result);
		System.out.println("this is added to do some testing ")
		
		
		
		
		

	}

}
