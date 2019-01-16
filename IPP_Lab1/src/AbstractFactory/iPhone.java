package AbstractFactory;

public class iPhone implements SmallVersion {

    public iPhone() {
        BuildSmallScreen();
        BuildSmallBattery();
    }
    @Override
    public void BuildSmallScreen() {
        System.out.print("Has been built (AbstractFactory) iPhone with small screen\n");
    }

    @Override
    public void BuildSmallBattery() {
        System.out.print("Has been built (AbstractFactory) iPhone with small battery\n");
    }
}