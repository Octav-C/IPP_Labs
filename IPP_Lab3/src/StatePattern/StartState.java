package StatePattern;

public class StartState implements State{

    public void doAction(TvContext context) {
        System.out.println("TV is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
