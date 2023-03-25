package Task1;

import java.util.Scanner;

public class Task1 { //Foxford

    public void repeatNumber(Scanner scanner) {
        System.out.println(scanner.nextInt());
    }

    public void helloAnything(Scanner scanner) {
        System.out.println("Hello, " + scanner.nextLine() + "!");
    }

    public void swapTwoDigitNumber(Scanner scanner) {
        int number = scanner.nextInt();
        System.out.println(number % 10 * 10 + number / 10);
    }
}
