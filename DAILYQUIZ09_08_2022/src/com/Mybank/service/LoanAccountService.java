package com.Mybank.service;

public class LoanAccountService {
	
	private int loanId;
	private float loanAmount;
	private float rateOfInterest;
	private int timePeriod;
	
	
	public float calculatedInterest(int IoanId,float IoanAmount,float rateOfInterest,int timeperiod) {
		
		float interestAmount=(loanAmount*rateOfInterest*timeperiod)/100;
		return interestAmount;
		
	}

}
