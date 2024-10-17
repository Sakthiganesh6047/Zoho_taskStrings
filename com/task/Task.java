package com.task;

import java.util.*;
import com.nullemptyexception.*;

public class Task {
    private int charcount = 0;

    public void checkNullOrEmpty(String enteringstring) throws NullEmptyException{
        if (enteringstring == null || enteringstring.isEmpty()){
            throw new NullEmptyException("Input can't be null or empty");
        }
    }

    public int getStringLength(String inputstring) throws NullEmptyException{
		checkNullOrEmpty(inputstring);
        return inputstring.length();
    }

    public char[] ConvertCharArray(String chararrayinput) throws NullEmptyException{
		checkNullOrEmpty(chararrayinput);
        return chararrayinput.toCharArray();
    }

    public char getPenultimateChar(String penultimateinput, int indexofcharacter) throws NullEmptyException{
        if (penultimateinput.length() < indexofcharacter) {
            throw new NullEmptyException("String is too little to have a penultimate ");
        }
        return penultimateinput.charAt(penultimateinput.length() - indexofcharacter);
    }

    public int getCharOccurrence(String occurrenceinput , char charinput) throws NullEmptyException{
        checkNullOrEmpty(occurrenceinput);
		checkNullOrEmpty(String.valueOf(charinput));
        charcount = 0;
        for (int i = 0; i < occurrenceinput.length(); i++){
            if (occurrenceinput.charAt(i) == charinput){
                charcount++;
            }
        }
        return charcount;
    }

    public int getGreatestPosition(String greatestpositioninput , char charinput) throws NullEmptyException{
        checkNullOrEmpty(greatestpositioninput);
		checkNullOrEmpty(String.valueOf(charinput));
        return greatestpositioninput.lastIndexOf(charinput);
    }

    public String getLastNChar(String lastncharinput , int endcharlength) throws NullEmptyException{
        if (endcharlength <= 0){
            throw new NullEmptyException("Input must be greater than 0");
        }
        else if (lastncharinput.length() < endcharlength){
            throw new NullEmptyException("String doesn't contain " + endcharlength + "characters");
        } 
		else {
            return lastncharinput.substring(lastncharinput.length() - endcharlength);
        }
    }

    public String getFirstNChar(String firstncharinput , int startcharlength) throws NullEmptyException {
        if (startcharlength <= 0){
            throw new NullEmptyException("Input must be greater than 0");
        }
        else if(firstncharinput.length() < startcharlength){
            throw new NullEmptyException("String doesn't contain " + startcharlength + "characters");
        } 
		else{
            return firstncharinput.substring(0, startcharlength);
        }
    }

    public String replaceSubstring(String replacefirstninput , String subcharacters , int noofcharacterstoreplace) throws NullEmptyException {
        checkNullOrEmpty(replacefirstninput);
		checkNullOrEmpty(subcharacters);
        if(replacefirstninput.length() < noofcharacterstoreplace){
            return subcharacters;
        } 
		else{
            return subcharacters + replacefirstninput.substring(noofcharacterstoreplace);
        }
    }

    public Boolean compareStartChars(String startswithinput , String startchars) throws NullEmptyException{
        checkNullOrEmpty(startswithinput);
		checkNullOrEmpty(startchars);
        return startswithinput.startsWith(startchars);
    }

    public Boolean compareEndChars(String endswithinput , String endchars) throws NullEmptyException{
        checkNullOrEmpty(endswithinput);
		checkNullOrEmpty(endchars);
        return endswithinput.endsWith(endchars);
    }

    public String convertingToUpperCase(String touppercaseinput){
        return touppercaseinput.toUpperCase();
    }

    public String convertingToLowerCase(String tolowercaseinput){
        return tolowercaseinput.toLowerCase();
    }
	
	public String reversingString(String reversinginput){
		char[] reverselist = reversinginput.toCharArray();
		int leftend = 0;
		int rightend = reverselist.length - 1;
		while (leftend < rightend) {
			char tempuse = reverselist[leftend];
			reverselist[leftend] = reverselist[rightend];
			reverselist[rightend] = tempuse;
			leftend++;
			rightend--;
		}
		return new String(reverselist);
	}

	public String concatenateMultipleString(String concatenatestringline , String splittingcharacter) throws NullEmptyException{
		checkNullOrEmpty(concatenatestringline);
		checkNullOrEmpty(splittingcharacter);
		return concatenatestringline.replaceAll(splittingcharacter , "");
	}

    public String[] encloseInArray(String multistringinput , String splittingchars) throws NullEmptyException{
        checkNullOrEmpty(multistringinput);
		checkNullOrEmpty(String.valueOf(splittingchars));
        return multistringinput.split(splittingchars);
    }

    public String mergeStringWithSymbol(List<String> multistringinput , CharSequence joiningcharacter) throws NullEmptyException{
        if (multistringinput == null || multistringinput.isEmpty()) {
            throw new NullEmptyException("List can't be null or empty");
        }
        return String.join(joiningcharacter, multistringinput);
    }

    public Boolean areStringsCaseEqual(String str1, String str2) throws NullEmptyException{
        checkNullOrEmpty(str1);
        checkNullOrEmpty(str2);
        return str1.equals(str2);
    }

    public Boolean areStringsIgnoreCaseEqual(String str1, String str2) throws NullEmptyException{
        checkNullOrEmpty(str1);
        checkNullOrEmpty(str2);
        return str1.equalsIgnoreCase(str2);
    }

    public String trimString(String str) throws NullEmptyException{
        checkNullOrEmpty(str);
        return str.trim();
    }
}
