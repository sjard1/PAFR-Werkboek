package Opdrachten_3.Opdracht_3_1_1;

import java.util.Scanner;

/**
 * Created by sjard on 18-Nov-17.
 */
public class Main {
    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter een formaat: 1) word ");
        int n = reader.nextInt();

        Formaat m = new Word();
        Scanner texxt = new Scanner(System.in);
        System.out.println("Voer text in");
        String nn = texxt.nextLine();
        m.setText(nn);
        m.printInFormaat();
    }
}
