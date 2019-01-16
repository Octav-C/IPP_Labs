package StrategyPattern;

public class TVpost3 implements Strategy{
    @Override
    public String TvShow(int buttonNumber) {
        return "\tPublika TV";
    }
}
