import ChainOfResponsibilityPattern.FilmHandler;
import ChainOfResponsibilityPattern.MusicHandler;
import ChainOfResponsibilityPattern.SportHandler;
import ChainOfResponsibilityPattern.Viewer;
import CommandPattern.*;

import ObserverPattern.Channel;
import ObserverPattern.IObservable;
import ObserverPattern.TvViewer;
import StatePattern.StartState;
import StatePattern.StopState;
import StatePattern.TvContext;
import StrategyPattern.RemoteDevice;
import StrategyPattern.TVpost1;
import StrategyPattern.TVpost2;
import StrategyPattern.TVpost3;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Command Pattern ---");
        TV tv = new TV();
        Command connectCommand = new IsConnecting(tv);
        Command disconnectCommand = new IsNotConnecting(tv);
        Switch tvSwitching = new Switch(connectCommand, disconnectCommand);
        tvSwitching.Connect();
        tvSwitching.Disconnect();
        System.out.print("\n");

        System.out.println("--- State Pattern ---");
        TvContext context = new TvContext();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
        System.out.print("\n");

        System.out.println("--- Strategy Pattern ---");
        RemoteDevice remoteDevice = new RemoteDevice(new TVpost1());
        System.out.println("TV presents:" + remoteDevice.executeStrategy(1));
        remoteDevice = new RemoteDevice(new TVpost2());
        System.out.println("TV presents:" + remoteDevice.executeStrategy(2));
        remoteDevice = new RemoteDevice(new TVpost3());
        System.out.println("TV presents:" + remoteDevice.executeStrategy(3));
        System.out.print("\n");

        System.out.println("--- Chain of Responsibility Pattern ---");
        Viewer viewer = new Viewer(false,true,false);
        MusicHandler music = new MusicHandler();
        SportHandler sport = new SportHandler();
        FilmHandler film = new FilmHandler();
        film.setSuccesor(sport);
        sport.setSuccesor(music);
        film.Handle(viewer);
        System.out.print("\n");

        System.out.println("--- Observer Pattern ---");
        IObservable channel = new Channel("documentary");
        TvViewer viewer1 = new TvViewer("Victor", channel);
        TvViewer viewer2= new TvViewer("Andrei", channel);
        channel.activity();
    }
}
