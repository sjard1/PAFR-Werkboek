package Composite_Pattern;

import java.util.ArrayList;

/**
 * Created by sjard on 27-Nov-17.
 */
public class SamengesteldCijfer implements Cijfer {


    private ArrayList<Cijfer> cijfers = new ArrayList<Cijfer>();
    private ArrayList<Double> gewicht = new ArrayList<Double>();

    public SamengesteldCijfer(){

    }

    @Override
    public double BerekenCijfer() {
        double totaal = 0;
        for (int i = 0; i<cijfers.size(); i++)
              {
                 totaal += cijfers.get(i).BerekenCijfer() * gewicht.get(i);
              }
              return totaal;
    }

    public void Add(Cijfer p, double w){
        cijfers.add(p);
        gewicht.add(w);
    }

}
