package moodAnalyzeTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {
	
	public String analyseMood(String mood) {
		if (mood.contains("Sad"))
			return "Sad Mood";
		else 
			return "Happy Mood";
	}
	
	@Test
	public void passingAnyMood_IsProper_ShouldReturn_Happy_Mood() {
		MoodAnalyzerTest mood=new MoodAnalyzerTest();
		assertEquals("Happy Mood", mood.analyseMood("I am in Any Mood"));
	}

}
