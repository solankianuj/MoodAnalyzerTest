package moodAnalyzeTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyzerTest {
	
			String mood;
			
			public MoodAnalyzerTest(String mood) {
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
				System.out.println(e);
			}
			return "Null Mood";
			}
			
			public static void main(String[] args) {
			
					MoodAnalyzerTest moodcheck= new MoodAnalyzerTest(null);
					System.out.println(moodcheck.analyseMood());
			}
}
