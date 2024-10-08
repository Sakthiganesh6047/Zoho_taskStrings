package com.task;

import java.util.*;
import com.invalidinputexception.*;

public class Task {
    String strinput;
    int charcount = 0;
    int inputstringlength;

    public Task(String strinput) throws InvalidInputException{
        this.strinput = strinput;
        stringValidity(strinput);
        this.inputstringlength = strinput.length();
    }

    private static void stringValidity(String enteringstring) throws InvalidInputException{
        if (enteringstring == null || enteringstring.isEmpty()){
            throw new InvalidInputException("Input can't be null or empty");
        }
    }

    public int stringLength(){
        return inputstringlength;
    }

    public char[] charArray(){
        return strinput.toCharArray();
    }

    public char penultimateChar(int indexofcharacter) throws InvalidInputException{
        if (inputstringlength < indexofcharacter) {
            throw new InvalidInputException("String is too little");
        }
        return strinput.charAt(inputstringlength - indexofcharacter);
    }

    public int charOccurrence(char charinput) throws InvalidInputException{
        stringValidity(String.valueOf(charinput));
        charcount = 0;
        for (int i = 0; i < inputstringlength; i++){
            if (strinput.charAt(i) == charinput){
                charcount++;
            }
        }
        return charcount;
    }

    public int greatPosition(char charinput) throws InvalidInputException{
        stringValidity(String.valueOf(charinput));
        return strinput.lastIndexOf(charinput);
    }

    public String lastFiveChar(int endcharlength) throws InvalidInputException{
        if (endcharlength <= 0){
            throw new InvalidInputException("Input must be greater than 0");
        }
        else if (inputstringlength < endcharlength){
            return strinput;
        } 
		else {
            return strinput.substring(inputstringlength - endcharlength);
        }
    }

    public String firstThreeChar(int startcharlength) throws InvalidInputException {
        if (startcharlength <= 0){
            throw new InvalidInputException("Input must be greater than 0");
        }
        else if (inputstringlength < startcharlength){
            return strinput;
        } else {
            return strinput.substring(0, startcharlength);
        }
    }

    public String firstThreeReplace(String subcharacters) throws InvalidInputException {
        stringValidity(subcharacters);
        int lensubchar = subcharacters.length();
        if (inputstringlength < lensubchar){
            return subcharacters;
        } else {
            return subcharacters + strinput.substring(lensubchar);
        }
    }

    public Boolean checkingFirstThree(String startchars) throws InvalidInputException{
        stringValidity(startchars);
        return strinput.startsWith(startchars);
    }

    public Boolean checkingLastTwo(String endchars) throws InvalidInputException{
        stringValidity(endchars);
        return strinput.endsWith(endchars);
    }

    public String convertingToUpperCase(){
        return strinput.toUpperCase();
    }

    public String convertingToLowerCase(){
        return strinput.toLowerCase();
    }

    public String reversingString(){
        ArrayList<Character> charlist = new ArrayList<>();
        for (char c : strinput.toCharArray()) {
            charlist.add(c);
        }
        Collections.reverse(charlist);
        char[] reversedarray = new char[charlist.size()];
        for (int i = 0; i < charlist.size(); i++) {
            reversedarray[i] = charlist.get(i);
        }
        return new String(reversedarray);
    }

    public static String concatenateMultipleString(String concatenatestringline) throws InvalidInputException{
        stringValidity(concatenatestringline);
        String concatenatedstring = "";
        String[] concatenatedarray = concatenatestringline.split(" ");
        for (String i : concatenatedarray) {
            concatenatedstring = concatenatedstring + i;
        }
        return concatenatedstring;
    }

    public static String[] encloseInArray(String multistringinput) throws InvalidInputException{
        stringValidity(multistringinput);
        return multistringinput.split(" ");
    }

    public static String mergeStringWithSymbol(List<String> multistringinput , CharSequence joiningcharacter) throws InvalidInputException{
        if (multistringinput == null || multistringinput.isEmpty()) {
            throw new InvalidInputException("List can't be null or empty");
        }
        return String.join(joiningcharacter, multistringinput);
    }

    public static Boolean areStringsCaseEqual(String str1, String str2) throws InvalidInputException{
        stringValidity(str1);
        stringValidity(str2);
        return str1.equals(str2);
    }

    public static Boolean areStringsIgnoreCaseEqual(String str1, String str2) throws InvalidInputException{
        stringValidity(str1);
        stringValidity(str2);
        return str1.equalsIgnoreCase(str2);
    }

    public static String trimString(String str) throws InvalidInputException{
        stringValidity(str);
        return str.trim();
    }
}
