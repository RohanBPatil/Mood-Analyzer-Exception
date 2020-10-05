package com.MoodAnalyzer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {
	public static MoodAnalyzer moodAnalyzer;
	
	// sad test case
	@Test
	void giverMoodSad_shouldReturn_SAD() {
		moodAnalyzer = new MoodAnalyzer("I am in sad mood");
		try {
			assertEquals("SAD", moodAnalyzer.analyseMood());
		}
		catch(MoodAnalysisException moodAnalysisException) {
			moodAnalysisException.printStackTrace();
		}
	}
	
	// happy test case
	@Test
	void givenMoodOtherThanSad_shouldReturn_HAPPY() {
		moodAnalyzer = new MoodAnalyzer("I am in Any mood");
		try {
			assertEquals("HAPPY", moodAnalyzer.analyseMood());
		}
		catch(MoodAnalysisException moodAnalysisException) {
			moodAnalysisException.printStackTrace();
		}
	}
	
	// null input test case
	@Test
	void givenNull_shouldThrowExceptionAndInform() {
		moodAnalyzer = new MoodAnalyzer(null);
		MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, () -> {
			moodAnalyzer.analyseMood();
		});
		assertEquals(MoodAnalysisException.InvalidMoods.NULL, exception.moodType);
	}
	
	// empty input test case
	@Test
	void givenEmpty_shouldThrowExceptionAndInform() {
		moodAnalyzer = new MoodAnalyzer("");
		MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, () -> {
			moodAnalyzer.analyseMood();
		});
		assertEquals(MoodAnalysisException.InvalidMoods.EMPTY, exception.moodType);
	}

}
