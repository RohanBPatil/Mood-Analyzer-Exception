package com.MoodAnalyzer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {
	public static MoodAnalyzer moodAnalyzer;
	
	@BeforeAll
	public void createObject() {
		moodAnalyzer = new MoodAnalyzer();
	}
	
	@Test
	void giverMoodSad_shouldReturn_SAD() {
		assertEquals("SAD", moodAnalyzer.analyseMood("I am in Sad mood"));
	}
	
	@Test
	void givenMoodOtherThanSad_shouldReturn_HAPPY() {
		assertEquals("HAPPY", moodAnalyzer.analyseMood("I am in Any mood"));
	}

}
