package com.adil.services;

public class SportsClubFees {

    private static int fee = 0;
    
	public static int calculateFee(int age, int memberYear){
		
		if ((age < 6) || (age > 65) || (memberYear < 0) || (memberYear > 59)|| (memberYear > age) ){
			System.out.println("NOT VALID");
			fee = -1;
		} else {
			if (memberYear <= 3){ 
				fee = 300;
			} else {
				fee = 270;
			}
		}
		return fee; 
	}
	
	
}
