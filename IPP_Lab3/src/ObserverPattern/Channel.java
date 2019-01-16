package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IObservable{
    private List<String> channels;
    private String name;
    private List<IObserver> observers;

    public String getName() {
        return name;
    }

    public Channel(String name) {
        channels = new ArrayList<>();
        observers = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void RegisterObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void NotifyObservers() {
        for (IObserver o: observers) {
            o.Update(channels);
        }
    }
    public void activity(){
        channels.add("National Geographic");
        channels.add("Discovery");
        NotifyObservers();
    }
}
