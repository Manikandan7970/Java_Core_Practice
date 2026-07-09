package Methods_03;

public class Task08_StringUtility {
	
	public String countCharacters(String word)
	{
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			count++;
		}
		String wordcount=String.valueOf(count);
		return wordcount;
	}
	
	public String convertUpperCase(String word)
	{
		return word.toUpperCase();
	}
	
	public String convertLowerCase(String word)
	{
		return word.toLowerCase();
	}
	
	public String reverseString(String word)
	{
		String reverse="";
		char[] ch=word.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			reverse+=ch[i];
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 8 – String Utility
//		Objective
//
//		Create methods for string operations.
//
//		Methods
//		countCharacters()
//		convertUpperCase()
//		convertLowerCase()
//		reverseString()
//		
//		Concepts
//		String parameters
//		Return String
		
		Task08_StringUtility o=new Task08_StringUtility();
		System.out.println("Count characters a word : "
		+o.countCharacters("Manikandan"));
		System.out.println("A word convert to upperCase : "
		+o.convertUpperCase("i am a software developer."));
		System.out.println("A word convert to lowerCase : "
		+o.convertLowerCase("I AM A JAVA FULLSTACK DEVELOPER."));
		System.out.println("Reverse a word : "+o.reverseString("Hello."));
		
		
		

	}

}
