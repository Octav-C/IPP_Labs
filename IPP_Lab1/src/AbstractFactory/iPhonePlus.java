package AbstractFactory;

public class iPhonePlus implements BigVersion {

    public iPhonePlus() {
        BuildBigScreen();
        BuildBigBattery();
    }

    @Override
    public void BuildBigScreen() {
        System.out.print("Has been built (AbstractFactory) iPhonePlus with big screen\n");
    }

    @Override
    public void BuildBigBattery() {
        System.out.print("Has been built (AbstractFactory) iPhonePlus with big battery\n"); }
}