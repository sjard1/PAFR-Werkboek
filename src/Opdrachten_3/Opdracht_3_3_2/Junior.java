package Opdrachten_3.Opdracht_3_3_2;

/**
 * Created by sjard on 19-Nov-17.
 */
public class Junior extends Werknemer{

    Salary s = new Salary();

    Junior(String name) {
        super("Junior", name);
    }




    @Override
    void raiseSalary() {
        s.salary = s.salary * 1.05;
        System.out.println("nieuw salaris is " + s.salary);
    }
}
