package Task2;

public class Task2 {
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

    public int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
}
