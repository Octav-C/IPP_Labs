package BridgePattern;

import static java.lang.System.out;

public class ConvertUSD implements Exchange {

    int usd = 17; // lei;

    @Override
    public void convertValue(int cash) {

        out.println( + cash + " USD = " + (cash * usd) + " Lei");
    }
}
