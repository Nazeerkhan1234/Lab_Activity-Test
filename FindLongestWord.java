package com.test;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FindLongestWord {
	
     
	public static void main(String[] args) throws FileNotFoundException //throws exception
	{
		new FindLongestWord().getLongestWords();
	}

	public String getLongestWords() throws FileNotFoundException {

		String longestWord = "";
		String current;
		Scanner scan = new Scanner(new File("C:\\Users\\Nazeer\\Desktop\\hello.txt.txt"));

		while (scan.hasNext()) {
			current = scan.next();
			if (current.length() > longestWord.length()) {
				longestWord = current;
			}

		}
		System.out.println(longestWord);
		return longestWord;
	}

}

