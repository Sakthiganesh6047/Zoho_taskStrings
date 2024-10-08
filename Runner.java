package com.runner;

import com.task.*;
import com.invalidinputexception.*;
import java.util.*;

public class Runner {
    public static void main(String[] args)throws InvalidInputException{
        Scanner scanner = new Scanner(System.in);

		try{
			if (args.length > 0){
				Task task = new Task(args[0]);
				int choice;
				int enteredchoice;

				do{
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
					System.out.println("14. Accept Multiple Strings");
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
							int stringLength = task.stringLength();
							System.out.println("Length of the String is " + stringLength);
							break;

						case 2:
							char[] arrayResult = task.charArray();
							System.out.print("Character Array: ");
							for (char c : arrayResult) {
								System.out.print(c + " ");
							}
							break;

						case 3:
							System.out.println("Enter the index to print the character from the last: ");
							int charindex = scanner.nextInt();
							char penultimateResult = task.penultimateChar(charindex);
							System.out.println("The character from last " + charindex + " places is " + penultimateResult);
							break;

						case 4:
							System.out.print("Enter a character to search: ");
							char searchingChar = scanner.next().charAt(0);
							System.out.println("The Number of Occurrences of the char is " + task.charOccurrence(searchingChar));
							break;

						case 5:
							System.out.print("Enter a character to find Greatest Position: ");
							char repeatingChar = scanner.next().charAt(0);
							if (task.greatPosition(repeatingChar) == -1){
								System.out.println("No such character exists.");
							} else {
								System.out.println("The greatest position of the char is " + task.greatPosition(repeatingChar));
							}
							break;

						case 6:
							while (true) {
								try{
									System.out.print("Enter the number of characters to print from the last: ");
									int noOfLastChars = scanner.nextInt();
									System.out.println("The last " + noOfLastChars + " characters are: " + task.lastFiveChar(noOfLastChars));
									break;
									}
								catch (InputMismatchException e){
									System.out.println("Invalid input, Please enter an integer.");
									scanner.nextLine();
								}
							}
							break;

						case 7:
							while (true){
								try {
									System.out.print("Enter the number of characters to print from the beginning: ");
									int noOfStartChars = scanner.nextInt();
									System.out.println("The First " + noOfStartChars + " characters are: " + task.firstThreeChar(noOfStartChars));
									break;
									}
									catch(InputMismatchException e){
									System.out.println("Invalid input, Please enter an integer.");
									scanner.nextLine();
								}
							}
							break;

						case 8:
							System.out.print("Enter the characters to substitute: ");
							String substituteString = scanner.nextLine();
							System.out.println("The Replaced String is: " + task.firstThreeReplace(substituteString));
							break;

						case 9:
							System.out.print("Enter the string to check from the start: ");
							String startCheckString = scanner.nextLine();
							System.out.println(task.checkingFirstThree(startCheckString));
							break;

						case 10:
							System.out.print("Enter the string to check from the end: ");
							String endCheckString = scanner.nextLine();
							System.out.println(task.checkingLastTwo(endCheckString));
							break;

						case 11:
							System.out.println(task.convertingToUpperCase());
							break;

						case 12:
							System.out.println(task.convertingToLowerCase());
							break;

						case 13:
							System.out.println(task.reversingString());
							break;

						case 14:
							System.out.print("Enter a line of multiple strings: ");
							String multiStringLine = scanner.nextLine();
							System.out.println("The Entered Multiple String line is: " + multiStringLine);
							break;

						case 15:
							try{
							System.out.print("Enter a line of multiple strings: ");
							String concatenateStringLine = scanner.nextLine();
							System.out.println("The Concatenated String: " + Task.concatenateMultipleString(concatenateStringLine));
							break;
							}
							catch(InvalidInputException e){
								System.out.println(e.getMessage());
							}

						case 16:
							System.out.print("Enter a line of multiple strings: ");
							String toBeEnclosedLine = scanner.nextLine();
							String[] enclosedArray = Task.encloseInArray(toBeEnclosedLine);
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
							System.out.println("Merged string: " + Task.mergeStringWithSymbol(multiStringArrayList , joiningcharacter));
							break;

						case 18:
							System.out.print("Enter the first string: ");
							String firstStringLine = scanner.nextLine();
							System.out.print("Enter the second string: ");
							String secondStringLine = scanner.nextLine();
							System.out.println(Task.areStringsCaseEqual(firstStringLine, secondStringLine));
							break;

						case 19:
							System.out.print("Enter the first string: ");
							String firstStringLineIC = scanner.nextLine();
							System.out.print("Enter the second string: ");
							String secondStringLineIC = scanner.nextLine();
							System.out.println(Task.areStringsIgnoreCaseEqual(firstStringLineIC, secondStringLineIC));
							break;

						case 20:
							System.out.print("Enter the string: ");
							String toBeTrimmedString = scanner.nextLine();
							System.out.println(Task.trimString(toBeTrimmedString));
							break;

						case 0:
							System.out.println("Terminated successfully");
							break;
					}
				}
 
				while (enteredchoice != 0);

			}
			else {
				System.out.println("No input found");
			}
		}
		catch(InvalidInputException e){
			System.out.println(e.getMessage());
		}
    }
}
