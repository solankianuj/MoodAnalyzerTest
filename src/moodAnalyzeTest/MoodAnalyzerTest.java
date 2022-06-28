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
				if (mood.contains("Sad"))
					return "Sad Mood";
				else 
					return "Happy Mood";
			}
			
		}
		
		@Test
		public void Given_Sad_IsProper_ShouldReturn_Sad_Mood() {
			Mood moodcheck =new Mood("I am in Happy Mood");
				assertEquals("Happy Mood", moodcheck.analyseMood() );
		}

}
