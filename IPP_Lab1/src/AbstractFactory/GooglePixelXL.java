package AbstractFactory;

public class GooglePixelXL implements BigVersion {
    public GooglePixelXL()
    {
        BuildBigScreen();
        BuildBigBattery();
    }
    @Override
    public void BuildBigScreen() {
        System.out.print("Has been built PixelXL phone with big screen\n");
    }

    @Override
    public void BuildBigBattery() {
        System.out.print("Has been built PixelXL phone with big battery\n");
    }
}