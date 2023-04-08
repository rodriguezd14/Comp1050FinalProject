import java.awt.GraphicsDevice.WindowTranslucency;
import java.util.Random;

public class HangmanGame 
{
	
	//Create the variables to store the word and the theme
	private String word;
	private char themeSelector;
	public int pos = 0;
	public String[] theme;
	public String[] currentWord;
	public int status = 0;
	
	//Themes
	String[] cars = {"Ford", "Chevrolet", "BMW", "Volkswagen", "Honda", "Nissan", "Acura", "Dodge", "Audi", "Mercedez"};
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
	
	public String getWordToSolve()
	{
		return word;
	}
	
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
	 * this is done by taking a letter as a para as a character
	 * then check if it exist in the word, if so then
	 * find the position of the letter in the word then put it into
	 * the array at that position
	 * Stores the position where the letter currently is
	 */
	public boolean checkLetter(String letter)
	{
		if(word.contains(letter))
		{
			//Iterate through the word to find the position
			for(int i = 0; i < word.length(); i ++)
			{
				String temp = word.substring(i, i + 1);
				if(letter.equals(temp))
				{
					pos = i;
					return true;
				}
			}
		}
		return false;
	}
}
