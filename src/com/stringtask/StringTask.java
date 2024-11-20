package com.stringtask;

import java.util.*;
import com.stringexception.StringException;
import com.utils.StringValidator;

public class StringTask {
    private int charCount = 0;

    public int getStringLength(String inputString) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            return inputString.length();
        } catch (Exception e) {
            throw new StringException("Failed to get string length", e);
        }
    }

    public char[] convertCharArray(String inputString) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            return inputString.toCharArray();
        } catch (Exception e) {
            throw new StringException("Failed to convert string to char array", e);
        }
    }

    public char getPenultimateChar(String inputString, int indexFromEnd) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            if (indexFromEnd <= 0 || inputString.length() < indexFromEnd) {
                throw new StringException("Invalid index for penultimate character");
            }
            return inputString.charAt(inputString.length() - indexFromEnd);
        } catch (Exception e) {
            throw new StringException("Failed to get penultimate character", e);
        }
    }

    public int getCharOccurrence(String inputString, char charInput) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            charCount = 0;
            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == charInput) {
                    charCount++;
                }
            }
            return charCount;
        } catch (Exception e) {
            throw new StringException("Failed to count character occurrences", e);
        }
    }

    public int getGreatestPosition(String inputString, char charInput) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            return inputString.lastIndexOf(charInput);
        } catch (Exception e) {
            throw new StringException("Failed to get greatest position of character", e);
        }
    }

    public String getLastNChar(String inputString, int endCharLength) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            if (endCharLength <= 0 || inputString.length() < endCharLength) {
                throw new StringException("Invalid length for substring");
            }
            return inputString.substring(inputString.length() - endCharLength);
        } catch (Exception e) {
            throw new StringException("Failed to get last N characters", e);
        }
    }

    public String getFirstNChar(String inputString, int startCharLength) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
			
            if (startCharLength <= 0 || inputString.length() < startCharLength) {
                throw new StringException("Invalid length for substring");
            }
			
            return inputString.substring(0, startCharLength);
        } catch (Exception e) {
            throw new StringException("Failed to get first N characters", e);
        }
    }

    public String replaceSubstring(String inputString, String replacement, int replaceLength, String position) throws StringException {
    try {
        StringValidator.checkNullOrEmpty(inputString);
        StringValidator.checkNullOrEmpty(replacement);

        if (replaceLength < 0 || inputString.length() < replaceLength) {
            throw new StringException("Invalid length to replace");
        }

        switch (position.toLowerCase()) {
            case "front":
                return replacement + inputString.substring(replaceLength);
            case "rear":
                return inputString.substring(0, inputString.length() - replaceLength) + replacement;
            case "middle":
                int midPoint = inputString.length() / 2;
                String firstPart = inputString.substring(0, midPoint - replaceLength / 2);
                String lastPart = inputString.substring(midPoint + replaceLength / 2);
                return firstPart + replacement + lastPart;
            default:
                throw new IllegalArgumentException("Invalid position. Use 'front', 'rear', or 'middle'.");
        }
    } catch (Exception e) {
        throw new StringException("Failed to replace substring", e);
    }
}


    public Boolean compareStartChars(String inputString, String startChars) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            StringValidator.checkNullOrEmpty(startChars);
            return inputString.startsWith(startChars);
        } catch (Exception e) {
            throw new StringException("Failed to compare start characters", e);
        }
    }

    public Boolean compareEndChars(String inputString, String endChars) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            StringValidator.checkNullOrEmpty(endChars);
            return inputString.endsWith(endChars);
        } catch (Exception e) {
            throw new StringException("Failed to compare end characters", e);
        }
    }

    public String convertingToUpperCase(String inputString) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            return inputString.toUpperCase();
        } catch (Exception e) {
            throw new StringException("Failed to convert to uppercase", e);
        }
    }

    public String convertingToLowerCase(String inputString) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            return inputString.toLowerCase();
        } catch (Exception e) {
            throw new StringException("Failed to convert to lowercase", e);
        }
    }

    public String reversingString(String inputString) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            char[] reverseList = inputString.toCharArray();
            int left = 0, right = reverseList.length - 1;
            while (left < right) {
                char temp = reverseList[left];
                reverseList[left] = reverseList[right];
                reverseList[right] = temp;
                left++;
                right--;
            }
            return new String(reverseList);
        } catch (Exception e) {
            throw new StringException("Failed to reverse string", e);
        }
    }

    public String concatenateMultipleStrings(String inputString, String splitChar) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            StringValidator.checkNullOrEmpty(splitChar);
            return inputString.replace(splitChar, "");
        } catch (Exception e) {
            throw new StringException("Failed to concatenate strings", e);
        }
    }

    public String[] encloseInArray(String inputString, String splitChars) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            StringValidator.checkNullOrEmpty(splitChars);
            return inputString.split(splitChars);
        } catch (Exception e) {
            throw new StringException("Failed to enclose in array", e);
        }
    }

    public String mergeStringWithSymbol(List<String> inputStrings, CharSequence joiningChar) throws StringException {
        try {
            if (inputStrings == null || inputStrings.isEmpty()) {
                throw new StringException("List can't be null or empty");
            }
            return String.join(joiningChar, inputStrings);
        } catch (Exception e) {
            throw new StringException("Failed to merge strings with symbol", e);
        }
    }

    public Boolean areStringsCaseEqual(String string1, String string2) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(string1);
            StringValidator.checkNullOrEmpty(string2);
            return string1.equals(string2);
        } catch (Exception e) {
            throw new StringException("Failed to compare strings (case-sensitive)", e);
        }
    }

    public Boolean areStringsIgnoreCaseEqual(String string1, String string2) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(string1);
            StringValidator.checkNullOrEmpty(string2);
            return string1.equalsIgnoreCase(string2);
        } catch (Exception e) {
            throw new StringException("Failed to compare strings (ignore case)", e);
        }
    }

    public String trimString(String inputString) throws StringException {
        try {
            StringValidator.checkNullOrEmpty(inputString);
            return inputString.trim();
        } catch (Exception e) {
            throw new StringException("Failed to trim string", e);
        }
    }
}
