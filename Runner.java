package com.runner;
import com.task.*;
import java.util.*;

public class Runner{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	if(args.length > 0){
		Task task = new Task(args[0]);

		//(1) Printing length
		int stringlength = task.stringLength();
		System.out.println("Length of the String is "+ stringlength);

		//(2) Converting into character array
		char[] arrayresult = task.charArray();
		for(char i : arrayresult){
			System.out.print(i + " ");
			}

		//(3) Penultimate
		if(task.stringLength() >= 2){
			char penultimateresult = task.penultimateChar();
			System.out.println("The penultimate character is " + penultimateresult);
			}
		else{
			System.out.println("The string is too short to have a penultimate");
			}
		
		//(4) Number of Occurrences
		System.out.println("Enter a character to search");
		char searchingchar = scanner.next().charAt(0);
		System.out.println("The Number of Occurrences of the char is " + task.charOccurrence(searchingchar));

		//(5) Greatest Position
		System.out.println("Enter a char to find Greatest Position");
		char repeatingchar = scanner.next().charAt(0);
		if(task.greatPosition(repeatingchar) == -1){
			System.out.println("No such character exists");}
		else{System.out.println("The greatest position of the char is " +  task.greatPosition(repeatingchar));}

		//(6) Last Five Character
		System.out.println("The last five char is " + task.lastFiveChar());

		//(7) First three character
		System.out.println("The First three char is " + task.firstThreeChar());

		//(8) Replace First three character with XYZ
		System.out.println("The Replaced String is " + task.firstThreeReplace());

		//(9) Checking String starts with ent
		System.out.println(task.checkingFirstThree());

		//(10) Checking String ends with le
		System.out.println(task.checkingLastTwo());

		//(11) Coverting to UpperCase
		System.out.println(task.convertingToUpperCase());

		//(12) Converting to Lowercase
		System.out.println(task.convertingToLowerCase());

		//(13) Reversing a string
		System.out.println(task.reversingString());

		//(14) Accepting Multiple Strings
		scanner.nextLine();
		System.out.println("Enter a line of multiple strings");
		String multistringline = scanner.nextLine();
		System.out.println("The Entered Multiple String line is " + multistringline);

		//(15) Concatenating strings
		System.out.println("Enter a line of multiple strings");
		String concatenatestringline = scanner.nextLine();
		System.out.println("The Concatenated String: " + Task.concatenateMultipleString(concatenatestringline));

		//(16) Enclosing in a Array
		System.out.println("Enter a line of multiple strings");
		String tobeenclosedline = scanner.nextLine();
		String[] enclosedarray = Task.encloseInArray(tobeenclosedline);
		for (String i : enclosedarray){System.out.println(i);}

		//(17) Merging string with hyphen
		ArrayList<String> multistringarraylist = new ArrayList<>();
		System.out.println("Enter a line of multiple strings");
		while(true){
			String stringinput = scanner.nextLine();
			if(stringinput.isEmpty() == true){
				break;
			}
		multistringarraylist.add(stringinput);	
		}
		System.out.println("Merged string: " + Task.mergeStringWithSymbol(multistringarraylist));

		//(18) Equal case sensitive
		System.out.println("Enter the first string");
		String firststringline = scanner.nextLine();
		System.out.println("Enter the first string");
		String secondstringline = scanner.nextLine();
		System.out.println(Task.areStringsCaseEqual(firststringline, secondstringline));

		//(19) Equal ignore case sensitive
		System.out.println("Enter the first string");
		String firststringlineic = scanner.nextLine();
		System.out.println("Enter the first string");
		String secondstringlineic = scanner.nextLine();
		System.out.println(Task.areStringsIgnoreCaseEqual(firststringlineic, secondstringlineic));

		//(20) Space Check
		System.out.println("Enter the string");
		String tobetrimmedstring = scanner.nextLine();
		System.out.println(Task.trimString(tobetrimmedstring));
		}
	else{
		System.out.println("No input found");
		}
	}
}