package Opdrachten_3.Opdracht_3_3_2;

/**
 * Created by sjard on 19-Nov-17.
 */
public class Main {
    public static void main(String[]args) {
        Werknemer sjard = new Junior("Sjard");

        sjard.getSalary();
        sjard.setSalary(10);
        sjard.raiseSalary();

        Werknemer.werknemers.add(sjard);
    }
}
