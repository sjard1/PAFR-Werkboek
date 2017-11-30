package State_Pattern;

/**
 * Created by sjard on 26-Nov-17.
 */
public class Context  {
    LifeState state;

    public Context(LifeState k){
        this.state = k;
    }
    public void setState(LifeState state){

        this.state = state;

    }

    public void DoSomething(){
        state.DoSomething(this);
    }
}
