package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import models.ListOfWord;

public class ListOfWordTest {

	public static void main(String[] args) {
		ListOfWord testList = new ListOfWord();
		try {
			Scanner input = new Scanner(new File("test/test-file"));
			String next = null;
			//Read words from file, add to list print list
			while (input.hasNext()) {
				next = input.next();
				testList.addWord(next);
			}
			testList.printAllWords();
			input.close();
			
			//Find words in list
			
			System.out.println("Searching for word in list 'HEARTS'. Word Found: " + testList.getWord("HEARTS"));
			System.out.println("Searching for word in list 'HEART' (Word not in list). Word Found: " + testList.getWord("HEART"));
			
			//Remove word from list
			testList.removeWord("hearts");
			testList.printAllWords();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found");
		}
	}

}
