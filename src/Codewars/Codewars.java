package Codewars;

import java.util.Arrays;
import java.util.Stack;

public class Codewars {

    /**
     * Codewars Credit Card Mask
     */
    public String maskify(String str) {
        char[] array = str.toCharArray();
        if (array.length <= 4) {
            return str;
        }
        for (int i = 0; i < array.length - 4; i++) {
            array[i] = '#';
        }
        StringBuilder newString = new StringBuilder();
        for (char c : array) {
            newString.append(c);
        }
        return String.valueOf(newString);
    }

    public String maskifyShort(String str) {//Credit Card Mask
        return str.replaceAll(".(?=.{4})", "#");
    }

    /**
     * Codewars Tribonacci Sequence
     */
    public double[] tribonacci(double[] s, int n) {
        double[] tritab = Arrays.copyOf(s, n);
        for (int i = 3; i < n; i++) {
            tritab[i] = tritab[i - 1] + tritab[i - 2] + tritab[i - 3];
        }
        return tritab;

    }

    public int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }

    /**
     * Codewars Form The Minimum
     */
    public int minValue(int[] values) {
        int[] newArray = removeDuplicates(values);
        Arrays.sort(newArray);
        return getMinValue(newArray);
    }

    private static int getMinValue(int[] newArray) {
        int minValue = 0;
        for (int i = newArray.length - 1, n = 0; i >= 0; --i, n++) {
            int pos = (int) Math.pow(10, i);
            minValue += newArray[n] * pos;
        }
        return minValue;
    }

    public static int[] removeDuplicates(int[] arr) {
        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[end - 1];
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];

        System.arraycopy(arr, 0, whitelist, 0, end);
        return whitelist;
    }

    /**
     * Codewars Form The Minimum
     */
    public int minValueAnotherVariant(int[] values) {
        int end = values.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (values[i] == values[j]) {
                    values[j] = values[end - 1];
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];

        System.arraycopy(values, 0, whitelist, 0, end);

        Arrays.sort(whitelist);

        int minValue = 0;
        for (int i = whitelist.length - 1, n = 0; i >= 0; --i, n++) {
            int pos = (int) Math.pow(10, i);
            minValue += whitelist[n] * pos;
        }

        return minValue;
    }

    /**
     * Codewars Valid Phone Number
     */
    public static boolean validPhoneNumber(String phoneNumber) {
        String regex = "\\(\\d{3}\\) \\d{3}-\\d{4}";
        return phoneNumber.matches(regex);
    }

    /**
     * Codewars Human Readable Time
     *
     * @param seconds a non-negative integer (seconds) as input
     * @return returns the time in a human-readable format (HH:MM:SS)
     */
    public static String makeReadable(int seconds) { //Codewars
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    /**
     * Codewars Who likes it?
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
     * Codewars Decode the Morse code
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
    public static String getLetter(String code) {
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
     * Codewars Backspaces in string
     *
     * @param string any string
     * @return string where all "#" characters perform the Backspace function and remove the previous character
     */
    public String cleanString(String string) {

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
}
