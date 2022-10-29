package com.project.webproject.utility;

public class StringUtil {
    public static boolean isNotEmpty(String s) {
        return !s.isEmpty();
    }

    public static boolean isEmpty(String s) {
        return !isNotEmpty(s);
    }

    public static boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }

    public static boolean isNotNumeric(String s) {
        return !isNumeric(s);
    }

    public static String isBlankIfEmpty(String s) {
        return isEmpty(s) ? "" : s;
    }

    public static String isBlankIfEmpty(String s, String def) {
        return isEmpty(s) ? def : s;
    }

    public static boolean isMatch(String val1, String val2) {
        return val1.equals(val2);
    }

    public static boolean isNotMatch(String val1, String val2) {
        return !isMatch(val1, val2);
    }

    public static boolean isAlphaNumeric(String s) {
        return isMatch(s, "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$");
    }
}
