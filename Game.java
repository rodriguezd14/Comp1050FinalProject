import java.util.Scanner;

public class Game 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please select a letter to select a theme: ");
		System.out.println("Themes: ");
		System.out.println();
		System.out.println("Cars (a):");
		System.out.println("Food (b)");
		System.out.println("Massachusetts (c)");
		
		char c = input.next().charAt(0);
		
		if(c == 'c')
		{
			System.out.println("For cities in Massachusetts try using captial letters.");
		}
		
		HangmanGame hGame = new HangmanGame(c);
		
		//For Debugging
		System.out.println(hGame.getWordToSolve());
		
		//Prepare the game by setting every letter in the word to " __ "
		String[] arr = hGame.startingWord();
		
		//Prints the starting game
		printWord(arr);
		
		while(hGame.getGameStatus() < 5)
		{
			//Prompts the user to pick a letter
			System.out.println();
			System.out.println("Pick a letter: ");
			
			//Store the letter chosen
			String letter = input.next();
			
			if(hGame.letterAlreadyTaken(letter)) 
			{
				System.out.println(letter + " is already taken");
				System.out.println("Your game status is: " + hGame.getGameStatus());
			}
			
			//Checks if the letter exist and stores it in a boolean
			else if(hGame.checkLetter(letter))
			{
				//Updates the array if the letter exists
				hGame.updateCurWord(hGame.checkLetter(letter));
				
				//print the word thats been updated
				printWord(hGame.getCurword());
				
				if(hGame.isGameWon())
				{
					System.out.println("congrats");
					System.exit(0);
				}
			}
			else if(!hGame.checkLetter(letter))
			{
				//Get current game status
				System.out.println("Your game status is: " + hGame.getGameStatus());
			}
		}
		System.out.println("So sorry but you lost.");
	}
	
	public static void printWord(String[] word)
	{
		for(int i = 0; i < word.length; i ++)
		{
			System.out.print(word[i]);
		}
		System.out.println();
	}
}
