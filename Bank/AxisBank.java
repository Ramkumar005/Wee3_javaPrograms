package org.Bank;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Deposited");
	}
	
	public static void main(String[] args) {
		
		AxisBank bank = new AxisBank();
		
		bank.saving();
		bank.fixed();
		bank.deposit();
	}
}
