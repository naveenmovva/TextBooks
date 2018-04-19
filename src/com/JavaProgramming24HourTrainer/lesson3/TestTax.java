package com.JavaProgramming24HourTrainer.lesson3;

public class TestTax {
	public static void main(String [] args) {
		NJTax t = new NJTax();
		t.grossIncome= 50000; // assigning the values
		 t.dependents= 2;
		 t.state= "NJ" ;

		 double yourTax = t.calculateTax();

		 // Printing the result
		 System.out.println("Your tax is " + yourTax);
	}

}
