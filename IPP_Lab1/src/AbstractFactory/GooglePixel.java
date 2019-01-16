package AbstractFactory;

public class GooglePixel implements SmallVersion {

    public GooglePixel() {
        BuildSmallScreen();
        BuildSmallBattery();
    }

    @Override
    public void BuildSmallScreen() {
        System.out.print("Has been built Pixel phone with small screen\n");
    }

    @Override
    public void BuildSmallBattery() {
        System.out.print("Has been built Pixel phone with small battery\n");
    }
}