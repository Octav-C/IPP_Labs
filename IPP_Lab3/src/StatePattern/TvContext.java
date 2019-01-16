package StatePattern;

public class TvContext {
    private State state;

    public TvContext(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
