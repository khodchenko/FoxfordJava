package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 { //Foxford
    public double countChange(int digitA, int digitB, int digitC, int digitD) {
        double cost = digitB;
        cost = cost / 100 + digitA;
        double price = digitD;
        price = price / 100 + digitC;
        return cost - price;
    }

    public int[] sort3Digit(int digitA, int digitB, int digitC) {
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

    public boolean checkTwoCoordinates(int x1, int y1, int x2, int y2) {
        return x1 * x2 > 0 && y1 * y2 > 0;
    }

    public int largestNumber(Scanner scanner) {
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

    public boolean triangleCheck(int a, int b, int c) {
        return a + b > c | a + c > b | b + c > a;
    }

    public String maskify(String str) { //Credit Card Mask
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

    public double[] tribonacci(double[] s, int n) { //Tribonacci Sequence
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
}
