import Task1.Task1;
import Task2.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Scanner scanner = new Scanner(System.in);
        double[] n = new double[] {1};

        System.out.println(Arrays.toString(task2.tribonacci(n, 10)));
    }
}