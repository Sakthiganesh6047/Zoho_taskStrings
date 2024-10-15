package com.task;

import java.util.*;
import com.nullemptyexception.*;

public class Task {
    private int charcount = 0;
    private int inputstringlength;

    private static void checkNullOrEmpty(String enteringstring) throws NullEmptyException{
        if (enteringstring == null || enteringstring.isEmpty()){
            throw new NullEmptyException("Input can't be null or empty");
        }
    }

    public int getStringLength(String inputstring){
        return inputstring.length();
    }

    public char[] ConvertCharArray(String chararrayinput){
        return chararrayinput.toCharArray();
    }

    public char getPenultimateChar(String penultimateinput, int indexofcharacter) throws NullEmptyException{
        if (penultimateinput.length() < indexofcharacter) {
            throw new NullEmptyException("String is too little");
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
            return lastncharinput;
        } 
		else {
            return lastncharinput.substring(lastncharinput.length() - endcharlength);
        }
    }

    public String getFirstNChar(String firstncharinput , int startcharlength) throws NullEmptyException {
        if (startcharlength <= 0){
            throw new NullEmptyException("Input must be greater than 0");
        }
        else if (firstncharinput.length() < startcharlength){
            return firstncharinput;
        } else {
            return firstncharinput.substring(0, startcharlength);
        }
    }

    public String replaceSubstring(String replacefirstninput , String subcharacters , int noofcharacterstoreplace) throws NullEmptyException {
        checkNullOrEmpty(replacefirstninput);
		checkNullOrEmpty(subcharacters);
        //int lensubchar = subcharacters.length();
        if (replacefirstninput.length() < noofcharacterstoreplace){
            return subcharacters;
        } else {
            return subcharacters + replacefirstninput.substring(noofcharacterstoreplace);
        }
    }

    public Boolean checkingFirstThree(String startswithinput , String startchars) throws NullEmptyException{
        checkNullOrEmpty(startswithinput);
		checkNullOrEmpty(startchars);
        return startswithinput.startsWith(startchars);
    }

    public Boolean checkingLastTwo(String endswithinput , String endchars) throws NullEmptyException{
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
        ArrayList<Character> charlist = new ArrayList<>();
        for (char c : reversinginput.toCharArray()) {
            charlist.add(c);
        }
        Collections.reverse(charlist);
        char[] reversedarray = new char[charlist.size()];
        for (int i = 0; i < charlist.size(); i++) {
            reversedarray[i] = charlist.get(i);
        }
        return new String(reversedarray);
    }

    public String concatenateMultipleString(String concatenatestringline , String splittingcharacter) throws NullEmptyException{
        checkNullOrEmpty(concatenatestringline);
        String concatenatedstring = "";
        String[] concatenatedarray = concatenatestringline.split(splittingcharacter);
        for (String i : concatenatedarray) {
            concatenatedstring = concatenatedstring + i;
        }
        return concatenatedstring;
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
