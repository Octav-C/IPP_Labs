package BridgePattern;

import BridgePattern.Exchange;

public abstract class Currency {

    protected Exchange exchange;

    public Currency(Exchange exchange) {
        this.exchange = exchange;
    }

    public abstract void show();
}