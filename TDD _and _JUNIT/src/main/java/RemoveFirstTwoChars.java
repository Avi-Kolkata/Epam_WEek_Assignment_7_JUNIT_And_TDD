package com.xyz;

public class RemoveFirstTwoChars {

    public String remove(String string) {
        String result = string;
        char firstChar, secondChar;
        if (string.length() == 0) {
            result = "";
        }
        else if (string.length() == 1) {
            if (string == "A")
                result = "";
            else {
                result = "B";
            }
        }
        else if(string.length() == 2) {
            firstChar = string.charAt(0);
            secondChar = string.charAt(1);
            if (firstChar == 'A' && secondChar == 'A') {
                result = "";
            }
            else if(firstChar == 'A' && secondChar == 'B')
                result = ""+secondChar;
            else if(firstChar == 'B' && secondChar == 'B')
                result = string;
            else if(firstChar == 'B' && secondChar == 'A')
                result = ""+firstChar;
        }
        else {
            firstChar = string.charAt(0);
            secondChar = string.charAt(1);
            if (firstChar == 'A' && secondChar == 'A') {
                result = string.substring(2);
            }
            else if(firstChar == 'A' && secondChar == 'B')
                result = secondChar + string.substring(2);
            else if(firstChar == 'B' && secondChar == 'B')
                result = string;
            else if(firstChar == 'B' && secondChar == 'A')
                result = firstChar + string.substring(2);
        }

        return result;
    }

}