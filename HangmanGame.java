public class HangmanGame 
{
	
	//Create the variables to store the word and the theme
	private String word;
	private String theme;
	
	//Initialize the class
	public HangmanGame(String w, String theme)
	{
		this.word = w;
		this.theme = theme;
	}
	
	
	public boolean checkLetter(String c)
	{
		for(int i = 0; i < word.length(); i ++)
		{
			if(word.substring(i, i + 1).equals(c))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean gameStatus(String[] arr)
	{
		for(int i = 0; i < word.length(); i ++)
		{
			
		}
		return true;
	}
}
