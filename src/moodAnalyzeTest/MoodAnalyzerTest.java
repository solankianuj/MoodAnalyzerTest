package moodAnalyzeTest;

public class MoodAnalyzerTest {
	
		String mood;
		
		
		public MoodAnalyzerTest(String mood) {
			super();
			this.mood = mood;
		}


		public String analyseMood() {
			if (mood.contains("Sad"))
				return "Sad Mood";
			else 
				return "Happy Mood";
		}
		

	public static void main(String[] args) {
		MoodAnalyzerTest moodcheck =new MoodAnalyzerTest("This is a Sad Message");
		System.out.println(moodcheck.analyseMood());
	}

}
