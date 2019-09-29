package com.adil.model;

import com.adil.services.SportsClubFees;
public class SportsClub {
	
	static SportsClubFees SportsClubFees = new SportsClubFees();
	
	private static int age;
    private static int memberYear;
    
    
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMemberYear() {
		return memberYear;
	}
	public void setMemberYear(int memberYear) {
		this.memberYear = memberYear;
	}
	public static int  getFees() {
		int result;
		return  result = SportsClubFees.calculateFee(age, memberYear);
	}
	

    

}
