package StatePattern;

public class StopState implements State{

    public void doAction(TvContext context) {
        System.out.println("TV is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
