package CommandPattern;

public class IsConnecting implements Command{
    private TV tv;

    public IsConnecting(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.connect();
    }
}
