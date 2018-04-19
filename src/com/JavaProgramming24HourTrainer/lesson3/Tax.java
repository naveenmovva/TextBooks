package com.JavaProgramming24HourTrainer.lesson3;

public class Tax {
	double grossIncome;
	String state;
	int dependents;
	public double calculateTax(){
		double stateTax;
		if (grossIncome<30000) {
			stateTax=grossIncome*0.05;
		}
		else {
			stateTax=grossIncome*0.06;
		}
		return stateTax;
	}
	public static void main(String [] args) {
		System.out.println("testing");
		System.out.println("dev");
	}

}
