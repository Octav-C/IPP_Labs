package StrategyPattern;

public class RemoteDevice {
    private Strategy strategy;

    public RemoteDevice(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(int buttonNumber) {
        return strategy.TvShow(buttonNumber);
    }
}
