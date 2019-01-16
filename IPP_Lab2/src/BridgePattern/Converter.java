package BridgePattern;

import BridgePattern.Exchange;

public class Converter extends Currency {

    private int currency;

    public Converter(int currency, Exchange exchange) {
        super(exchange);
        this.currency = currency;
    }

    @Override
    public void show() {
        exchange.convertValue(currency);
    }
}
