package Oefen_Visitor_Pattern;

/**
 * Created by sjard on 27-Nov-17.
 */
public class IceComet extends Comet {
    public void getDescription(){
        System.out.println( "I am Icy");
    }
    public void collide(Ship s){
        System.out.println("Ice hit Shippy");
    }
    public void collide(ApolloShip ap){
        System.out.println("Icy hit Apolly");
    }
}
