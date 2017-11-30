package Oefen_Visitor_Pattern;

/**
 * Created by sjard on 27-Nov-17.
 */
public class Main {

    public static void main(String[] args){
        Ship s = new Ship();
        ApolloShip a = new ApolloShip();
        Comet c = new Comet();
        IceComet i = new IceComet();

        c.collide(s);
        i.collide(s);
        c.collide(a);
        i.collide(a);
    }
}
