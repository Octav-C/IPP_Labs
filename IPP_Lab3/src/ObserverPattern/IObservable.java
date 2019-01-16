package ObserverPattern;

public interface IObservable {
    public String getName();
    public void RegisterObserver(IObserver o);
    public void RemoveObserver(IObserver o);
    public void NotifyObservers();
    public void activity();
}
