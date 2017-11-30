package Opdrachten_2.Opdracht_2_3_1;

/**
 * Created by sjard on 18-Nov-17.
 */
import java.util.ArrayList;
import java.util.List;

public class Client
{
    public static void main(String...args)
    {
        List<School> ls = new ArrayList<School>();
        School s1 = new Student("jeroen","weber",1234567);
        ls.add(s1);
        School s2 = new Docent("kees","haverkamp",1234568);
        ls.add(s2);
//………
        for(School i : ls) {
            System.out.println(i.toString());
        }
    }


}

