import Codewars.Codewars;
import Foxford.Foxford;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Codewars codewars = new Codewars();
        Foxford foxford = new Foxford();

        System.out.println(Arrays.toString(foxford.sortArrayOfIntByInsertion(new int[]{2, 32, 32, 1, 23, 5, 7, 37, 81})));

    }

}