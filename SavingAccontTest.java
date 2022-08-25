package com.test;

public class SavingAccontTest {
	public static void main(String[] args) {
		
		SavingAccount saver1 = new SavingAccount();
		SavingAccount saver2 = new SavingAccount();
		
		saver1.setSavingsBalance(2000.00);
		saver2.setSavingsBalance(3000.00);
		
		SavingAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println(saver1.getSavingsBalance());
		System.out.println(saver2.getSavingsBalance());

		SavingAccount.modifyInterestRate(0.05);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println(saver1.getSavingsBalance());
		System.out.println(saver2.getSavingsBalance());

	}
}

