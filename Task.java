package com.task;
import java.util.List;
public class Task{
	String strinput;
	int charcount = 0;

	public Task(String strinput){
	this.strinput=strinput;
	}

	public int stringLength(){
		return strinput.length();
	}

	public char[] charArray(){
		return strinput.toCharArray();
	}

	public char penultimateChar(){
		return strinput.charAt(strinput.length() - 2);
	}

	public int charOccurrence(char charinput){
		for (int i = 0; i < strinput.length(); i++){
		if(strinput.charAt(i) == charinput){charcount++;}
		}
		return charcount;
	}

	public int greatPosition(char charinput){
		return strinput.lastIndexOf(charinput);
	}

	public String lastFiveChar(int endcharlength){
		if(strinput.length() < endcharlength){return strinput;}
		else{return strinput.substring(strinput.length() - endcharlength);}
	}

	public String firstThreeChar(int startcharlength){
		if(strinput.length() < startcharlength){return strinput;}
		else{return strinput.substring(0,startcharlength);}
	}
	
	public String firstThreeReplace(String subcharacters){
		int lensubchar = subcharacters.length();
		if(strinput.length() < lensubchar){return subcharacters;}
		else{return subcharacters + strinput.substring(lensubchar);}
	}

	public Boolean checkingFirstThree(String startchars){
		return (strinput.startsWith(startchars));
	}

	public Boolean checkingLastTwo(String endchars){
		return (strinput.endsWith(endchars));
	}

	public String convertingToUpperCase(){
		return (strinput.toUpperCase());
	}

	public String convertingToLowerCase(){
		return (strinput.toLowerCase());
	}
	
	public String reversingString(){
		String reversedstring = "";
		for(int i = strinput.length() - 1; i>=0; i--){
		reversedstring = reversedstring + strinput.charAt(i);
		}
		return reversedstring;
	}

	public static String concatenateMultipleString(String concatenatestringline){
		String concatenatedstring = "";
		String[] concatenatedarray = concatenatestringline.split(" ");
		for(String i : concatenatedarray){
			concatenatedstring = concatenatedstring + i;}
		return concatenatedstring;
	}
	
	public static String[] encloseInArray(String multistringinput){
		return multistringinput.split(" ");
	}

	public static String mergeStringWithSymbol(List<String> multistringinput){
		String mergedstring;
		return mergedstring = String.join("-", multistringinput);
	}

	public static Boolean areStringsCaseEqual(String str1, String str2){
		return str1.equals(str2);
	}

	public static Boolean areStringsIgnoreCaseEqual(String str1, String str2){
		return str1.equalsIgnoreCase(str2);
	}

	public static String trimString(String str){
		return str.trim();
	}
}
