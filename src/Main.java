import Codewars.Codewars;
import Codewars.Kuy7;
import Foxford.Foxford;
import Foxford.ObjectTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Codewars codewars = new Codewars();
        Foxford foxford = new Foxford();
        ArrayList<String> list = new ArrayList<String>();
        list.add("2fs");
        ObjectTask object = new ObjectTask("TEST", 1,list);


        System.out.println(object.toString());

    }

}