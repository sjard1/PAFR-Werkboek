package Opdrachten_3.Opdracht_3_3_2;

/**
 * Created by sjard on 19-Nov-17.
 */
public class Salary {

    double salary;
    double getSalary(){
        return this.salary;
    }
    void setSalary(double i){
        this.salary =  i;
        System.out.println("Nieuw salaris is: " + this.salary);
    }
}
