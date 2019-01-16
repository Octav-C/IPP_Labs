package BridgePattern;

import static java.lang.System.out;

public class ConvertEUR implements Exchange {

    int eur = 20; // lei;

    @Override
    public void convertValue(int cash) {

        out.println( + cash + " Euro = " + (cash * eur) + " Lei");
    }
}