import Task3.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Scanner scanner = new Scanner(System.in);

        System.out.println(task3.minValue(new int[]{1,5,6,2,7,1,4,6,2}));
    }
}