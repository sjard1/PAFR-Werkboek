package Opdrachten_3.Opdrachten_3_3_3;

/**
 * Created by sjard on 19-Nov-17.
 */
public class Main {
    public static void main(String[] args){
        Reciept p = new Reciept(10);
        Pin pi = new Pin();
        Betalen b = new Betalen(p,pi);

    }
}
