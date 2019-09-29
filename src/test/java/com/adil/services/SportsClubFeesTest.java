package com.adil.services;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class SportsClubFeesTest {
	SportsClubFees SportsClubFees = new SportsClubFees();
	@DataProvider(name="membershipFeesTest")
	public Object[][] createData() {
		return new Object[][] {
			// testNum, age, memberYear, expected output
			{ "T1",5,3,-1},//age < 6
			{ "T2",70,3,-1},//age > 65
			{ "T3",20,-1,-1},//memberYear < 0
			{ "T4",20,60,-1},//memberYear > 59
			{ "T5",20,3,300},//memberYear <= 3
			{ "T6",20,5,270},//memberYear <= 3 False

		};
	}

	@Test(dataProvider="membershipFeesTest")
	public void testMembershipFees(String id,int age, int memberYear,int expected) {
		assertEquals( SportsClubFees.calculateFee(age,  memberYear), expected );
	}


}
