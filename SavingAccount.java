package com.test;
//Write a Java Program that implements the following

//•	Define a class SavingsAccount with following characteristics.
//•	Use a static variable annualInterestRate to store the annual interest rate for all account holders.
//•	Private data member savingsBalance indicating the amount the saver currently has on deposit.
//•	Method calculateMonthlyInterest to calculate the monthly interest as (savingsBalance * annualInterestRate / 12).
//After calculation, the interest should be added to savingsBalance.
//•	Static method modifyInterestRate to set annualInterestRate.
//•	Parameterized constructor with savingsBalance as an argument to set the value of that instance.
//•	Test the class SavingsAccount to instantiate two savingsAccount objects, saver1 and saver2,
//with balances of Rs.2000.00 and Rs3000.00, respectively. Set annualInterestRate to 4%, then
//calculate the monthly interest and print the new balances for both savers. Then set the annualInterestRate to 5%,
//calculate the next month’s interest and print the new balances for both savers.

//SavingAccount class
public class SavingAccount {
	public static double annualInterestRate;
	private double savingsBalance;

	public SavingAccount() {
		annualInterestRate = 0.0;
		savingsBalance = 0.0;
	}

	public SavingAccount(double intRate, double savBal) {
		annualInterestRate = intRate;
		savingsBalance = savBal;
	}

	public double calculateMonthlyInterest() {
		double intRate = (savingsBalance * annualInterestRate / 12);
		savingsBalance = savingsBalance + intRate;
		return intRate;
	}

	public static void modifyInterestRate(double newInteresRate) {
		annualInterestRate = newInteresRate;
	}

	public void setSavingsBalance(double newBal) {
		savingsBalance = newBal;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
}

