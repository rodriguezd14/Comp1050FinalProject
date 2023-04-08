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
		
		HangmanGame hGame = new HangmanGame(c);
		System.out.println(hGame.getWordToSolve());
		String[] arr = hGame.startingWord();
		printWord(arr);
	}
	
	public static void printWord(String[] word)
	{
		for(int i = 0; i < word.length; i ++)
		{
			System.out.print(word[i]);
		}
	}
}
