package Codewars;

import java.util.Arrays;

public class Codewars {
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
