package CommandPattern;

public class Switch {
    private Command connect;
    private Command disconnect;

    public Switch(Command connect, Command disconnect) {
        this.connect = connect;
        this.disconnect = disconnect;
    }

    public void Connect() {
        connect.execute();
    }

    public void Disconnect() {
        disconnect.execute();
    }
}
