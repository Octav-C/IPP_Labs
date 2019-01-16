package ObserverPattern;

import java.util.List;

public class TvViewer implements IObserver{
    private String name;
    IObservable channel;

    public TvViewer(String name, IObservable channel) {
        this.name = name;
        this.channel = channel;
        channel.RegisterObserver(this);
    }

    @Override
    public void Update(Object ob) {
        List<String> channels = (List<String>)ob;
        System.out.println(name + " is the viewer who watches the television "+ channel.getName()+" channel: "+channels.get(channels.size()-1));
    }
}
