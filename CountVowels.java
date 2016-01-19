package textTransformatons;

import java.util.Scanner;

public class CountVowels {
	static int numVowels = 0;
	static int intCount;
	static int counter;
	static int sum = 0;
	static String[] stringWords;
	static int[] count;
	
	public static void main(String[] args){
		
		Scanner user = new Scanner(System.in);
		System.out.println("Please enter text so I can count the vowels for you: ");
		String input = user.nextLine();
		
	
		separateWords(input);
		int intCount = 0;
		count = new int[stringWords.length];
		for(int j = 0; j < stringWords.length; j++){
			countVowels(stringWords[j]);
			sum = sum + count[j];
		}
		for(int k = 0; k < stringWords.length; k++){
			System.out.println(stringWords[k] + " has a vowel count of: " + count[k]);
		}
		System.out.println("Total vowel count: " + sum);
	}
	
	public static void countVowels(String nString){
		String[] stringLetters = new String[nString.length()];
		
		int start, end, counter = 0;
		for(start = 0, end = 0; start < nString.length(); start++, end++){
			stringLetters[start] = nString.substring(start, end + 1);
			if(stringLetters[start].equalsIgnoreCase("a") || stringLetters[start].equalsIgnoreCase("e")
					|| stringLetters[start].equalsIgnoreCase("i") || stringLetters[start].equalsIgnoreCase("o")
					|| stringLetters[start].equalsIgnoreCase("u")) {
				counter++;
			}
		}
		count[intCount] = counter;
		intCount++;
		counter = 0;
	}
	public static void separateWords(String word){
		System.out.println(word);
		stringWords = word.split(" ");
	}
}
