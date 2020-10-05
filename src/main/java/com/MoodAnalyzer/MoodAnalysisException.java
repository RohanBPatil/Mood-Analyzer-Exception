package com.MoodAnalyzer;

public class MoodAnalysisException extends Exception{
	enum InvalidMoods {
		NULL, EMPTY;
	}
	public InvalidMoods moodType;
	
	public MoodAnalysisException(InvalidMoods moodType, String message) {
		super(message);
		this.moodType = moodType;
	}
}
