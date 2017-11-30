package Oefen_Visitor_Pattern;

/**
 * Created by sjard on 27-Nov-17.
 */
public class Comet {
    public void getDescription(){
        System.out.println( "I am Rocky");
    }
    public void collide(Ship s){
        System.out.println( "Rock hit Shippy");
    }
    public void collide(ApolloShip ap){
        System.out.println( "Rock hit Apolly");
    }
}
