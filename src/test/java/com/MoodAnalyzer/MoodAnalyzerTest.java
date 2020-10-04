package com.MoodAnalyzer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {
	public static MoodAnalyzer moodAnalyzer;
	
	
	@Test
	void giverMoodSad_shouldReturn_SAD() {
		moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
		assertEquals("SAD", moodAnalyzer.analyseMood());
	}
	
	@Test
	void givenMoodOtherThanSad_shouldReturn_HAPPY() {
		moodAnalyzer = new MoodAnalyzer("I am in Any mood");
		assertEquals("HAPPY", moodAnalyzer.analyseMood());
	}
	
	@Test
	void givenNull_shouldReturn_HAPPY() {
		moodAnalyzer = new MoodAnalyzer(null);
		assertEquals("HAPPY", moodAnalyzer.analyseMood());
	}

}
