package moodAnalyzeTest;

public class MoodAnalyzerTest {
	
	public String analyseMood(String mood) {
		if (mood.contains("Sad"))
			return "Sad Mood";
		else 
			return "Happy Mood";
	}
	
	
	public static void main(String[] args) {
		MoodAnalyzerTest moodTest= new MoodAnalyzerTest();
		System.out.println(moodTest.analyseMood("I Am Happy"));
		System.out.println(moodTest.analyseMood("I Am  Sad "));

	}

}
