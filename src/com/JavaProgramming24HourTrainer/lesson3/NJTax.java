package com.JavaProgramming24HourTrainer.lesson3;

public class NJTax extends Tax {
	double adjustForStudents( double stateTax) {
		double adjustedTax = stateTax -500;
		 return adjustedTax;
	}
	public double caluclateTax(){
		double stateTax;
		if (grossIncome<30000) {
			stateTax=grossIncome*0.05;
		}
		else {
			stateTax=grossIncome*0.06;
		}
		return stateTax;
		
	}

}
