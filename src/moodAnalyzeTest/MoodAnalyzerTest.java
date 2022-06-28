package moodAnalyzeTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {
	
	class Mood{
			String mood;
			
			public Mood(String mood) {
				super();
				this.mood = mood;
			}

			
			public String analyseMood() {
			try
			{if (mood.contains("Sad"))
					return "Sad Mood";
				else 
					return "Happy Mood";
			
			}catch(NullPointerException e ) {
				return "Happy Mood";			}
			}
		
	}
	
	@Test
	public void GivenNull_IsProper_ShouldReturn_HappyMood() {
		Mood mood=new Mood(null);
		assertEquals("Happy Mood", mood.analyseMood());
	}
}
