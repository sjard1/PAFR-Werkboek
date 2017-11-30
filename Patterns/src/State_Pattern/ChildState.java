package State_Pattern;

/**
 * Created by sjard on 26-Nov-17.
 */
public class ChildState implements LifeState {
    @Override
    public void DoSomething(Context c) {
        System.out.println("kind state");
        c.setState(new AdultState());
    }
}
