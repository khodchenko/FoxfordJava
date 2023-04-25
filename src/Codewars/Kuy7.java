package Codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kuy7 {
    /**
     * 7: Codewars Credit Card Mask: a function maskify, which changes all but the last four characters into '#'.
     *
     * @param str is unencrypted string.
     * @return encrypted string.
     */
    public static String maskify(String str) {//Credit Card Mask
        return str.replaceAll(".(?=.{4})", "#");
    }

    /**
     * 7: Codewars Form The Minimum
     *
     * @param values list of digits
     * @return the smallest number that could be formed from these digits, using the digits only once (ignore duplicates).
     */
    public static int minValueAnotherVariant(int[] values) {
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
     * 7: Codewars Maximum Multiple
     * Given a Divisor and a Bound, find N.
     * N is less than or equal to bound.
     * N is greater than 0.
     *
     * @param divisor int
     * @param bound   int
     * @return the largest integer N
     */
    public static int maxMultiple(int divisor, int bound) {
        int maxMultiple = 0;
        for (int i = 1; i <= bound; i++) {
            if (i % divisor == 0) {
                maxMultiple = i;
            }
        }
        return maxMultiple;
    }

    /**
     * 7: Isograms
     * a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
     *
     * @param str that contains only letters
     * @return true if str is Isogram
     */
    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 7: Shortest Word
     *
     * @param s any string
     * @return length of the shortest word.
     */
    public static int findShort(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        return Arrays.stream(s.split("\\s+"))
                .mapToInt(String::length)
                .min()
                .orElse(0);
    }

    /**
     * 7: Reverse words
     *
     * @param original any string
     * @return reversed string.
     */
    public static String reverseWords(final String original) {
        if (original.trim().isEmpty()) {
            return original;
        }
        return Arrays.stream(original.split(" "))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));
    }

    /**
     * 7: Vowel Count
     *
     * @param str will only consist of lower case letters and/or spaces.
     * @return the number (count) of vowels in the given string.
     */
    public static int getCount(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        int counter = 0;
        for (char c : charArray) {
            if (c == 'a' ||
                    c == 'e' ||
                    c == 'i' ||
                    c == 'o' ||
                    c == 'u') counter++;
        }
        return counter;
    }

}
