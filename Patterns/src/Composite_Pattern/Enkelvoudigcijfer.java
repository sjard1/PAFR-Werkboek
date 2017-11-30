package Composite_Pattern;

/**
 * Created by sjard on 27-Nov-17.
 */
public class Enkelvoudigcijfer implements Cijfer {

    int cijfer;
    public Enkelvoudigcijfer(int i){
        this.cijfer = i;
    }

    @Override
    public double BerekenCijfer() {
        return this.cijfer;

    }
}
