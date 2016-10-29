package com.gerdface;

public class HowToUseStrings {

    //This method finds a specific character in String s at index
    public static char findCharAtIndex(String s, int x) {
        char result = s.charAt(x);
        return result;
    }

    public static boolean isTheSameText (String s, String y) {
        boolean result = s.equalsIgnoreCase(y);
        return result;
    }

    public static int returnIntIfStringsAreTheSame (String s, String y) {
        int jibberjabber = 15;

        if (isTheSameText(s, y)) {
            return (jibberjabber - 5);
        } else {
            return jibberjabber;
        }
    }

    public static String replaceAllString(String e, String n) {
        String statement = "Steve knows everything about Java!";
        return statement.replaceAll(e, n);
    }

    public static String convertToLowerCase(String u) {
        String nowLowerCase = u.toLowerCase();
        return nowLowerCase;
    }
}