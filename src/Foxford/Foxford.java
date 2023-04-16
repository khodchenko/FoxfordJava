package Foxford;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Foxford {

    /**
     * Foxford
     */
    public static void repeatNumber(Scanner scanner) {
        System.out.println(scanner.nextInt());
    }

    /**
     * Foxford
     */
    public static void helloAnything(Scanner scanner) {
        System.out.println("Hello, " + scanner.nextLine() + "!");
    }

    /**
     * Foxford
     */
    public static void swapTwoDigitNumber(Scanner scanner) {
        int number = scanner.nextInt();
        System.out.println(number % 10 * 10 + number / 10);
    }


    /**
     * Foxford
     */
    public static double countChange(int digitA, int digitB, int digitC, int digitD) {
        double cost = digitB;
        cost = cost / 100 + digitA;
        double price = digitD;
        price = price / 100 + digitC;
        return cost - price;
    }

    /**
     * Foxford
     */
    public static int[] sort3Digit(int digitA, int digitB, int digitC) {
        int temp;

        if (digitC < digitA) {
            temp = digitA;
            digitA = digitC;
            digitC = temp;
        }

        if (digitB < digitA) {
            temp = digitB;
            digitA = digitB;
            digitB = temp;
        }

        if (digitC < digitB) {
            temp = digitB;
            digitB = digitC;
            digitC = temp;
        }

        return new int[]{digitA, digitB, digitC};
    }

    /**
     * Foxford
     */
    public static  boolean checkTwoCoordinates(int x1, int y1, int x2, int y2) {
        return x1 * x2 > 0 && y1 * y2 > 0;
    }

    /**
     * Foxford
     */
    public static int largestNumber(Scanner scanner) {
        int largestInt = 0;
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > largestInt) {
                largestInt = list.get(i);
            }
        }
        return largestInt;
    }

    /**
     * Foxford
     */
    public static boolean triangleCheck(int a, int b, int c) {
        return a + b > c | a + c > b | b + c > a;
    }

    /**
     * Foxford
     */
    public static int summaDecimal(Scanner scanner) {
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

    /**
     * Foxford
     */
    public static int countOnesInBinary(int a) {
        int counter = 0;
        char[] array = Integer.toBinaryString(a).toCharArray();
        for (int i = 0; i < array.length; i++) {
            counter++;
        }
        return counter;
    }

    public static int counterSumAllIntDivider(int number) {
        int sum = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Foxford Sort array by descending order and replace digit repeats
     *
     * @param array of digits
     * @return a string of digits that divided by spaces.
     */
    public static String arraySortDescendingOrder(int[] array) {
        Arrays.sort(array);

        return Arrays.toString(Arrays.stream(array).distinct().toArray());
    }

    /**
     * Foxford sorting one dimensional array of Integer by Bubble sorting.
     *
     * @param array of digits
     * @return sorted array.
     */
    public static int[] sortArrayOfIntByBubble(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    /**
     * Foxford sorting one dimensional array of Integer by Insertion sort.
     * Note: In the worst-case scenario - an array sorted in descending order.
     * In this case, each iteration shifts the sorted array by one O(n). You would have to do this for every element in every array, which would result in a complexity of O(n^2).
     * @param array of digits
     * @return sorted array.
     */
    public static int[] sortArrayOfIntByInsertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = current;
        }
        return array;
    }

    /**
     * Swapping method
     */
    private int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
}
