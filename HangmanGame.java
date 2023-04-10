/*
 * Comp1050 HangmanGame
 */

import java.awt.GraphicsDevice.WindowTranslucency;
import java.util.Random;

public class HangmanGame 
{
	
	//VARS
	
	//stores the word chosen randomly from the array
	private String word;
	//stores the letter selected by the user
	private String letter;
	//stores the character chosen by the user to select the theme
	private char themeSelector;
	//stores the position of the letter in the word
	private int pos = 0;
	//store the array words
	private String[] theme;
	//stores each letter within the letter chosen
	private String[] currentWord;
	//stores the current status of the game
	private int gameStatus = 0;
	
	//Themes (more can be added)
	String[] cars = {"ford", "chevrolet", "bmw", "volkswagen", "honda", "nissan", "acura", "dodge", "audi", "mercedez", "amg"};
	String[] food = {"pizza", "tacos", "burrito", "pupusas", "chicken parm", "salad"};
	String[] massachusetts = {"Lynn", "Boston", "Roxbury", "Revere", "Somerville", "Cambridge", "Saugus", "Salem"};
	
	//Initialize the class
	public HangmanGame(char c)
	{
		//Character from the user to select the theme
		this.themeSelector = c;
		//Method to set word to the randomly selected by the theme
		selectWordFromTheme();
	}
	
	//Method primarily for debugging
	public String getWordToSolve()
	{
		return word;
	}
	
	//Selects the theme
	public String[] getTheme(char c)
	{
		if(c == 'a')
		{
			theme = cars;
		}
		else if(c == 'b')
		{
			theme = food;
		}
		else if(c == 'c')
		{
			theme = massachusetts;
		}
		return theme;
	}
	
	//Get the word to solve
	public void selectWordFromTheme()
	{
		theme = getTheme(themeSelector);
		int random = (int)(Math.random() * ((theme.length - 1) - 0 + 1) + 0);
		word = theme[random];
	}
	
	//Generate the startingWord which is just " __ " for letters
	//set startingWord to currWord
	public String[] startingWord()
	{
		String[] arr = new String[word.length()];
		for(int i = 0; i < word.length(); i ++)
		{
			arr[i] = " __ ";
		}
		currentWord = arr;
		return currentWord;
	}
	
	/*
	 * Method that checks if a letter exists in the word
	 * this is done by taking a letter as a para as a string
	 * then check if it exist in the word, if so then
	 * find the position of the letter in the word then put it into
	 * the array at that position
	 * Stores the position where the letter currently is
	 */
	public boolean checkLetter(String str)
	{
		if(word.contains(str))
		{
			//Iterate through the word to find the position
			for(int i = 0; i < word.length(); i ++)
			{
				String temp = word.substring(i, i + 1);
				if(str.equals(temp))
				{
					pos = i;
					letter = str;
					return true;
				}
			}
		}
		gameStatus += 1;
		return false;
	}
	
	//Check if the letter is already taken
	public boolean letterAlreadyTaken(String str)
	{
		for(int i = 0; i < currentWord.length; i ++)
		{
			if(str.equals(currentWord[i]))
			{
				gameStatus += 1;
				return true;
			}
		}
		return false;
	}
	
	/*
	 * updates the curWord to be solved by checking if the letter exist
	 * if it exist then set the position in the array of currentWord equal to the letter guessed
	 * then check if the same letter is repeated more than once in the word
	 * if the word does not exist then add one the gameStatus (the game will end once gameStatus reaches 6)
	 */
	public void updateCurWord(boolean exist)
	{
		if(exist)
		{
			currentWord[pos] = letter;
			//Check to see if the letter is repeated more than once in the word
			for(int i = pos; i < currentWord.length; i ++)
			{
				String temp = word.substring(i, i + 1);
				if(letter.equals(temp)) 
				{
					pos = i;
					currentWord[pos] = temp;
				}
			}
		}
	}
	
	//Return the currentWord as an array
	public String[] getCurword()
	{
		return currentWord;
	}
	
	//Returns current game status
	public int getGameStatus()
	{
		return gameStatus;
	}
	
	//Checks to see if game is over
	public boolean isGameWon()
	{
		String temp = "";
		for(int i = 0; i < currentWord.length; i ++)
		{
			temp += currentWord[i];
		}
		if(temp.equals(word))
		{
			return true;
		}
		return false;
	}
}
