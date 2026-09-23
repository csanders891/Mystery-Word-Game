package mystery_word_game;

import java.util.ArrayList;   
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class MysteryWordGame {
	
	Random rand = new Random();		//declares a random variable for each subscript that points to a ramdom word
	
	String get4LetterWord()
	{
	String[] fourLetterWords = {"does", "hall", "fact", "town", "lock", "fine", "yarn", "hour", "deep", "long", 
			"good", "come", "dawn", "pool", "huge", "mean", "nest", "from", "mask", "warm", "best", "more", "jump", "hose", 
			"lady", "vase", "sigh", "wait", "them", "fish"};
	
	int index = rand.nextInt(30);
	return fourLetterWords[index]; 
	} 
	
	String get5LetterWord()
	{
		String[] fiveLetterWords = {"uncle", "group", "again", "straw", "groan", "roast", "ahead", "empty", "ocean", "snack", 
				"pinch", "fudge", "habit", "carry", "laugh", "drown", "bread", "spray", "scold", "alone", "cough", "piece",
				"video", "queen", "party", "later", "fever", "truck", "blast", "fresh"};
		
		int index = rand.nextInt(30);
		return fiveLetterWords[index];
	}

	String get6LetterWord()
	{
		String[] sixLetterWords = {"coyote", "purple", "enough", "bright", "limber", "afraid", "across", "during", "future",
				"around", "castle", "decade", "trophy", "coupon", "artist", "desert", "ignore", "bounce", "charge", "reason",
				"before", "action", "scream", "gather", "tickle", "dinner", "report", "lesson", "waffle", "tuxedo"};
		
		int index = rand.nextInt(30);
		return sixLetterWords[index];

	}
	
	String get7LetterWord()
	{
		String[] sevenLetterWords = {"classic", "leotard", "natural", "cupcake", "weekend", "mistake", "biscuit", "unusual",
				"harmony", "routine", "victory", "naughty", "because", "summary", "license", "aspirin", "phantom", "decline", 
				"dynasty", "uniform", "neither", "vicious", "promise", "problem", "receive", "balance", "suggest", "replace", 
				"another", "service"}; 
		
		int index = rand.nextInt(30);
		return sevenLetterWords[index];
	}

	String get8LetterWord()
	{
		String[] eightLetterWords = {"backyard", "alphabet", "favorite", "terrible", "cardigan", "sailboat", "continue", 
				"campaign", "majority", "fourteen", "argument", "remember", "probably", "entrance", "railroad", "portrait",
				"disaster", "lemonade", "airplane", "mischief", "outside", "together", "bulletin", "behavior", "cupboard",
				"dinosaur", "innocent", "carnival", "shepherd", "decision"};
		
		int index = rand.nextInt(30);
		return eightLetterWords[index];
	}
  
	String get9LetterWord()
	{
		String[] nineLetterWords = {"yesterday", "newspaper", "microwave", "happiness", "haphazard", "afternoon", "butterfly",
				"mandatory", "whirlwind", "ballerina", "emergency", "saxophone", "southwest", "important",
				"crocodile", "situation", "adventure", "exhausted", "geography", "universal", "beautiful", "challenge", 
				"paparazzi", "outspoken", "apologize", "excellent", "interrupt", "represent", "telephone", "chocolate"};
		
		int index = rand.nextInt(30);
		return nineLetterWords[index];
		 
	}

	String get10LetterWord()
	{
		String[] tenLetterWords = {"instructor", "misfortune", "university", "everything", "flashlight", "playground", 
				"conscience", "lieutenant", "restaurant", "incredible", "allegiance", "reschedule", "dictionary",
				"accomplish", "photograph", "disqualify", "ridiculous", "chimpanzee", "difficulty", "heartbreak", "centimeter",
		"commercial", "skateboard", "scientific", "nonchalant", "department", "psychology", "tournament", "discipline", 
		"enterprise"};
		
		int index = rand.nextInt(30);
		return tenLetterWords[index];
	}
	
	String get11LetterWord()
	{
		String[] elevenLetterWords = {"combination", "everlasting", "counterfeit", "screwdriver", "corporation", 
				"appointment", "supermarket", "trustworthy", "microscopic", "interesting", "independent", "thermometer", 
				"imagination", "congressman", "radioactive", "subtraction", "heavyweight", "babysitting", "association", 
				"incorrectly", "responsible", "opportunity", "information", "celebration", "gallbladder", "chlorophyll", 
				"protagonist", "disturbance", "cauliflower", "metaphysics"};	
		
		int index = rand.nextInt(30);
		return elevenLetterWords[index];
	}
	
	String get12LetterWord()
	{
		String[] twelveLetterWords = {"contemporary", "conversation", "encyclopedia", "satisfactory", "subconscious", 
				"nevertheless", "affectionate", "tuberculosis", "flamethrower", "relationship", "superstition", "mysteriously",
				"thanksgiving", "anthropology", "championship", "professional", "metropolitan", "irresistible", "hypothetical",
				"handkerchief", "circumstance", "kindergarten", "neighborhood", "microbiology", "multivitamin", "dictatorship",
				"stratusphere", "predetermine", "cardiologist", "intermediate"};	

		int index = rand.nextInt(30);
		return twelveLetterWords[index];
	}

	
	String get13LetterWord()
	{
	String[] thirteenLetterWords = {"weightlifting", "participation", "parallelogram", "metamorphosis", "entertainment", 
			"international", "autobiography", "overstimulate", "disappearance", "sportsmanship", "disrespectful", 
			"meteorologist", "controversial", "uncomfortable", "concentration", "contortionist", "comprehension", 
			"carbohydrates", "communication", "misunderstood", "advertisement", "configuration", "valedictorian", 
			"extraordinary", "inappropriate", "developmental", "biodegradable", "hallucination", "semiconscious",
			"multicellular"};
	
	int index = rand.nextInt(30);
	return thirteenLetterWords[index];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Let's play The Mystery Word Game");
		System.out.println("Press any key to begin");
		Scanner scan = new Scanner(System.in);
		String begin = scan.nextLine();
		char start = begin.charAt(0);
		
		MysteryWordGame hangman = new MysteryWordGame();
		
		//First word of 4 letters
		String s1 = hangman.get4LetterWord();
		game(s1, "****"); 
		
		//Second word of 5 letters
		String s2 = hangman.get5LetterWord();
		game(s2, "*****");
		
		//Third word of 6 letters
		String s3 = hangman.get6LetterWord();
		game(s3, "******");
		
		//Fourth word of 7 letters
		String s4 = hangman. get7LetterWord();
		game(s4, "*******");
		
		//Fifth word of 8 letters
		String s5 = hangman.get8LetterWord();
		game(s5, "********");
		
		//Sixth word of 9 letters
		String s6 = hangman.get9LetterWord();
		game(s6, "*********");
		
		//Seventh word of 10 letters
		String s7 = hangman.get10LetterWord();
		game(s7, "**********");
		
		//Eighth word of 11 letters
		String s8 = hangman.get11LetterWord();
		game(s8, "***********");
		
		//Ninth word of 12 letters

		String s9 = hangman.get12LetterWord();
		game(s9, "************");
		
		//Last word of 13 letters 
		String s10 = hangman.get13LetterWord();
		game(s10, "*************");
		
		System.out.println("Congratulations!!!!!   You beat the game");
		System.out.println("Thanks for playing");
	}

	private static void game(String string, String s) {
		// TODO Auto-generated method stub
		int guesses = 6; 
		//keeps  track of already guessed letters
		ArrayList <Character> guessedLetters = new ArrayList();
		System.out.println(string.length() + " letters in this word");
		System.out.println(s);
		System.out.println("Please enter a letter");
		
		String letter = inputValidation();
		char ch = input_validation(letter);
		boolean done = false;		//you don't have all the letters in the word
		
		//accept capital letter
		if(ch < 'a')
			ch = lowercase(letter);
		
	

		while(guesses > 0 && !done)
		{
			
			boolean inTheWord = false;
			
			
			for(char guessedLetter: guessedLetters)
			{
				while(ch == guessedLetter)
				{
					ArrayList <Character> alreadyGuessed = new ArrayList(guessedLetters);
				
		
					System.out.println(ch + " was already guessed");
					System.out.println("Please enter another letter");
					letter = inputValidation();
					ch = input_validation(letter);
				}
			}
	
			
			for(int i = 0; i < string.length(); i++)
			{
				if(ch == string.charAt(i))
				{
					inTheWord = true;
					s = inTheWord(ch, s, i);
					System.out.println(s);
					guessedLetters.add(ch);			
				}
				

			}
			
			if(!inTheWord)
			{
				guesses = notInTheWord(ch, guesses, string);
				guessedLetters.add(ch);
			}
				
			
			if(string.equals(s))
			{
				done = true;		//you have all the letters in the word
				
				if(string.length() < 12)
					System.out.println("You got it.  Please enter a character to go on to the next word.");
				
				//one more word left
				else if(string.length() == 12)
					System.out.println("You got it.  Please enter a character to go on to the last word.");
				
				else if(string.length() > 12)
					System.out.println("You got it.  Please enter a character.");
				
				Scanner scan = new Scanner(System.in);
				String next = scan.next();
				char proceed = next.charAt(0);
			}
				
			
			else
				 
			{
				System.out.println("Please enter another letter");
				letter = inputValidation();
				ch = input_validation(letter);
				
				if(ch < 'a')
					ch = lowercase(letter);
			}
			
		}
				
	}

	//string must have one and only one character
	private static String inputValidation() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		while(str.length() > 1)
		{
			System.out.println("Invalid entry.  Try again");
			str = scan.next();
		}
		return str;
	}

	//character must be a letter of the alphabet
	private static char input_validation(String letter) {
		// TODO Auto-generated method stub
		char c = letter.charAt(0);
		
		while(c < 'A' || c > 'Z' && c < 'a' || c > 'z' )
		{
			System.out.println("Invalid entry.  Try again");
			Scanner scan = new Scanner(System.in);
			letter = scan.next();
			
			//string should still have one and only one character
			while(letter.length() > 1)
			{
				System.out.println("Invalid entry.  Try again");
				letter = scan.next();
			}

			c = letter.charAt(0);
		}
		
		if(c < 'a')
			c = lowercase(letter);
	
		return c;
	}
	
	
	private static String inTheWord(char ch, String s, int i) {
		// TODO Auto-generated method stub
		char charArray [] = s.toCharArray();
		charArray[i] = ch;
		
		String string = new String(charArray);
		
		System.out.println("");
		return string;
	
		
	}
	
	private static int notInTheWord(char ch, int chances, String string) {
		// TODO Auto-generated method stub
		
		chances--;
		
		
		//a few more chances to guess the correct word
		if(chances >1)
		{
			System.out.println("There is no " + ch);
			System.out.println("You have " + chances + " guesses remaining in this word");
		}
		
		//last chance to guess the correct word
		else if(chances == 1)
		{
			System.out.println("There is no " + ch);
			System.out.println("You have " + chances + " guess remaining for this word");
			
		}
		
		//used up all your chances to guess the correct word; the game is over
		else if(chances < 1)
		{
			System.out.println(string);
			System.out.println("You used up all your guesses");
			System.out.println("Game Over");
			System.exit(0);
		}
		
		return chances;
	}

	private static char lowercase(String letter) {
		// TODO Auto-generated method stub
		letter = letter.toLowerCase();
		char c = letter.charAt(0);
		return c;
	}
}
