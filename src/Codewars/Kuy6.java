package Codewars;

import java.util.Arrays;
import java.util.Stack;

public class Kuy6 {
    /**
     * 6: Codewars Tribonacci Sequence
     *
     * @param sequence of a pair of numbers
     * @param n        number of elements to return
     * @return sequence of numbers in array od double
     */
    public static double[] tribonacci(double[] sequence, int n) {
        double[] tritab = Arrays.copyOf(sequence, n);
        for (int i = 3; i < n; i++) {
            tritab[i] = tritab[i - 1] + tritab[i - 2] + tritab[i - 3];
        }
        return tritab;

    }

    /**
     * 6: Codewars Find the missing letter
     *
     * @param array of char sequence
     * @return the missing char in the array of char sequence
     * The array will always contain letters in only one case.
     */
    public static char findMissingLetter(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] > 1) {
                return (char) (array[i] + 1);
            }
        }
        return ' ';
    }

    /**
     * 6: Codewars Backspaces in string
     *
     * @param string any string
     * @return string where all "#" characters perform the Backspace function and remove the previous character
     */
    public static String cleanString(String string) {

        Stack<Character> stack = new Stack<>();
        for (char ch : string.toCharArray()) {
            if (ch != '#') {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    /**
     * 6: Codewars Decode the Morse code
     *
     * @param morseCode a string morse code as input
     * @return a decoded human-readable string.
     */
    public static String decode(String morseCode) {
        String[] words = morseCode.trim().split(" {3}");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                result.append(getLetter(letter));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

    /**
     * Codewars Decode the Morse code dictionary
     */
    private static String getLetter(String code) {
        switch (code) {
            case ".-":
                return "A";
            case "-...":
                return "B";
            case "-.-.":
                return "C";
            case "-..":
                return "D";
            case ".":
                return "E";
            case "..-.":
                return "F";
            case "--.":
                return "G";
            case "....":
                return "H";
            case "..":
                return "I";
            case ".---":
                return "J";
            case "-.-":
                return "K";
            case ".-..":
                return "L";
            case "--":
                return "M";
            case "-.":
                return "N";
            case "---":
                return "O";
            case ".--.":
                return "P";
            case "--.-":
                return "Q";
            case ".-.":
                return "R";
            case "...":
                return "S";
            case "-":
                return "T";
            case "..-":
                return "U";
            case "...-":
                return "V";
            case ".--":
                return "W";
            case "-..-":
                return "X";
            case "-.--":
                return "Y";
            case "--..":
                return "Z";
            case "-----":
                return "0";
            case ".----":
                return "1";
            case "..---":
                return "2";
            case "...--":
                return "3";
            case "....-":
                return "4";
            case ".....":
                return "5";
            case "-....":
                return "6";
            case "--...":
                return "7";
            case "---..":
                return "8";
            case "----.":
                return "9";
            case ".-.-.-":
                return ".";
            case "--..--":
                return ",";
            case "..--..":
                return "?";
            case "-.-.--":
                return "!";
            case "-....-":
                return "-";
            case ".-..-.":
                return "\"";
            case ".----.":
                return "'";
            case "-..-.":
                return "/";
            case "-.--.":
                return "(";
            case "-.--.-":
                return ")";
            case ".-...":
                return "&";
            case "---...":
                return ":";
            case "-.-.-.":
                return ";";
            case "-...-":
                return "=";
            case ".-.-.":
                return "+";
            case "..--.-":
                return "_";
            case "...-..-":
                return "$";
            case ".--.-.":
                return "@";
            default:
                return "";
        }
    }

    /**
     * 6: Codewars Who likes it?
     *
     * @param names an array containing the names of people
     * @return return the display text as shown in the examples:
     * []                                -->  "no one likes this"
     * ["Peter"]                         -->  "Peter likes this"
     * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
     */
    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }

    /**
     * 6: Codewars Valid Phone Number
     * A function that accepts a string, and returns true if it is in the form of a phone number.
     *
     * @param phoneNumber a string with phone number in format "(123) 456-7890"
     * @return true if it is in the form of a phone number
     */
    public static boolean validPhoneNumber(String phoneNumber) {
        String regex = "\\(\\d{3}\\) \\d{3}-\\d{4}";
        return phoneNumber.matches(regex);
    }
}
