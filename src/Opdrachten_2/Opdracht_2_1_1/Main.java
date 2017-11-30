package Opdrachten_2.Opdracht_2_1_1;

/**
 * Created by sjard on 18-Nov-17.
 */
public class Main {


    public static void main(String[] args) {
       Teamleiders teamleider = new Teamleiders();
       teamleider.naam = "Tommy";

       System.out.println(teamleider.naam);

       Docent doc = new Docent();
       System.out.print(doc.isDocent);
    }
}
