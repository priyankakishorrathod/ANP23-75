package com.Mybank.service;
import com.Mybank.service.LoanAccountService;
public class mainview {
	public static void main(String[] args) {
		LoanAccountService interest1 = new LoanAccountService();
		float Interest = interest1.calculatedInterest(1000,5, 6, 7);
		System.out.println("Interest for is + Interest");
	}

}
