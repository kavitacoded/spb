package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	//Has-A property (supporting composition or injection)
	
	private Date date;
	
	public WishMessageGenerator(Date date) {
		this.date=date;
		System.out.println("WishMessageGenerator 1-param constructor  "+ date);
	
	}

	 //setter method supporting setter injection 
	public void setDate(Date date) {
	 System.out.println("WishMessageGenerator.setDate()"+date); 
	 this.date=date; 
	 }
	 
	//b method
	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()"+date.toString());
		//get current hour of the day
		int hour=date.getHours();
		//generate wish message
		if(hour<12)
			return "Good morning :"+user;
		else if(hour<16)
			return "Good Afternoot:"+user;
		else if(hour<20)
			return "Good Evening:"+user;
		else
			return "Good night"+user;
		
		
	}
	
}
