package Task3;

import java.util.*;
import java.util.regex.Pattern;

public class Task3 { //Foxford
    public int summaDecimal(Scanner scanner) {
        int summa = 0;
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) % 10 == 0) {
                summa += list.get(i);
            }
        }
        return summa;
    }

    public int countOnesInBinary(int a) {
        int counter = 0;
        char[] array = Integer.toBinaryString(a).toCharArray();
        for (int i = 0; i < array.length; i++) {
            counter++;
        }
        return counter;
    }

    public int counterSumAllIntDivider(int number) {
        int sum = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int maxMultiple(int divisor, int bound) { //Codewars Maximum Multiple
        int maxMultiple = 0;
        for (int i = 1; i <= bound; i++) {
            if (i % divisor == 0) {
                maxMultiple = i;
            }
        }
        return maxMultiple;
    }

    public int minValue(int[] values) { //Codewars Form The Minimum
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

    public int minValueAnotherVariant(int[] values) { //Codewars Form The Minimum
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

    public static boolean validPhoneNumber(String phoneNumber) { //Codewars Valid Phone Number
        String regex = "\\(\\d{3}\\) \\d{3}-\\d{4}";
        return phoneNumber.matches(regex);
    }
}
