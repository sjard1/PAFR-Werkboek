package Opdrachten_3.Opdracht_3_3_2;

import java.util.ArrayList;

/**
 * Created by sjard on 19-Nov-17.
 */
public abstract class Werknemer extends Salary {

    String k, name;

     static ArrayList<Werknemer> werknemers = new ArrayList<Werknemer>();

     Werknemer(String k, String name){
         this.k = k;
         this.name = name;
     };


     String getName(){
         return this.name;
     }

     void raiseSalary(){
//         switch(this.k){
//             case "Junior" : setSalary(1.05);
//                 System.out.println("Log message: employee " + getName() + " has new salary: " + getSalary());
//             break;
//             case "Medior" : setSalary(1.06);
//             break;
//             case "Senior" : setSalary(1.07);
//         }
     };


}
