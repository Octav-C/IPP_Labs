package FactoryMethod;

public class PixelXL implements IPixel {

    public PixelXL() {
        SetName();
        SetScreenSize();
    }

    @Override
    public void SetName() {
        System.out.println("Name is PixelXL");
    }

    @Override
    public void SetScreenSize() {
        System.out.println("Screen 5.5 Inches\"");
    }
}
