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
	
	
	
	public String analyseMood() throws MoodAnalysisException{
		InvalidMoods mood1 = InvalidMoods.NULL;
		InvalidMoods mood2 = InvalidMoods.EMPTY;
		
		try {
			if(message.contains("sad"))
				return "SAD";
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException("Mood can not be "+mood1);
		}
		
		if(message == "")
			throw new MoodAnalysisException("Mood can not be "+mood2);
		
		return "HAPPY";
	}
	
}
