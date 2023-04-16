import Codewars.Codewars;
import Codewars.Kuy6;
import Foxford.Foxford;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Codewars codewars = new Codewars();
        Foxford foxford = new Foxford();

        System.out.println(Kuy6.findMissingLetter((new char[] { 'a','b','c','d','f' })));

    }

}