package StrategyPattern;

public class TVpost1 implements Strategy{
    @Override
    public String TvShow(int buttonNumber) {
        return "\tPrime TV";
    }
}
