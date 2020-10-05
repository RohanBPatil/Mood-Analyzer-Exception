package com.MoodAnalyzer;

import com.MoodAnalyzer.MoodAnalysisException.InvalidMoods;

public class MoodAnalyzer {
	public String message;
	
	//default constructor
	public MoodAnalyzer() {
		
	}
	
	//parameterized constructor
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	
	
	public String analyseMood() throws MoodAnalysisException{
		try {
			if(message.toLowerCase().contains("sad"))
				return "SAD";
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.InvalidMoods.NULL, "Mood can not be Null");
		}
		
		if(message.length() == 0)
			throw new MoodAnalysisException(MoodAnalysisException.InvalidMoods.EMPTY, "Mood can not be Empty");
		
		return "HAPPY";
	}
	
}
