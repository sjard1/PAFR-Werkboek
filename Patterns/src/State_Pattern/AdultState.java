package State_Pattern;

/**
 * Created by sjard on 26-Nov-17.
 */
public class AdultState implements LifeState {
    @Override
    public void DoSomething(Context c) {
        System.out.println("Adultstate");
    }
}
