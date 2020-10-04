package com.MoodAnalyzer;

public class MoodAnalyzer {
	public String message;
	
	//default constructor
	public MoodAnalyzer() {
		
	}
	
	//parameterized constructor
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	public String analyseMood() {
		try {
			if(message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch(NullPointerException e) {
			return "HAPPY";
		}
	}
	
}
