package State_Pattern;

/**
 * Created by sjard on 27-Nov-17.
 */
public class Main {
    public static void main(String[] args){
        Context c = new Context(new AdultState());
        c.DoSomething();
        c.setState(new ChildState());
        c.DoSomething();
    }
}
