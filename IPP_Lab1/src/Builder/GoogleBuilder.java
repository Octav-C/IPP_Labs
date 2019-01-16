package Builder;

import Singleton.GoogleSingleton;

public class GoogleBuilder extends PhoneBuilder  {

    public GoogleBuilder() {
        Pixel = new Pixel();
    }

    @Override
    public void BuildScreen() {
        Pixel.PhoneItems.add("Pixel Screen");
    }

    @Override
    public void BuildCamera() {
        Pixel.PhoneItems.add("Pixel Camera");
    }

    @Override
    public void BuildTouchID() {
        Pixel.PhoneItems.add("Pixel TouchID");
    }
}
