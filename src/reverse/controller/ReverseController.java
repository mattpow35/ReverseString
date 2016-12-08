package reverse.controller;

import java.util.*;

public class ReverseController 
{
	private Scanner userInput;
	private ArrayList<String> historyList;
	
	
	public ReverseController()
	{
		userInput = new Scanner(System.in);
		historyList = new ArrayList<String>();
	}
	
	public void start()
	{
		System.out.println("Instructions: ");
		System.out.println("To get the backwards form of a word please type your word and press enter.");
		System.out.println("To see a list of the backwards words you have created enter <history>.");
		System.out.println("To stop using this application enter <quit>");
		
		
		String currentWord = userInput.nextLine();
		
		while(!currentWord.equals("<quit>"))
		{
			if (currentWord.equals("<history>"))
			{
				System.out.println("History of words you have made backwards");
				System.out.println(historyList);
				currentWord = userInput.nextLine();
			}
			else
			{
				reverseWord(currentWord);
				historyList.add(currentWord);
				currentWord = userInput.nextLine();
			}
		}
		System.out.println("Thank you, have a nice day!");
		System.out.println("Program shutting down...");
		System.exit(0);

		
		
	
		
	}
	/*
	 * The method used to reverse a word
	 */
	public void reverseWord(String input)
	{
		String reverseInput = input;
		StringBuilder input1 = new StringBuilder();
		input1.append(reverseInput);
		input1=input1.reverse();
		for(int i=0; i<input1.length(); i++)
		{
			System.out.print(input1.charAt(i));
		}
		System.out.print("\n");
	
	}
	
}
