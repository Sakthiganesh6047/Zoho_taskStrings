package com.runner;

import com.task.*;
import com.nullemptyexception.*;
import java.util.*;

public class Runner {
    public static void main(String[] args)throws NullEmptyException{
        Scanner scanner = new Scanner(System.in);
		Task task = new Task();
		int choice;
		int enteredchoice = 1;
		do{

			try{
				
				System.out.println("Select an operation to perform:");
				System.out.println("1. Print String Length");
				System.out.println("2. Convert into Character Array");
				System.out.println("3. Penultimate Character");
				System.out.println("4. Number of Occurrences");
				System.out.println("5. Greatest Position of Character");
				System.out.println("6. Last N Characters");
				System.out.println("7. First N Characters");
				System.out.println("8. Replace First Three Characters");
				System.out.println("9. Check String Starts With");
				System.out.println("10. Check String Ends With");
				System.out.println("11. Convert to Uppercase");
				System.out.println("12. Convert to Lowercase");
				System.out.println("13. Reverse String");
				System.out.println("14. Accept Multiple String Line");
				System.out.println("15. Concatenate Strings");
				System.out.println("16. Enclose in Array");
				System.out.println("17. Merge Strings with Hyphen");
				System.out.println("18. Equal Case Sensitive");
				System.out.println("19. Equal Ignore Case Sensitive");
				System.out.println("20. Space Check");
				System.out.println("0. Exit");
				System.out.print("Enter your choice: ");
				
				while (true){
					try {
						enteredchoice = scanner.nextInt();
						scanner.nextLine();
						break;
					}
					catch (InputMismatchException e){
						System.out.println("Invalid Choice, Please enter a valid number: ");
						scanner.nextLine();
					}
				}

				switch (enteredchoice){
					case 1:
						if(args.length > 0){
							task.checkNullOrEmpty(args[0]);
							System.out.println("Length of the String is " + task.getStringLength(args[0]));
						}
						else{
							System.out.println("Input not found in the arguments");
						}
						break;

					case 2:
						System.out.println("Enter a string to perform the selected operation: ");
						String chararrayinput = scanner.nextLine();
						char[] arrayResult = task.ConvertCharArray(chararrayinput);
						System.out.print("Character Array: ");
						for (char c : arrayResult) {
							System.out.print(c + " ");
						}
						break;

					case 3:
						System.out.println("Enter a string to perform the selected operation: ");
						String penultimateinput = scanner.nextLine();
						char penultimateResult = task.getPenultimateChar(penultimateinput, 2);
						System.out.println("The character from last 2 places is " + penultimateResult);
						break;

					case 4:
						System.out.println("Enter a string to perform no. of Occurrences search: ");
						String occurrenceinput = scanner.nextLine();
						System.out.print("Enter a character to search: ");
						char searchingChar = scanner.next().charAt(0);
						System.out.println("The Number of Occurrences of the char is " + task.getCharOccurrence(occurrenceinput , searchingChar));
						break;

					case 5:
						System.out.println("Enter a string to perform the selected operation: ");
						String greatestpositioninput = scanner.nextLine();
						System.out.print("Enter a character to find Greatest Position: ");
						char repeatingChar = scanner.next().charAt(0);
						if (task.getGreatestPosition(greatestpositioninput , repeatingChar) == -1){
							System.out.println("No such character exists.");
						} else {
							System.out.println("The greatest position of the char is " + task.getGreatestPosition(greatestpositioninput , repeatingChar));
						}
						break;

					case 6:
						System.out.println("Enter a string to perform the selected operation: ");
						String lastncharinput = scanner.nextLine();
						while (true) {
							try{
								System.out.print("Enter the number of characters to print from the last: ");
								int noOfLastChars = scanner.nextInt();
								System.out.println("The last " + noOfLastChars + " characters are: " + task.getLastNChar(lastncharinput , noOfLastChars));
								break;
								}
							catch (InputMismatchException e){
								System.out.println("Invalid input, Please enter an integer.");
								scanner.nextLine();
							}
						}
						break;

					case 7:
						System.out.println("Enter a string to perform the selected operation: ");
						String firstncharinput = scanner.nextLine();
						while (true){
							try {
								System.out.print("Enter the number of characters to print from the beginning: ");
								int noOfStartChars = scanner.nextInt();
								System.out.println("The First " + noOfStartChars + " characters are: " + task.getFirstNChar(firstncharinput , noOfStartChars));
								break;
								}
								catch(InputMismatchException e){
								System.out.println("Invalid input, Please enter an integer.");
								scanner.nextLine();
							}
						}
						break;

					case 8:
						System.out.println("Enter a string to perform the selected operation: ");
						String replacefirstninput = scanner.nextLine();
						//System.out.print("Enter the characters to substitute: ");
						//String substituteString = scanner.nextLine();
						System.out.println("The Replaced String is: " + task.replaceSubstring(replacefirstninput , "xyz" , 3));
						break;

					case 9:
						System.out.println("Enter a string to perform the selected operation: ");
						String startswithinput = scanner.nextLine();
						System.out.print("Enter the string to check from the start: ");
						String startCheckString = scanner.nextLine();
						System.out.println(task.compareStartChars(startswithinput , startCheckString));
						break;

					case 10:
						System.out.println("Enter a string to perform the selected operation: ");
						String endswithinput = scanner.nextLine();
						System.out.print("Enter the string to check from the end: ");
						String endCheckString = scanner.nextLine();
						System.out.println(task.compareEndChars(endswithinput , endCheckString));
						break;

					case 11:
						System.out.println("Enter a string to perform the selected operation: ");
						String touppercaseinput = scanner.nextLine();
						System.out.println(task.convertingToUpperCase(touppercaseinput));
						break;

					case 12:
						System.out.println("Enter a string to perform the selected operation: ");
						String tolowercaseinput = scanner.nextLine();
						System.out.println(task.convertingToLowerCase(tolowercaseinput));
						break;

					case 13:
						System.out.println("Enter a string to perform the selected operation: ");
						String reversinginput = scanner.nextLine();
						System.out.println(task.reversingString(reversinginput));
						break;

					case 14:
						System.out.print("Enter a line of multiple strings: ");
						String multiStringLine = scanner.nextLine();
						task.checkNullOrEmpty(multiStringLine);
						System.out.println("The Entered Multiple String line is: " + multiStringLine);
						break;
						
						

					case 15:
						try{
						System.out.print("Enter a line of multiple strings: ");
						String concatenateStringLine = scanner.nextLine();
						System.out.println("The Concatenated String: " + task.concatenateMultipleString(concatenateStringLine , " "));
						break;
						}
						catch(NullEmptyException e){
							System.out.println(e.getMessage());
						}

					case 16:
						System.out.print("Enter a line of multiple strings: ");
						String toBeEnclosedLine = scanner.nextLine();
						System.out.print("Enter the enclosing character: ");
						String splittingchars = scanner.nextLine();
						String[] enclosedArray = task.encloseInArray(toBeEnclosedLine , splittingchars);
						System.out.println("Enclosed Strings:");
						for (String str : enclosedArray){
							System.out.println(str);
						}
						break;

					case 17:
						ArrayList<String> multiStringArrayList = new ArrayList<>();
						System.out.println("Enter a line of multiple strings (enter an empty line to finish): ");
						while (true) {
							String stringInput = scanner.nextLine();
							if (stringInput.isEmpty()) {
								break;
							}
							multiStringArrayList.add(stringInput);
						}
						System.out.println("Enter the joining character: ");
						CharSequence joiningcharacter = scanner.nextLine();
						System.out.println("Merged string: " + task.mergeStringWithSymbol(multiStringArrayList , joiningcharacter));
						break;

					case 18:
						System.out.print("Enter the first string: ");
						String firstStringLine = scanner.nextLine();
						System.out.print("Enter the second string: ");
						String secondStringLine = scanner.nextLine();
						System.out.println(task.areStringsCaseEqual(firstStringLine, secondStringLine));
						break;

					case 19:
						System.out.print("Enter the first string: ");
						String firstStringLineIC = scanner.nextLine();
						System.out.print("Enter the second string: ");
						String secondStringLineIC = scanner.nextLine();
						System.out.println(task.areStringsIgnoreCaseEqual(firstStringLineIC, secondStringLineIC));
						break;

					case 20:
						System.out.print("Enter the string: ");
						String toBeTrimmedString = scanner.nextLine();
						System.out.println(task.trimString(toBeTrimmedString));
						break;

					case 0:
						System.out.println("Terminated successfully");
						break;
				}
			}
		catch(NullEmptyException e){
			System.out.println(e.getMessage());
			}
		}
		while (enteredchoice != 0);
    }
}
