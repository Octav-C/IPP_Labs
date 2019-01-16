package CommandPattern;

public class IsNotConnecting implements Command{
    private TV tv;

    public IsNotConnecting(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.disconnect();
    }
}
