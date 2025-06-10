package mystery_word_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MysteryWordGame {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Let's play The Mystery Word Game");
		System.out.println("Press any key to begin");
		Scanner scan = new Scanner(System.in);
		String begin = scan.nextLine();
		char start = begin.charAt(0);
		
		//First word of 4 letters
		game("lamp", "****");
		
		//Second word of 5 letters
		game("uncle", "*****");
		
		//Third word of 6 letters
		game("coyote", "******");
		
		//Fourth word of 7 letters
		game("classic", "*******");
		
		//Fifth word of 8 letters
		game("favorite", "********");
		
		//Sixth word of 9 letters
		game("yesterday", "*********");
		
		//Seventh word of 10 letters
		game("instructor", "**********");
		
		//Eighth word of 11 letters
		game("combination", "***********");
		
		//Ninth word of 12 letters
		game("contemporary", "************");
		
		//Last word of 13 letters 
		game("weightlifting", "*************");
		
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
