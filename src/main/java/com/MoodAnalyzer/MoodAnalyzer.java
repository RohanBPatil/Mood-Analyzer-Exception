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
		if(message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}
	
}
