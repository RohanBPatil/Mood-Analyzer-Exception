package com.MoodAnalyzer;

public class MoodAnalyzer {
	
	public String analyseMood(String mood) {
		if(mood.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}
	
}
