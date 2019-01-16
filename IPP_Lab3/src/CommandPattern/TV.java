package CommandPattern;

public class TV {
    private int volum = 0;

    public void connect() {
        volum += 10;
        System.out.print("TV connected, ");
        System.out.println("Volume: " + volum);
    }

    public void disconnect() {
        volum -= 5;
        System.out.print("TV disconnected, ");
        System.out.println("Volume: " + volum);
    }
}
